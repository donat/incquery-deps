/*
 * File VisitorBuilder.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 26, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.structurals;

import org.eclipse.core.resources.IWorkspaceRoot;

import cern.devtools.depanalysis.javamodel.Workspace;
import cern.devtools.depanalysis.modelfinder.combinators.TopDown;
import cern.devtools.depanalysis.modelfinder.simplevisitors.EmfDepBuilder;
import cern.devtools.depanalysis.modelfinder.simplevisitors.EmfStructureBuilder;

public class VisitorBuilder {

	public static Workspace traverseAllWorkspaceItems(IWorkspaceRoot jdtWsRoot) {
		EmfStructureBuilder builder = EmfStructureBuilder.newInstance();
		TopDown traverse = TopDown.newInstance(builder);
		traverse.visitWorkspaceRoot(new WorkspaceRootWrapper(jdtWsRoot));
		
		
		EmfDepBuilder dependenciues = new EmfDepBuilder(builder.getEmfModel());
		traverse = TopDown.newInstance(dependenciues);
		traverse.visitWorkspaceRoot(new WorkspaceRootWrapper(jdtWsRoot));
		
		
		return builder.getEmfModel();
		
	}
}
