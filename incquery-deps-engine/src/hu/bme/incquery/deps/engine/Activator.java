package hu.bme.incquery.deps.engine;

import hu.bme.incquery.deps.core.WsChangeEventListener;
import hu.bme.incquery.deps.modelloader.RepoModelLoadingService;
import hu.bme.incquery.deps.wsmodel.WWorkspace;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "hu.bme.incquery.deps.engine"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	IncQueryDepsEngine engine = new IncQueryDepsEngine();
	
	private ServiceTracker modelLoaderServiceTracker;
	ServiceReference<RepoModelLoadingService> serviceReference;
	
	
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

		modelLoaderServiceTracker = new ServiceTracker(context, RepoModelLoadingService.class.getName(), null);
		modelLoaderServiceTracker.open();
		
		engine.getInitJob().schedule();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
		modelLoaderServiceTracker.close();
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public IncQueryDepsEngine getIncQueryDepsEngine() {
		return engine;
	}

	public ServiceTracker getModelLoaderServiceTracker() {
		return modelLoaderServiceTracker;
	}

}
