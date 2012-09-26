package hu.bme.incquery.deps.transformer;

import hu.bme.incquery.deps.cp1model.CP1Class;
import hu.bme.incquery.deps.cp1model.CP1CodeElement;
import hu.bme.incquery.deps.cp1model.CP1Dependency;
import hu.bme.incquery.deps.cp1model.CP1DependencyType;
import hu.bme.incquery.deps.cp1model.CP1Field;
import hu.bme.incquery.deps.cp1model.CP1Method;
import hu.bme.incquery.deps.cp1model.CP1Project;
import hu.bme.incquery.deps.cp1model.CP1Repository;
import hu.bme.incquery.deps.cp1model.Cp1modelFactory;
import hu.bme.incquery.deps.cp1model.Cp1modelPackage;
import hu.bme.incquery.deps.repomodel.RClass;
import hu.bme.incquery.deps.repomodel.RCodeElement;
import hu.bme.incquery.deps.repomodel.RDependency;
import hu.bme.incquery.deps.repomodel.RField;
import hu.bme.incquery.deps.repomodel.RMethod;
import hu.bme.incquery.deps.repomodel.RProject;
import hu.bme.incquery.deps.repomodel.RRepository;
import hu.bme.incquery.deps.repomodel.RepomodelPackage;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * Wrong: Dependency transformation does not work.
 * @author dcsikos
 *
 */
public class TransformRepoModelToCP1Model {

	private final String file;
	private ResourceSet resourceSet;
	private String outFile;

	private void setupResourceSet() {
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("repomodel", new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("cp1model", new XMIResourceFactoryImpl());

		EPackage.Registry.INSTANCE.put(RepomodelPackage.eNS_URI,
				RepomodelPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(Cp1modelPackage.eNS_URI,
				Cp1modelPackage.eINSTANCE);
	}

	public TransformRepoModelToCP1Model(String file, String outFile) {
		this.file = file;
		this.outFile = outFile;
		setupResourceSet();
	}

	private RRepository retrieveBigModel() throws IOException {
		URI rUri = URI.createFileURI(file);
		Resource resource = resourceSet.createResource(rUri);
		resource.load(Collections.EMPTY_MAP);
		return (RRepository) resource.getContents().get(0);
	}

	public void transform() throws IOException {
		RRepository repoModel = retrieveBigModel();
		Map<RCodeElement, CP1CodeElement> itemMap = new HashMap<RCodeElement, CP1CodeElement>(); 
		
		CP1Repository repo = Cp1modelFactory.eINSTANCE.createCP1Repository();
		long id = 0;

		for (RProject project : repoModel.getRProjects()) {
			
			// Add project
			CP1Project p = Cp1modelFactory.eINSTANCE.createCP1Project();
			p.setName(project.getName());
			p.setId(++id);
			repo.getProjects().add(p);
			

			for (RClass cls : project.getRClasses()) {
				// Add class
				CP1Class c = Cp1modelFactory.eINSTANCE.createCP1Class();
				c.setExtends(cls.getExtends());
				c.setId(++id);
				c.setImplements(cls.getImplements());
				c.setPackageName(cls.getPackageName());
				c.setSimpleName(cls.getSimpleName());
				p.getClasses().add(c);
				itemMap.put(cls, c);

				for (RMethod method : cls.getRMethods()) {
					CP1Method m = Cp1modelFactory.eINSTANCE.createCP1Method();
					m.setId(++id);
					m.setSignature(method.getSignature());
					c.getMethods().add(m);
					itemMap.put(method, m);
					
				}
				for (RField field : cls.getRFields()) {
					CP1Field f = Cp1modelFactory.eINSTANCE.createCP1Field();
					f.setId(++id);
					f.setSignature(field.getSignature());
					c.getFields().add(f);
					itemMap.put(field, f);
				}
			}
		}
		
		for (RDependency dependency : repoModel.getRDependencies()) {
			CP1Dependency d = Cp1modelFactory.eINSTANCE.createCP1Dependency();
			d.setFrom(itemMap.get(dependency.getRFrom()));
			d.setTo(itemMap.get(dependency.getRTo()));
			// TODO: this part does not work
			d.setType(CP1DependencyType.get(Integer.valueOf(dependency.getDepType()).toString()));
			repo.getDependencies().add(d);
		}

		Resource out = resourceSet.createResource(URI.createFileURI(outFile));
		out.getContents().add(repo);
		out.save(Collections.EMPTY_MAP);

	}

	public static void main(String[] args) throws IOException {
		long ms = System.currentTimeMillis();
		new TransformRepoModelToCP1Model(
				"C:/opt/workspace/github/incquery-deps/incquery-deps-transformer/models/visitor.repomodel",
				"C:/opt/workspace/github/incquery-deps/incquery-deps-transformer/models/visitor.cp1model")
				.transform();
		System.out.println(String.format("Model loaded. Execution took %s seconds.", ((System.currentTimeMillis() - ms) / 1000l)));
	}
}
