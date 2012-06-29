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
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IJavaElementDelta;

import cern.devtools.depanalysis.javamodel.JavaModelFactory;
import cern.devtools.depanalysis.javamodel.Workspace;
import cern.devtools.depanalysis.modelfinder.simplevisitors.EmfItemRemover;
import cern.devtools.depanalysis.modelfinder.simplevisitors.EmfStructureBuilder;
import cern.devtools.depanalysis.modelfinder.structurals.VisitorBuilder;
import cern.devtools.depanalysis.modelfinder.structurals.WorkspaceItemAdapter;
import cern.devtools.depanalysis.modelfinder.structurals.WsItemWrapper;

public class IncremenatalWsToEMFModelTransformer implements IElementChangedListener {

	public interface WsChangeEventListener {
		public void init(Workspace workspace);

		public void recover(Workspace workspace);
	}

	/**
	 * Logger.
	 */
	private static Logger LOG = Logger.getLogger(IncremenatalWsToEMFModelTransformer.class.getCanonicalName());

	public static void printModel(Workspace workspace) {
		// System.out.println(workspace.toString());
	}

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
		l.init(workspace);
	}

	@Override
	public void elementChanged(ElementChangedEvent event) {
		try {
			IJavaElementDelta delta = event.getDelta();
			traverseJavaModelRecursive(delta);
			printModel(this.workspace);
		} catch (CoreException e) {
			LOG.warning("Error on model change. Desc: " + e.getMessage());
			LOG.info("Rebuilding entire model...");
			reset();
		}
	}

	public Workspace getWorkspaceModel() {
		return workspace;
	}

	public void removeWsChangeEventListener(WsChangeEventListener l) {
		listeners.remove(l);
	}

	public void reset() {
		try {
			// Initialise the model object
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

	private void loadInitialState() throws CoreException {
		IWorkspace jdtWorkspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot jdtWsRoot = jdtWorkspace.getRoot();
		this.workspace = VisitorBuilder.traverseAllWorkspaceItems(jdtWsRoot);
	}

	private void notifyRecovery() {
		for (WsChangeEventListener l : listeners) {
			l.recover(workspace);
		}
	}

	private void traverseJavaModelRecursive(IJavaElementDelta elem) throws CoreException {

		// Call recursive for the children
		for (IJavaElementDelta child : elem.getAffectedChildren()) {
			traverseJavaModelRecursive(child);
		}

		switch (elem.getKind()) {
		case IJavaElementDelta.ADDED:
			WsItemWrapper[] items = WorkspaceItemAdapter.adapt(elem.getElement());
			if (items == null) {
				break;
			}

			for (WsItemWrapper vwi : items) {
				vwi.accept(EmfStructureBuilder.newInstance(workspace));
			}
			// addJavaElement(elem.getElement());
			break;
		case IJavaElementDelta.REMOVED:
			items = WorkspaceItemAdapter.adapt(elem.getElement());
			if (items == null) {
				break;
			}

			for (WsItemWrapper vwi : items) {
				vwi.accept(EmfItemRemover.newInstance(workspace));
			}
			break;
		default:
		}

	}
}
