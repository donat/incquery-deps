package hu.bme.incquery.deps.internal;

import hu.bme.incquery.deps.marker.IncQueryResultToMarkers;
import hu.bme.incquery.deps.pub.IncQueryDepsRegistry;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

import cern.devtools.deps.query.cp3.addedmethods.AddedMethodsMatcher;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "hu.bme.incquery.deps.ui"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	
	private IncQueryResultToMarkers incQueryResultToMarkers = new IncQueryResultToMarkers();
	private ServiceTracker serviceTracker;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		serviceTracker = new ServiceTracker(context, IncQueryDepsRegistry.class.getName(), null) {
			public Object addingService(org.osgi.framework.ServiceReference reference) {
				IncQueryDepsRegistry engine = context.getService(reference);
				engine.registerChangeListener(incQueryResultToMarkers);
				return engine;
			};
		};
		
		serviceTracker.open();
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		serviceTracker.close();
		plugin = null;
		super.stop(context);

	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in relative path
	 * 
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
}
