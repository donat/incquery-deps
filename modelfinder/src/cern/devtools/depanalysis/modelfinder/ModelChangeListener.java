/*
 * File ModelChangeListener.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at 22 May 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder;

import cern.devtools.depanalysis.javamodel.Workspace;

public interface ModelChangeListener {
	
	public void workspaceChanged(Workspace newWs);

}
