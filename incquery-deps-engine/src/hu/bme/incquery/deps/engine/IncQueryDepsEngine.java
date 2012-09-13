package hu.bme.incquery.deps.engine;

import hu.bme.incquery.deps.core.Activator;
import hu.bme.incquery.deps.cp1model.Cp1modelPackage;
import hu.bme.incquery.deps.wsmodel.WWorkspace;
import hu.bme.incquery.deps.wsmodel.WsmodelPackage;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
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
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.MatcherFactoryRegistry;

public class IncQueryDepsEngine {

	private ResourceSet resourceSet;
	private Resource wsModelResource;
	private Set<IncQueryMatcher<?>> matchers = new HashSet<IncQueryMatcher<?>>();
	Set<IncQueryDepsChangeListener> listeners = new HashSet<IncQueryDepsChangeListener>();

	private boolean init = false;

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

		Job job = new Job("retrieve repo model") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					retrieveRepoModel();
				} catch (IOException e) {
					e.printStackTrace();
				}

				init = true;
				return new Status(IStatus.OK, Activator.PLUGIN_ID, "repo model loaded");
			}
		};

		job.schedule();
	}

	/**
	 * Init the internal incquery engine lazily.
	 * 
	 * @throws IncQueryException
	 */
	public void initialize() throws IncQueryException {
		Set<IMatcherFactory<?>> patternGroup = MatcherFactoryRegistry.getPatternGroup("cern.devtools.deps.query.cp1");
		for (IMatcherFactory<?> factory : patternGroup) {
			matchers.add(factory.getMatcher(resourceSet));
		}
	}

	public void setWorkspaceModel(WWorkspace resource) {
		wsModelResource.getContents().clear();
		wsModelResource.getContents().add(resource);
		update();

	}

	public void update() {

		if (init) {
			for (IncQueryDepsChangeListener l : listeners) {
				l.matchesChanged(matchers);
			}
		}

	}

	@SuppressWarnings("all")
	private Resource retrieveRepoModel() throws IOException {
		// TODO: create a server process to access the repository model.
		Resource resource = resourceSet.createResource(URI
				.createURI("file://c:/wamp/www/incquery-deps/visitor.cp1model"));

		Map loadOptions = ((XMLResourceImpl) resource).getDefaultLoadOptions();
		loadOptions.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl());
		loadOptions.put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, new HashMap());

		((ResourceImpl) resource).setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());

		resource.load(loadOptions);
		return resource;

	}

	public void registerChangeListener(IncQueryDepsChangeListener incQueryDepsChangeListener) {
		listeners.add(incQueryDepsChangeListener);
	}
}
