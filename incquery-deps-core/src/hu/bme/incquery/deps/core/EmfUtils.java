/*
 * File EmfModelUtil.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jul 5, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package hu.bme.incquery.deps.core;

import hu.bme.incquery.deps.wsmodel.WNamedElement;
import hu.bme.incquery.deps.wsmodel.WWorkspace;
import hu.bme.incquery.deps.wsmodel.WsmodelPackage;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class EmfUtils {

	// public static String WS_MODEL_CACHE_LOC = "model_cache." + WsmodelPackage.eNAME;
	private static String cacheLocation;

	public static String printModel(WWorkspace ws) {
		StringBuffer buffer = new StringBuffer();
		return printModel(ws.getProjects(), "", buffer);
	}

	@SuppressWarnings("unchecked")
	private static String printModel(Collection<? extends WNamedElement> cne, String indent, StringBuffer buffer) {
		for (WNamedElement ne : cne) {
			buffer.append(indent);
			buffer.append(ne);
			buffer.append("\n");
			printModel(ne.getChildren(), indent + "  ", buffer);
		}

		return buffer.toString();
	}

	private static String getCacheFile() {
		if (cacheLocation == null) {
			cacheLocation = ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile().getAbsolutePath()
					+ "/model_cache." + WsmodelPackage.eNAME;
		}
		return cacheLocation;
	}

	public static void saveModel(WWorkspace ws) throws IOException {
		// check fileName extension.
		if (!getCacheFile().endsWith(WsmodelPackage.eNAME)) {
			throw new IOException(String.format("File %s does not have a proper extension: %s.", getCacheFile(),
					WsmodelPackage.eNAME));
		}

		// Store information to file.
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		// URI fileURI = URI.createFileURI(new File(path).getAbsolutePath());
		URI fileURI = URI.createFileURI(getCacheFile());
		Resource resource = resourceSet.createResource(fileURI);
		resource.getContents().add(ws);
		resource.save(Collections.EMPTY_MAP);
		System.out.println("Workspace model saved");

		// Save when the save happened.
		PreferenceStore.getStore().setCacheModTime(System.currentTimeMillis());
	}

	public static WWorkspace loadModel() {
		try {
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
			URI fileURI = URI.createFileURI(getCacheFile());
			Resource resource = resourceSet.createResource(fileURI);
			resource.load(Collections.EMPTY_MAP);
			return (WWorkspace) resource.getContents().get(0);
		} catch (IOException e) {
			// On error, delete the file and throw a new IOException.
			new File(getCacheFile()).delete();
			return null;
		}
	}
}
