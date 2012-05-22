/*
 * File ModelPrinterListener.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at 22 May 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder;

import cern.devtools.depanalysis.javamodel.ApiClass;
import cern.devtools.depanalysis.javamodel.Field;
import cern.devtools.depanalysis.javamodel.Method;
import cern.devtools.depanalysis.javamodel.Project;
import cern.devtools.depanalysis.javamodel.Workspace;

public class ModelPrinterListener implements ModelChangeListener {

	@Override
	public void workspaceChanged(Workspace newWs) {
		for (Project p : newWs.getProjects()) {
			System.out.println(p);
			for (ApiClass ac : p.getClasses()) {
				System.out.println("\t" + ac);
				for (Method m : ac.getMethods()) {
					System.out.println("\t\t" + m);
				}
				for (Field f : ac.getFields()) {
					System.out.println("\t\t" + f);
				}
			}
		}
	}
}
