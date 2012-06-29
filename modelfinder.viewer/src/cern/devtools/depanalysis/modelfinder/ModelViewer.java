/*
 * File ModelViewer.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 13, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import cern.devtools.depanalysis.javamodel.Workspace;
import cern.devtools.depanalysis.javamodel.provider.JavaModelItemProviderAdapterFactory;
import cern.devtools.depanalysis.modelfinder.IncremenatalWsToEMFModelTransformer.WsChangeEventListener;

public class ModelViewer extends ViewPart {

	public static final String ID = "cern.devtools.depanalysis.modelfinder.ModelViewer"; //$NON-NLS-1$
	private TreeViewer viewer;
	
	protected ComposedAdapterFactory adapterFactory;
	
	private WsChangeEventListener wsChangeListener = new WsChangeEventListener() {
		
		@Override
		public void recover(Workspace workspace) {
			viewer.setInput(workspace);
		}
		
		@Override
		public void init(Workspace workspace) {
			viewer.setInput(workspace);
		}
	};

	
	public ModelViewer() {
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new JavaModelItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
	}

	/**
	 * Create contents of the view part.
	 * 
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FillLayout(SWT.HORIZONTAL | SWT.VERTICAL));
		{
			viewer = new TreeViewer(container, SWT.BORDER);
			//AdapterFactory adapterFactory = new JavaModelAdapterFactory();

			//Tree tree = viewer.getTree();
		}

		createActions();
		initializeToolBar();
		initializeMenu();
		initializeViewerInput();
	}


	private void initializeViewerInput() {
		viewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		Activator.getDefault().getWsService().addWsChangeEventListener(wsChangeListener);
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Initialize the toolbar.
	 */
	private void initializeToolBar() {
		//IToolBarManager toolbarManager = getViewSite().getActionBars().getToolBarManager();
	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu() {
		//IMenuManager menuManager = getViewSite().getActionBars().getMenuManager();
	}

	@Override
	public void setFocus() {
		// Set the focus
	}

	public void setInput(Workspace input) {
		viewer.setInput(input);
	}
	
	@Override
	public void dispose() {
		Activator.getDefault().getWsService().removeWsChangeEventListener(wsChangeListener);
		adapterFactory.dispose();
	}

}
