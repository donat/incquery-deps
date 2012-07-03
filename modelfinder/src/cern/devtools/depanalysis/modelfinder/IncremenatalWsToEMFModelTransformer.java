/*
 * File WsChangeListener.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at 25 May 2012.
 */
package cern.devtools.depanalysis.modelfinder;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.ui.progress.UIJob;

import cern.devtools.depanalysis.javamodel.JavaModelFactory;
import cern.devtools.depanalysis.javamodel.Workspace;
import cern.devtools.depanalysis.modelfinder.combinators.Traversals;

public class IncremenatalWsToEMFModelTransformer implements IElementChangedListener {

	public interface WsChangeEventListener {
		public void init(Workspace workspace);

		public void recover(Workspace workspace);
	}

	/**
	 * Logger.
	 */
	private static Logger LOG = Logger.getLogger(IncremenatalWsToEMFModelTransformer.class.getCanonicalName());

	private Job gatherInitialStateJob;

	/**
	 * Listeners List
	 */
	private List<WsChangeEventListener> listeners = new LinkedList<IncremenatalWsToEMFModelTransformer.WsChangeEventListener>();

	/**
	 * EMF model to expose.
	 */
	private Workspace workspace;

	public IncremenatalWsToEMFModelTransformer() {
		reset();
	}

	public void addWsChangeEventListener(WsChangeEventListener l) {
		listeners.add(l);
	}

	@Override
	public void elementChanged(final ElementChangedEvent event) {
		Job job = new UIJob("Update EMF model") {

			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
				while (gatherInitialStateJob.getState() == Job.RUNNING) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				}

				try {
					IJavaElementDelta delta = event.getDelta();
					traverseJavaModelRecursive(delta);
				} catch (CoreException e) {
					LOG.warning("Error on model change. Desc: " + e.getMessage());
					LOG.info("Rebuilding entire model...");
					reset();
				}

				return new Status(IStatus.OK, Activator.PLUGIN_ID, "Gathering Workspace Emf model was successful");
			}
		};

		job.schedule();
	}

	public Workspace getWorkspaceEMFModel() {
		return workspace;
	}

	public void removeWsChangeEventListener(WsChangeEventListener l) {
		listeners.remove(l);
	}

	/**
	 * 
	 * @param delta
	 * @return <code>true</code>, if the recursive handling should be executed to the affected children.
	 */
	private void handleDelta(IJavaElementDelta delta) {
		switch (delta.getKind()) {
		case IJavaElementDelta.ADDED:
			Traversals.addJdtElemToEmfModel(workspace, delta.getElement());
			break;
		case IJavaElementDelta.CHANGED:
			if (delta.getElement() instanceof ICompilationUnit
					&& (delta.getFlags() & IJavaElementDelta.F_AST_AFFECTED) != 0) {
				Traversals.updateDependencies(workspace, delta.getElement());
			}

			break;
		case IJavaElementDelta.REMOVED:
			Traversals.removeJdtElemFromEmfModel(workspace, delta.getElement());
			break;
		default:
		}
	}

	private void loadInitialState() {
		IWorkspace jdtWorkspace = ResourcesPlugin.getWorkspace();
		final IWorkspaceRoot jdtWsRoot = jdtWorkspace.getRoot();
		gatherInitialStateJob = new Job("Gather EMF model") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				workspace = Traversals.extractFullEmfModel(jdtWsRoot);
				UIJob notifyJob = new UIJob("") {
					@Override
					public IStatus runInUIThread(IProgressMonitor monitor) {
						notifyInit();
						return new Status(IStatus.OK, Activator.PLUGIN_ID, "notifyInit()");
					}
				};
				notifyJob.schedule();

				return new Status(IStatus.OK, Activator.PLUGIN_ID, "Gathering Workspace Emf model was successful");
			}
		};

		gatherInitialStateJob.schedule();
	}

	private void notifyInit() {
		for (WsChangeEventListener l : listeners) {
			l.init(workspace);
		}
	}

	private void notifyRecovery() {
		for (WsChangeEventListener l : listeners) {
			l.recover(workspace);
		}
	}

	private void reset() {
		try {
			// Initialize the model object
			workspace = JavaModelFactory.eINSTANCE.createWorkspace();
			// load existing project information from the workspace
			loadInitialState();
			// print the initial state
			notifyRecovery();
		} catch (Throwable e) {
			e.printStackTrace();
			LOG.warning("Error on reset. Desc: " + e.getMessage());
		}
	}

	private void traverseJavaModelRecursive(IJavaElementDelta delta) throws CoreException {
		for (IJavaElementDelta child : delta.getAffectedChildren()) {
			traverseJavaModelRecursive(child);
		}

		handleDelta(delta);
	}
}
