package cern.devtools.depanalysis.modelfinder;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.IElementChangedListener;
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
	IElementChangedListener elementChangedListener = new IElementChangedListener() {
		
		@Override
		public void elementChanged(ElementChangedEvent event) {
			try {
				JavaModelManager.INSTANCE.update(event);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	
	// 
	ModelPrinterListener printer = new ModelPrinterListener();
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		JavaCore.addElementChangedListener(elementChangedListener);
		JavaModelManager.INSTANCE.addModelChangeListener(printer);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
		
		JavaModelManager.INSTANCE.removeModelChangeListener(printer);
		JavaCore.removeElementChangedListener(elementChangedListener);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
