/*
 * File Util.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at 29 May 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package hu.bme.incquery.deps.util;

import hu.bme.incquery.deps.internal.Activator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

/**
 * Small utility class holding logging functions. Provides unified way of logging exceptions in the client code.
 * 
 * @author Donat Csikos
 */
public class LoggingUtil {

	/**
	 * Logs a message and shows it in a warning dialog.
	 * 
	 * @param message The message to display.
	 * @param e The exception to log.
	 */
	public static void warnAndLog(final String message, final Exception e) {
		Display.getDefault().syncExec(new Runnable() {
			
			@Override
			public void run() {
				warnAndLogThreadUnsafe(message, e);
			}
		});
	}

	private static void warnAndLogThreadUnsafe(String message, Exception e) {
		// Print the trace for debugging.
		e.printStackTrace();

		// Display a warning message
		MessageDialog.openWarning(Display.getDefault().getActiveShell(), "Error",
				message + "\nReason is: " + e.getMessage() + ".");

		// Store the error message in the eclipse log.
		Activator
				.getDefault()
				.getLog()
				.log(new Status(IStatus.WARNING, Activator.PLUGIN_ID, message + "\nReason is: " + e.getMessage() + "."));
	}

	public static void logWarn(String message) {
		Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID, message));
	}
	
	public static void logWarn(Exception e) {
		Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID, e.getMessage()));
		e.printStackTrace();
	}

	/**
	 * Logs a message and shows it in a warning dialog.
	 * 
	 * @param e The exception to log.
	 */
	public static void warnAndLog(Exception e) {
		warnAndLog(e.getClass().getSimpleName(), e);
	}
}
