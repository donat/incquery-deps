/*
 * File JobScheduler.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jul 3, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class JobUtils {

	public static IStatus okStatus(String message) {
		return new Status(IStatus.OK, Activator.PLUGIN_ID, message);
	}
	
	public static IStatus errorStatus(String message, Exception cause) {
		return new Status(IStatus.ERROR, Activator.PLUGIN_ID, message, cause);
	}
	
	/**
	 * 
	 * @param job
	 */
	synchronized public void schedule(final Job job) {
		job.schedule();
	}
}
