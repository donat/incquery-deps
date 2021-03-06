/*
 * File EventHandler.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jul 3, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package hu.bme.incquery.deps.core;

import hu.bme.incquery.deps.wsmodel.WWorkspace;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;

public class BuildScheduler {

	private WWorkspace workspace;

	private final JobUtils jobHelper;

	private final WsChangeListenerRepo listenerRepo;

	private final WorkspaceEventDispatcher dispatcher;

	public BuildScheduler(WsChangeListenerRepo listenerRepo, WorkspaceEventDispatcher dispatcher) {
		this.listenerRepo = listenerRepo;
		this.dispatcher = dispatcher;
		this.jobHelper = new JobUtils();
		buildWorkspaceModel();
	}

	private void buildWorkspaceModel() {
		Job buildWsJob = new Job("Build workspace EMF model") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				workspace = doBuildWorkspaceModel(dispatcher.getTracedProjects(), true);
				listenerRepo.notifyInit(workspace);
				return JobUtils.okStatus("Gathering Workspace Emf model was successful");
			}
		};

		jobHelper.schedule(buildWsJob);
	}

	public void rebuildWorkspaceModel(final List<IJavaProject> projects) {
		Job rebuildWsJob = new Job("ReBuild workspace EMF model") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				workspace = doBuildWorkspaceModel(projects, false);
				listenerRepo.notifyRecovery(workspace);
				return JobUtils.okStatus("Recreating Workspace Emf model was successful");
			}
		};

		jobHelper.schedule(rebuildWsJob);
	}

	public void updateWorkspaceModel(final IJavaElementDelta delta) {
		Job updateWsJob = new Job("Update workspace EMF model") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					doUpdate(delta);
					listenerRepo.notifyUpdate(workspace);
					return JobUtils.okStatus("Gathering Workspace Emf model was successful");
				} catch (Exception e) {
					workspace = doBuildWorkspaceModel(dispatcher.getTracedProjects(), false);
					listenerRepo.notifyRecovery(workspace);
					return JobUtils.errorStatus("Updating EMF model failed. Model reloaded.", e);
				}
			}
		};

		jobHelper.schedule(updateWsJob);
	}

	private void doUpdate(IJavaElementDelta delta) throws CoreException {
		WorkspaceModelBuilder.forModel(workspace).modifyModel(delta);
	}

	private WWorkspace doBuildWorkspaceModel(List<IJavaProject> projects, boolean tryCache) {
		if (tryCache) {
			WWorkspace loadCache = loadCache(projects);
			if (loadCache != null) {
				return loadCache;
			}
		}
		WWorkspace result = WorkspaceModelBuilder.fromScratch(dispatcher.getTracedProjects()).getWorkspace();
		return result;
	}

	private WWorkspace loadCache(List<IJavaProject> projects) {

		long workspaceTs = JdtUtils.classesLastModificationTime(projects);
		long cacheTs = PreferenceStore.getStore().getCacheModTime();
		if (cacheTs >= workspaceTs) {
			return EmfUtils.loadModel();
		}
		else return null;
	}

	public void addProject(final IJavaProject project) {
		Job newProjectJob = new Job("Add project to the traced ones") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					WorkspaceModelBuilder.forModel(workspace).addNewProject(project);
					return JobUtils.okStatus("New project added successfully");
				} catch (Exception e) {
					workspace = doBuildWorkspaceModel(dispatcher.getTracedProjects(), false);
					listenerRepo.notifyRecovery(workspace);
					return JobUtils.errorStatus("Add project failed", e);
				}
			}
		};

		jobHelper.schedule(newProjectJob);
	}

	public void removeProject(final IJavaProject project) {
		Job removeProjectJob = new Job("Remove project to the traced ones") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					WorkspaceModelBuilder.forModel(workspace).removeEntireProject(project);
					return JobUtils.okStatus("Project removed successfully");
				} catch (Exception e) {
					workspace = doBuildWorkspaceModel(dispatcher.getTracedProjects(), false);
					listenerRepo.notifyRecovery(workspace);
					return JobUtils.errorStatus("Remove project failed", e);
				}
			}
		};

		jobHelper.schedule(removeProjectJob);
	}

	public WWorkspace getWorkspace() {
		return workspace;
	}
}
