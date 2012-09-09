package hu.bme.incquery.deps.core;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.MatcherFactoryRegistry;

import hu.bme.incquery.deps.cp1model.Cp1modelPackage;
import hu.bme.incquery.deps.wsmodel.WWorkspace;
import hu.bme.incquery.deps.wsmodel.WsmodelPackage;

public class IncQueryDepsEngine {

	private ResourceSet resourceSet;
	private Resource wsModelResource;
	private Set<IncQueryMatcher<?>> matchers = new HashSet<IncQueryMatcher<?>>();
	Set<IncQueryDepsChangeListener> listeners = new HashSet<IncQueryDepsChangeListener>();
	
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
		
		try {
			retrieveRepoModel();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Init the internal incquery engine lazily.
	 * @throws IncQueryException 
	 */
	public void initialize() throws IncQueryException {
		Set<IMatcherFactory<?>> patternGroup = MatcherFactoryRegistry.getPatternGroup("cern.devtools.deps.query.cp1");
		for (IMatcherFactory<?> factory : patternGroup) {
			matchers.add(factory.getMatcher(resourceSet));
		}
		
		
		//IncQueryMatcher matcher = factory.getMatcher(resourceSet);
	}

	public void setWorkspaceModel(WWorkspace workspace) {
		wsModelResource.getContents().clear();
		wsModelResource.getContents().add(workspace);
		update();
	}

	public void update() {
		for (IncQueryDepsChangeListener l : listeners) {
			l.matchesChanged(matchers);
		}

	}

	private Resource retrieveRepoModel() throws IOException {
		// TODO: create a server process to access the repository model.
		Resource res = resourceSet.createResource(URI.createURI("http://localhost/incquery-deps/visitor.cp1model"));
		res.load(Collections.EMPTY_MAP);
		return res;

	}

	public void registerChangeListener(IncQueryDepsChangeListener incQueryDepsChangeListener) {
		listeners.add(incQueryDepsChangeListener);
		
	}
}
