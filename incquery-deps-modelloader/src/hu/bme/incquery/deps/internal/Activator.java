package hu.bme.incquery.deps.internal;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;

import hu.bme.incquery.deps.modelloader.RepoModelLoadingService;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import cern.devtools.depanalysis.bean.DependencyService;
import cern.devtools.eclipse.dependency.prefs.PreferenceStore;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "hu.bme.incquery.deps.modelloader"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	private ServiceRegistration<?> modelLoadingService;

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

		modelLoadingService = context.registerService(RepoModelLoadingService.class.getName(),
				new ModelLoadingServiceImpl(), null);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		modelLoadingService.unregister();
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

	public DependencyService getDependencyService() throws Exception {
		String rmiConnectionString = PreferenceStore.getRmiConnectionString();
		try {
			Remote r = Naming.lookup(rmiConnectionString);
			return (DependencyService) r;
		} catch (MalformedURLException e) {
			throw new RuntimeException(String.format("The url(%s) should be well-formed.", rmiConnectionString));
		}
	}

}
