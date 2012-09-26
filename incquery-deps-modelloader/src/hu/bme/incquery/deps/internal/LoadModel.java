package hu.bme.incquery.deps.internal;

import hu.bme.incquery.deps.cp1model.Cp1modelPackage;
import hu.bme.incquery.deps.modelloader.RepoModelLoadingService;

import java.util.HashMap;
import java.util.Map;

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
import org.osgi.framework.BundleContext;

public class LoadModel implements RepoModelLoadingService {
	private final ResourceSet resourceSet;
	private final BundleContext context;
	private Resource resource;

	public LoadModel(BundleContext context) {
		this.context = context;
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("cp1model", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(Cp1modelPackage.eNS_URI, Cp1modelPackage.eINSTANCE);
	}

	public Job load() {
		final LoadModel serviceInstance = this;
		Job job = new Job("Downloading repository model") {

			protected IStatus run(IProgressMonitor monitor) {
				try {
					long ms = System.currentTimeMillis();
					doLoad();
					context.registerService(RepoModelLoadingService.class.getName(), serviceInstance, null);
					System.out.println(String.format("Model loaded. Execution took %s seconds.", ((System.currentTimeMillis() - ms) / 1000l)));
				} catch (Exception e) {
					e.printStackTrace();
				}
				return new Status(IStatus.OK, Activator.PLUGIN_ID, "repo model loaded");
			}
		};

		return job;
	}

	@SuppressWarnings("unchecked")
	private void doLoad() throws Exception {
		resource = resourceSet.createResource(URI
				.createURI("file://c:/wamp/www/incquery-deps/visitor.cp1model"));

		Map loadOptions = ((XMLResourceImpl) resource).getDefaultLoadOptions();
		loadOptions.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl());
		loadOptions.put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, new HashMap());

		((ResourceImpl) resource).setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());

		resource.load(loadOptions);
	}
	
	@Override
	public Resource getResource() {
		return resource;
	}
}
