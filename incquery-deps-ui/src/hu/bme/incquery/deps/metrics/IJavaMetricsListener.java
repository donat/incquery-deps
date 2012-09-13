package hu.bme.incquery.deps.metrics;

/*
 * "The Java Developer's Guide to Eclipse"
 *   by D'Anjou, Fairbrother, Kehn, Kellerman, McCarthy
 * 
 * (C) Copyright International Business Machines Corporation, 2004. 
 * All Rights Reserved.
 * 
 * Code or samples provided herein are provided without warranty of any kind.
 */

/**
 * Notification protocol between <code>JavaModel</code> instances and its interested parties.
 */
public interface IJavaMetricsListener {
	/**
	 * Notification of a change in the <code>JavaModel</code> instance.
	 * 
	 * @param	jm	instance that has changed.
	 * 
	 * @see 	JavaMetrics#addListener(IJavaMetricsListener)
	 * @see	JavaMetrics#removeListener(IJavaMetricsListener)
	 */
	void refresh(/*JavaMetrics jm*/);
}
