/*
 * File WsChangeListener.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at 25 May 2012.
 */
package cern.devtools.depanalysis.modelfinder;

import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;

public class WorkspaceEventDispatcher implements IElementChangedListener {

	private final WsChangeListenerRepo listenerRepo;

	private final IncrementalWsModelBuilder builder;

	public WorkspaceEventDispatcher() {
		listenerRepo = new WsChangeListenerRepo();
		builder = new IncrementalWsModelBuilder(listenerRepo);
	}

	public void registerWorkspaceListener(WsChangeEventListener l) {
		listenerRepo.addWsChangeEventListener(l);
	}

	public void deregisterWorkspaceListener(WsChangeEventListener l) {
		listenerRepo.removeWsChangeEventListener(l);
	}

	@Override
	public void elementChanged(final ElementChangedEvent event) {
		IJavaElementDelta delta = event.getDelta();
		try {
			traverseJavaModelRecursive(delta);
		} catch (Exception e) {
			// Print the reconcile process.
			System.err.println("<<Model got out of sync>>");
			e.printStackTrace();
			System.err.println("<<Reinitializing model>>");
			builder.rebuildWorkspaceModel();

		}
	}

	private void traverseJavaModelRecursive(IJavaElementDelta delta) {
		for (IJavaElementDelta child : delta.getAffectedChildren()) {
			traverseJavaModelRecursive(child);
		}

		handleDelta(delta);
	}

	private void handleDelta(IJavaElementDelta delta) {
		IJavaElement elem = delta.getElement();

		switch (delta.getKind()) {
		case IJavaElementDelta.ADDED:
			WsChangeType type = WsChangeType.forAddingJdtItem(elem);
			if (type == null) {
				logNonHandledEvent(delta);
			} else {
				builder.updateWorkspaceModel(type, elem);
			}
			break;
		case IJavaElementDelta.CHANGED:
			type = WsChangeType.forChangingJdtItem(elem, delta);
			if (type == null) {
				logNonHandledEvent(delta);
			} else {
				builder.updateWorkspaceModel(type, elem);
			}

			break;
		case IJavaElementDelta.REMOVED:
			type = WsChangeType.forRemovingJdtItem(elem);
			if (type == null) {
				logNonHandledEvent(delta);
			} else {
				builder.updateWorkspaceModel(type, elem);
			}
			// Traversals.removeJdtElemFromEmfModel(workspace, delta.getElement());
			break;
		default:
		}
	}

	private void logNonHandledEvent(IJavaElementDelta delta) {
		System.err.println("WARNING: Event not handled:" + delta.getElement().getClass() + " | " + delta);
	}
}
