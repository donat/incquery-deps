package hu.bme.incquery.deps.transformer;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import hu.bme.incquery.deps.cp1model.Cp1modelPackage;
import hu.bme.incquery.deps.cp3model.CP3Project;
import hu.bme.incquery.deps.cp3model.CP3Repo;
import hu.bme.incquery.deps.cp3model.Cp3modelFactory;
import hu.bme.incquery.deps.cp3model.Cp3modelPackage;
import hu.bme.incquery.deps.repomodel.RProject;
import hu.bme.incquery.deps.repomodel.RRepository;
import hu.bme.incquery.deps.repomodel.RepomodelPackage;

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

public class TransformRepoModelToCP3Model {
	private ResourceSet resourceSet;
	private Resource inputResource;
	private Resource outputResource;
	private String inFile;
	private String outFile;
	
	private long id = 0l;

	private long nextId() {
		return ++id;
	}

	public TransformRepoModelToCP3Model(String inFile, String outFile) {
		this.inFile = inFile;
		this.outFile = outFile;
	}

	private void initResourceSet() {
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("repomodel", new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("cp3model", new XMIResourceFactoryImpl());

		EPackage.Registry.INSTANCE.put(RepomodelPackage.eNS_URI, RepomodelPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(Cp3modelPackage.eNS_URI, Cp3modelPackage.eINSTANCE);

		outputResource = resourceSet.createResource(URI.createFileURI(outFile));
	}

	@SuppressWarnings("all")
	private void loadInputModel() throws IOException {
		URI rUri = URI.createFileURI(inFile);
		inputResource = resourceSet.createResource(rUri);

		// Optimize default load opts
		Map loadOptions = ((XMLResourceImpl) inputResource).getDefaultLoadOptions();
		loadOptions.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.FALSE);
		loadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.FALSE);
		loadOptions.put(XMLResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl());
		loadOptions.put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, new HashMap());
		((ResourceImpl) inputResource).setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());

		inputResource.load(Collections.EMPTY_MAP);
	}

	private void convertModel() {
		CP3Repo root = Cp3modelFactory.eINSTANCE.createCP3Repo();
		RRepository rRepository = (RRepository) inputResource.getContents().get(0);
		
		for (RProject rProject : rRepository.getRProjects()) {
			CP3Project project = Cp3modelFactory.eINSTANCE.createCP3Project();
			project.setId(nextId());
			project.setName(rProject.getName());
			root.getItems().add(project);
		}
		
		outputResource.getContents().add(root);
	}

	private void saveOoutput() throws IOException {
		outputResource.save(Collections.EMPTY_MAP);
	}

	public void transform() throws IOException {
		long t1 = System.currentTimeMillis();
		initResourceSet();
		long t2 = System.currentTimeMillis();
		loadInputModel();
		long t3 = System.currentTimeMillis();
		System.err.println("Model load took " + (t3 - t2) / 1000 + " seconds.");
		convertModel();
		long t4 = System.currentTimeMillis();
		System.err.println("Model transformation took " + (t4 - t3) / 1000 + " seconds.");
		saveOoutput();
		long t5 = System.currentTimeMillis();
		System.err.println("Save output took " + (t5 - t4) / 1000 + " seconds.");
	}

	public static void main(String[] args) throws IOException {
		new TransformRepoModelToCP3Model(
				"C:/opt/workspace/eclipse4/incquery-deps/incquery-deps-transformer/models/visitor.repomodel",
				"C:/opt/workspace/eclipse4/incquery-deps/incquery-deps-transformer/models/visitor.cp3model")
				.transform();
		
		new TransformRepoModelToCP3Model(
				"C:/opt/workspace/eclipse4/incquery-deps/incquery-deps-transformer/models/commonbuild-full-pro.repomodel",
				"C:/opt/workspace/eclipse4/incquery-deps/incquery-deps-transformer/models/commonbuild-full-pro.cp3model")
				.transform();
	}

}
