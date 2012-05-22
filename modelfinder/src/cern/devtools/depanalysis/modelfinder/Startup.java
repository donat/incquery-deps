/*
 * File Startup.java.
 * 
 * Created by Donat Csikos<dcsikos@cern.ch> at 22 May 2012.
 */
package cern.devtools.depanalysis.modelfinder;

import org.eclipse.ui.IStartup;

import cern.devtools.depanalysis.javamodel.Workspace;

public class Startup implements IStartup {

	Workspace workspace;

	@Override
	public void earlyStartup() {
		// do nothing
	}


}
