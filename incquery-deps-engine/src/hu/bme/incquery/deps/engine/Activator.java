package hu.bme.incquery.deps.engine;

import hu.bme.incquery.deps.core.WsChangeEventListener;
import hu.bme.incquery.deps.wsmodel.WWorkspace;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "hu.bme.incquery.deps.engine"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	IncQueryDepsEngine engine = new IncQueryDepsEngine();

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
		hu.bme.incquery.deps.core.Activator.getDefault().getWsService()
				.registerWorkspaceListener(new WsChangeEventListener() {

					@Override
					public void init(WWorkspace resource) {
						engine.setWorkspaceModel(resource);
					}

					@Override
					public void recover(WWorkspace resource) {
						engine.setWorkspaceModel(resource);
					}

					@Override
					public void update(WWorkspace resource) {
						engine.setWorkspaceModel(resource);
					}
				});
		engine.initialize();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
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

	public IncQueryDepsEngine getIncQueryDepsEngine() {
		return engine;
	}

}
