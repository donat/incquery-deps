/*
 * File WsChangeListenerRepo.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jul 3, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package hu.bme.incquery.deps.core;

import hu.bme.incquery.deps.wsmodel.WWorkspace;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.swt.widgets.Display;

public class WsChangeListenerRepo {
	private WsModelState state = WsModelState.UNINITIALIZED;

	private List<WsChangeEventListener> listeners = new LinkedList<WsChangeEventListener>();
	
	private WWorkspace workspace;

	public void addWsChangeEventListener(WsChangeEventListener l) {
		listeners.add(l);
		if (state == WsModelState.AVAILABLE) {
			l.init(workspace);
		}
	}

	public void removeWsChangeEventListener(WsChangeEventListener l) {
		listeners.remove(l);
	}

	
	public void notifyInit(final WWorkspace workspace) {
		this.workspace = workspace;
		state = WsModelState.AVAILABLE;
		
		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				for (WsChangeEventListener l : listeners) {
					l.init(workspace);
				}
			}
		});
		
	}
	
	public void notifyRecovery(final WWorkspace workspace) {
		this.workspace = workspace;
		
		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				for (WsChangeEventListener l : listeners) {
					l.recover(workspace);
				}
			}
		});
	}
}