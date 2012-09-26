package hu.bme.incquery.deps.engine;

import hu.bme.incquery.deps.core.Activator;
import hu.bme.incquery.deps.core.WsChangeEventListener;
import hu.bme.incquery.deps.cp1model.Cp1modelPackage;
import hu.bme.incquery.deps.modelloader.RepoModelLoadingService;
import hu.bme.incquery.deps.wsmodel.WWorkspace;
import hu.bme.incquery.deps.wsmodel.WsmodelPackage;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.MatcherFactoryRegistry;
import org.osgi.util.tracker.ServiceTracker;

import cern.devtools.deps.query.cp1.projectswithsamename.ProjectsWithSameNameMatcher;

public class IncQueryDepsEngine {

	private ResourceSet resourceSet;
	private Resource wsModelResource;
	private Set<IncQueryMatcher<IPatternMatch>> matchers = new HashSet<IncQueryMatcher<IPatternMatch>>();

	Map<String, Collection<IncQueryDepsChangeListener>> listenerMap = new HashMap<String, Collection<IncQueryDepsChangeListener>>();

	private volatile boolean init = false;

	public IncQueryDepsEngine() {
		// Init resource set.
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("wsmodel", new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("cp1model", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(WsmodelPackage.eNS_URI, WsmodelPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(Cp1modelPackage.eNS_URI, Cp1modelPackage.eINSTANCE);
		wsModelResource = resourceSet.createResource(URI.createFileURI("C:/tmp/visitor.wsmodel"));

	}

	/**
	 * Init the internal incquery engine lazily.
	 * 
	 * @return
	 * 
	 * @throws IncQueryException
	 */
	@SuppressWarnings("unchecked")
	public Job getInitJob() throws IncQueryException {
		Job job = new Job("Downloading repository model") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					doInit(monitor);
					return new Status(IStatus.OK, Activator.PLUGIN_ID, "Incquery initialized successfully.");
				} catch (Exception e) {
					e.printStackTrace();
					return new Status(IStatus.ERROR, Activator.PLUGIN_ID,
							"Incquery deps did not initialize successfully.");
				}
			}
		};

		return job;
	}

	private void doInit(IProgressMonitor monitor) throws Exception {
		// Start tasks.
		monitor.beginTask("Setup Incquery deps engine", 3);
		
		// Wait for the model to load.
		monitor.subTask("Wait for the repository model to get loaded");
		ServiceTracker tracker = hu.bme.incquery.deps.engine.Activator.getDefault().getModelLoaderServiceTracker();
		while(tracker.getService() == null) {
			Thread.sleep(200);
		}
		RepoModelLoadingService repoModelService = ((RepoModelLoadingService)tracker.getService());
		resourceSet.getResources().add(repoModelService.getResource());
		monitor.worked(1);
		
		// Init and save the matcher objects 
		monitor.subTask("Register pattern matchers in the registry");
		Set<IMatcherFactory<?>> patternGroup = MatcherFactoryRegistry.getPatternGroup("cern.devtools.deps.query.cp1");
		for (IMatcherFactory factory : patternGroup) {
			IncQueryMatcher matcher = factory.getMatcher(resourceSet);
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
		
		// Mark the engine as initialised.
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
		for (IncQueryMatcher<IPatternMatch> matcher : matchers) {

			Collection<IncQueryDepsChangeListener> listeners = listenerMap.get(matcher.getClass().getName());

			if (matcher.getClass().getName().contains("ProjectsWithSameNameMatcher")) {
				System.out.println("");
			}

			if (listeners != null) {
				for (IncQueryDepsChangeListener listener : listeners) {
					listener.matchesChanged(matcher);
				}
			}
		}
	}

	public void registerChangeListener(IncQueryDepsChangeListener listener, Class... matcherClasses) {
		for (Class c : matcherClasses) {
			Collection<IncQueryDepsChangeListener> listeners = listenerMap.get(c.getName());
			if (listeners == null) {
				listenerMap.put(c.getName(), listeners = new LinkedList<IncQueryDepsChangeListener>());
			}

			listeners.add(listener);
		}
	}
}
