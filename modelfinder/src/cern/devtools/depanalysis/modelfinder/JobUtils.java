/*
 * File JobScheduler.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jul 3, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder;

import java.util.concurrent.Semaphore;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;

public class JobUtils {

	Semaphore semaphore = new Semaphore(1);

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
		job.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void aboutToRun(IJobChangeEvent event) {
				semaphore.acquireUninterruptibly();
			}
			
			@Override
			public void done(IJobChangeEvent event) {
				semaphore.release();
			}
		});
		
		job.schedule();
	}
}
