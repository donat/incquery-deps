/*
 * File EventHandler.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jul 3, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder;

import java.util.List;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;

import cern.devtools.depanalysis.javamodel.Workspace;

public class IncrementalWsModelBuilder {

	private Workspace workspace;
	
	private final JobUtils jobHelper;

	private final WsChangeListenerRepo listenerRepo;

	public IncrementalWsModelBuilder(WsChangeListenerRepo listenerRepo) {
		this.listenerRepo = listenerRepo;
		this.jobHelper = new JobUtils();
		buildWorkspaceModel();
	}
	
	
	
	private void buildWorkspaceModel() {
		Job buildWsJob = new Job("Build workspace EMF model") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				workspace = doBuildWorkspaceModel();
				listenerRepo.notifyInit(workspace);
				return JobUtils.okStatus("Gathering Workspace Emf model was successful");
			}
		};
		
		jobHelper.schedule(buildWsJob);
	}
	
	public void rebuildWorkspaceModel() {
		Job rebuildWsJob = new Job("ReBuild workspace EMF model") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				workspace = doBuildWorkspaceModel();
				listenerRepo.notifyRevovery(workspace);
				return JobUtils.okStatus("Recreating Workspace Emf model was successful");
			}
		};
		
		jobHelper.schedule(rebuildWsJob);
	}
	
	public void updateWorkspaceModel(final WsChangeType type, final Object... params) {
		Job updateWsJob = new Job("Update workspace EMF model") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					doUpdate(type, params);
					return JobUtils.okStatus("Gathering Workspace Emf model was successful");
				}
				catch (Exception e) {
					workspace = doBuildWorkspaceModel();
					listenerRepo.notifyRevovery(workspace);
					return JobUtils.errorStatus("Updating EMF model failed. Model reloaded.", e);
				}
			}
		};
		
		jobHelper.schedule(updateWsJob);
	}
	
	private void doUpdate(WsChangeType type, Object... params) throws CoreException {
		switch (type) {
		case ADD_PROJECT:
		case ADD_PACKAGE:
		case ADD_CLASS:
		case ADD_METHOD:
		case ADD_FIELD:
			WsModelBuilder.forModel(workspace).insertItem((IJavaElement) params[0]);
			break;
		case REMOVE_PROJECT:
		case REMOVE_PACKAGE:
		case REMOVE_CLASS:
		case REMOVE_METHOD:
		case REMOVE_FIELD:
			WsModelBuilder.forModel(workspace).removeItem((IJavaElement) params[0]);
			break;
		case UPDATE_COMPILATION_UNIT:
			List<IJavaElement> elemsToUpdate = JavaModelWalker.allUpdatableIn((ICompilationUnit)params[0]);
			for (IJavaElement toUpdate : elemsToUpdate) {
				WsModelBuilder.forModel(workspace).updateItem(toUpdate);
			}
			break;
		default:
			break;
		}
	}
	
	
	private Workspace doBuildWorkspaceModel() {
		IWorkspace jdtWorkspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot jdtWsRoot = jdtWorkspace.getRoot();
		return WsModelBuilder.fromScratch(jdtWsRoot).getWorkspace();
	}
}
