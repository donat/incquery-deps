/*
 * File WsChangeEventListener.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jul 3, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder;

import cern.devtools.depanalysis.javamodel.Workspace;

public abstract class WsChangeEventListener {

	public abstract void init(Workspace workspace);

	public abstract void recover(Workspace workspace);
	

}