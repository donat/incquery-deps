package hu.bme.incquery.deps.engine;

import hu.bme.incquery.deps.core.Activator;
import hu.bme.incquery.deps.core.PreferenceStore;
import hu.bme.incquery.deps.core.WsChangeEventListener;
import hu.bme.incquery.deps.cp3model.Cp3modelPackage;
import hu.bme.incquery.deps.modelloader.RepoModelLoadingService;
import hu.bme.incquery.deps.pub.IncQueryDepsChangeListener;
import hu.bme.incquery.deps.pub.IncQueryDepsRegistry;
import hu.bme.incquery.deps.wsmodel.WWorkspace;
import hu.bme.incquery.deps.wsmodel.WsmodelPackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.swt.widgets.Display;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.MatcherFactoryRegistry;
import org.osgi.util.tracker.ServiceTracker;

import cern.devtools.deps.query.cp3.addedmethods.AddedMethodsMatcher;

public class IncQueryDepsEngine implements IncQueryDepsRegistry {

	private ResourceSet resourceSet;
	private Resource wsModelResource;
	private Set<IncQueryMatcher<IPatternMatch>> matchers = new HashSet<IncQueryMatcher<IPatternMatch>>();

	Collection<IncQueryDepsChangeListener> listeners = new HashSet<IncQueryDepsChangeListener>();

	private volatile boolean init = false;

	public IncQueryDepsEngine() {
		// Init resource set.
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("wsmodel", new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("cp3model", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(WsmodelPackage.eNS_URI, WsmodelPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(Cp3modelPackage.eNS_URI, Cp3modelPackage.eINSTANCE);
		wsModelResource = resourceSet.createResource(URI.createFileURI("C:/tmp/visitor.wsmodel"));

	}

	/**
	 * Init the internal incquery engine lazily.
	 * 
	 * @return
	 * 
	 * @throws IncQueryException
	 */
	public Job getInitJob() throws IncQueryException {
		Job job = new Job("EMF IncQuery initialization") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					doInit(monitor);
					registerService();
					return new Status(IStatus.OK, Activator.PLUGIN_ID, "EMF IncQuery initialized successfully.");
				} catch (Exception e) {
					e.printStackTrace();
					return new Status(IStatus.ERROR, Activator.PLUGIN_ID,
							"Incquery deps did not initialize successfully.");
				}
			}
		};

		return job;
	}

	private void registerService() {
		final IncQueryDepsRegistry registry = this;
		
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				hu.bme.incquery.deps.engine.Activator.getDefault().getContext()
						.registerService(IncQueryDepsRegistry.class.getName(), registry, null);
			}
		});

	}

	@SuppressWarnings("all")
	private void doInit(IProgressMonitor monitor) throws Exception {
		// Start tasks.
		monitor.beginTask("Setup Incquery deps engine", 4);

		// Wait for the model to load.
		monitor.subTask("Wait for the repository model to get loaded");
		long loadStart = System.nanoTime();
		ServiceTracker tracker = hu.bme.incquery.deps.engine.Activator.getDefault().getModelLoaderServiceTracker();
		while (tracker.getService() == null) {
			Thread.sleep(200);
		}
		RepoModelLoadingService repoModelService = ((RepoModelLoadingService) tracker.getService());
		Resource repoResource = repoModelService.getUnloadedResource(PreferenceStore.getStore().tracedProjectNames());
		resourceSet.getResources().add(repoResource);
		monitor.worked(1);

		// Init and save the matcher objects
		monitor.subTask("Register pattern matchers in the registry");
		Set<IMatcherFactory<?>> patternGroup = MatcherFactoryRegistry.getPatternGroup("cern.devtools.deps.query.cp3");
		for (IMatcherFactory factory : patternGroup) {
			IncQueryMatcher matcher = factory.getMatcher(resourceSet);
			Collection allMatches = matcher.getAllMatches();
			matchers.add(matcher);
		}
		monitor.worked(1);

		// Register the enclosing (Engine) object to get updates for the workspace changes.
		monitor.subTask("Register listener for get updates about workspace changes.");
		hu.bme.incquery.deps.core.Activator.getDefault().getWsService()
				.registerWorkspaceListener(new WsChangeEventListener() {

					@Override
					public void init(WWorkspace resource) {
						hu.bme.incquery.deps.engine.Activator.getDefault().getIncQueryDepsEngine()
								.setWorkspaceModel(resource);
					}

					@Override
					public void recover(WWorkspace resource) {
						hu.bme.incquery.deps.engine.Activator.getDefault().getIncQueryDepsEngine()
								.setWorkspaceModel(resource);
					}

					@Override
					public void update(WWorkspace resource) {
						hu.bme.incquery.deps.engine.Activator.getDefault().getIncQueryDepsEngine()
								.setWorkspaceModel(resource);
					}
				});

		// Mark the engine as initialized.
		monitor.worked(1);

		// Load repo model.
		monitor.subTask("Load repository model.");
		System.out.println(repoResource);
		repoResource.load(repoModelService.loadOptions(repoResource));
		long loadEnd = System.nanoTime();
		System.err.println(" IncQuery init took " + (loadEnd - loadStart) / 1000000l + " miliseconds.");
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Used Memory:" + ((runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024)) + "MiB");

		for (IncQueryMatcher<?> matcher : matchers) {
			if (matcher instanceof AddedMethodsMatcher) {
				for (Object o : matcher.getAllMatches()) {
					System.out.println(o);
				}
			}
		}

		monitor.worked(1);
		monitor.done();
		init = true;
	}

	public void setWorkspaceModel(WWorkspace resource) {
		wsModelResource.getContents().clear();
		wsModelResource.getContents().add(resource);

		if (init) {
			update();
		}
	}

	public void update() {
		long start = System.nanoTime();
		for (IncQueryDepsChangeListener l : listeners) {
			l.matchesChanged(matchers);
		}
		long end = System.nanoTime();
		System.err.println("IncQuery update finished in " + (end - start) / 1000l + " microseconds.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hu.bme.incquery.deps.engine.IIncQueryDepsEngine#registerChangeListener(hu.bme.incquery.deps.pub.
	 * IncQueryDepsChangeListener, java.lang.Class)
	 */
	@Override
	public void registerChangeListener(IncQueryDepsChangeListener listener) {
		listener.init(matchers);
		listeners.add(listener);
	}
}
