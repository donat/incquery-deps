/*
 * File WsChangeEventListener.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jul 3, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder;

import cern.devtools.depanalysis.wsmodel.EclipseWorkspace;

public abstract class WsChangeEventListener {

	public abstract void init(EclipseWorkspace workspace);

	public abstract void recover(EclipseWorkspace workspace);
	

}