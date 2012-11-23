package hu.bme.incquery.deps.internal;

import hu.bme.incquery.deps.cp3model.Cp3modelPackage;
import hu.bme.incquery.deps.modelloader.RepoModelLoadingService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

public class ModelLoadingServiceImpl implements RepoModelLoadingService {
	private final ResourceSet resourceSet;
	private Resource resource;

	public ModelLoadingServiceImpl() {
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("cp3model", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(Cp3modelPackage.eNS_URI, Cp3modelPackage.eINSTANCE);
	}

	public Resource getUnloadedResource(List<String> targetProjects) {
		Resource result = null;
		try {
			String file; file = obtainFile(targetProjects);
			result = resourceSet.createResource(URI.createURI("file://" + file));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	private String obtainFile(List<String> projects) throws Exception {
		// Obtain remote URI
		Object result = Activator.getDefault().getDependencyService().getCompactedServerModelFor(projects);
		if (!(result instanceof java.net.URI)) {
			throw new RuntimeException("DependencyService should return a resource URI");
		}
		java.net.URI resultURI = (java.net.URI) result;

		// Check if the URI does not point to a local file
		if (!resultURI.getScheme().equals("file")) {
			throw new UnsupportedOperationException("Processing scheme " + resultURI.getScheme()
					+ " is not supported yet");
		}

		// Retrieve file
		return resultURI.getSchemeSpecificPart();
	}

	@Override
	@SuppressWarnings("all")
	public Map<?, ?> loadOptions() {
		@SuppressWarnings("rawtypes")
		Map loadOptions = //((XMLResourceImpl) resource).getDefaultLoadOptions();
		new HashMap();
		loadOptions.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl());
		loadOptions.put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, new HashMap());
		return loadOptions;
	}
}
