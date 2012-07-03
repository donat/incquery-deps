/*
 * File VisitorBuilder.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 26, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.combinators;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.jdt.core.IJavaElement;

import cern.devtools.depanalysis.javamodel.Workspace;
import cern.devtools.depanalysis.modelfinder.simplevisitors.EmfDependencyAdder;
import cern.devtools.depanalysis.modelfinder.simplevisitors.EmfDependencyRemover;
import cern.devtools.depanalysis.modelfinder.simplevisitors.EmfOutgoingDepRemover;
import cern.devtools.depanalysis.modelfinder.simplevisitors.EmfStructureAdder;
import cern.devtools.depanalysis.modelfinder.simplevisitors.EmfStructureRemover;
import cern.devtools.depanalysis.modelfinder.structurals.WorkspaceItemAdapter;
import cern.devtools.depanalysis.modelfinder.structurals.WorkspaceRootWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.WsItemWrapper;

public class Traversals {

	public static Workspace extractFullEmfModel(IWorkspaceRoot jdtWsRoot) {
		// Build basic structure.
		EmfStructureAdder builder = EmfStructureAdder.newInstance();
		TopDown traverse = TopDown.newInstance(builder);
		traverse.visitWorkspaceRoot(new WorkspaceRootWrapper(jdtWsRoot));

		// Search for dependencies.
		EmfDependencyAdder dependenciues = EmfDependencyAdder.newInstance(builder.getEmfModel());
		traverse = TopDown.newInstance(dependenciues);
		traverse.visitWorkspaceRoot(new WorkspaceRootWrapper(jdtWsRoot));

		// Return the EMF instance model.
		return builder.getEmfModel();
	}

	public static void addJdtElemToEmfModel(Workspace workspace, IJavaElement jdtElem) {
		WsItemWrapper items = WorkspaceItemAdapter.adapt(jdtElem);
		if (items == null) {
			return;
		}

		items.accept(EmfStructureAdder.newInstance(workspace));
		items.accept(EmfDependencyAdder.newInstance(workspace));
	}
	
	public static void removeJdtElemFromEmfModel(Workspace workspace, IJavaElement jdtElem) {
		WsItemWrapper items = WorkspaceItemAdapter.adapt(jdtElem);
		if (items == null) {
			return;
		}
		
		items.accept(EmfDependencyRemover.newInstance(workspace));
		items.accept(EmfStructureRemover.newInstance(workspace));
	}
	
	
	public static void updateDependencies(Workspace workspace, IJavaElement jdtElem) {
		WsItemWrapper items = WorkspaceItemAdapter.adapt(jdtElem);
		if (items == null) {
			return;
		}
		
		items.accept(DownOneLevel.newInstance(EmfOutgoingDepRemover.newInstance(workspace)));
		items.accept(DownOneLevel.newInstance(EmfDependencyAdder.newInstance(workspace)));
	}
	
}
