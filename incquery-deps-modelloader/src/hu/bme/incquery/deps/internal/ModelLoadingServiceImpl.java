package hu.bme.incquery.deps.internal;

import hu.bme.incquery.deps.cp3model.Cp3modelPackage;
import hu.bme.incquery.deps.modelloader.RepoModelLoadingService;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
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
			String file; 
			file = obtainFile(targetProjects);
			result = resourceSet.createResource(URI.createURI(file));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	private String obtainFile(List<String> projects) throws Exception {
		// Obtain remote URI
		Object resultObject = Activator.getDefault().getDependencyService().getCompactedServerModelFor(projects);
		
		if (!(resultObject instanceof String)) {
			throw new RuntimeException("DependencyService should return a location string");
		}
		
		String result = (String) resultObject;

		return result;
	}


	@SuppressWarnings("all")
	public Map loadOptions(Resource resource) {
		Map loadOptions = ((XMLResourceImpl) resource).getDefaultLoadOptions();
		((XMLResourceImpl) resource).setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
		loadOptions.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl());
		loadOptions.put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, new HashMap());
		return loadOptions;
	}
}
