package hu.bme.incquery.deps.core;

import org.eclipse.jdt.core.JavaCore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "cern.devtools.depanalysis.modelfinder"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	// java source code changing listener
	WorkspaceEventDispatcher workspaceModelService = new WorkspaceEventDispatcher();

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
		JavaCore.addElementChangedListener(workspaceModelService);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
		
		EmfUtils.saveModel(workspaceModelService.getWorkspace());
		JavaCore.removeElementChangedListener(workspaceModelService);
		workspaceModelService = null;
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public WorkspaceEventDispatcher getWsService() {
		return workspaceModelService;
	}
	
	

	public static void logDebug(String caller, String msg) {
		System.err.println("[" + caller + "] " + msg);
	}
	
}
