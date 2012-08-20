/*
 * File ModelViewer.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 13, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.part.ViewPart;

import cern.devtools.depanalysis.wsmodel.EclipseWorkspace;
import cern.devtools.depanalysis.wsmodel.provider.JavaModelItemProviderAdapterFactory;

public class ModelViewer extends ViewPart {

	public static final String ID = "cern.devtools.depanalysis.modelfinder.ModelViewer"; //$NON-NLS-1$
	private TreeViewer viewer;

	protected ComposedAdapterFactory adapterFactory;

	private WsChangeEventListener wsChangeListener = new WsChangeEventListener() {

		@Override
		public void recover(EclipseWorkspace workspace) {
			viewer.setInput(workspace);
		}

		@Override
		public void init(EclipseWorkspace workspace) {
			viewer.setInput(workspace);
		}
	};
	private Action saveEmfModelAction;

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
			// AdapterFactory adapterFactory = new JavaModelAdapterFactory();

			// Tree tree = viewer.getTree();
		}

		createActions();
		initializeToolBar();
		initializeMenu();
		initializeViewerInput();

	}

	private void initializeViewerInput() {
		viewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		Activator.getDefault().getWsService().registerWorkspaceListener(wsChangeListener);
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
		{
			saveEmfModelAction = new Action("Save model") {
				@Override
				public void run() {
					// Choose file
					// FileDialog fd = new FileDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
					SaveAsDialog sd = new SaveAsDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
					sd.setTitle("Save workspace model");
					//sd.setMessage("Specify file to save to");
					//sd.setFilterPath("C:/");
					//String[] filterExt = { "*.xmi" };
					//sd.setsetFilterExtensions(filterExt);
					sd.setOriginalName("default.javamodel");
					//String path = fd.open();
					
					sd.setBlockOnOpen(true);
					int r = sd.open();
					if (Window.OK == r) {
						IPath path = sd.getResult();
						
						System.err.println( path );
	
						// Append javamodel ending if not specified.
//						if (!path.lastSegment().endsWith(".javamodel")) {
//							path += ".javamodel";
//						}
	
						// Store information to file.
						ResourceSet resourceSet = new ResourceSetImpl();
						resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
								.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
						//URI fileURI = URI.createFileURI(new File(path).getAbsolutePath());
						URI fileURI = URI.createPlatformResourceURI( path.toOSString(), true );
						Resource resource = resourceSet.createResource(fileURI);
						resource.getContents().add((EObject) viewer.getInput());
						try {
							resource.save(Collections.EMPTY_MAP);
							MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Information", "Emf model saved successfully!");
						} catch (IOException e) {
							e.printStackTrace();
							MessageDialog.openWarning(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Warning", "Error on save: " + e.getMessage() + ".");
						}
					}
				}
			};
			saveEmfModelAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
					.getImageDescriptor(ISharedImages.IMG_ETOOL_SAVE_EDIT));
			saveEmfModelAction.setToolTipText("Save Emf Model");
		}
	}

	/**
	 * Initialize the toolbar.
	 */
	private void initializeToolBar() {
		IToolBarManager toolbarManager = getViewSite().getActionBars().getToolBarManager();
		toolbarManager.add(saveEmfModelAction);
	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu() {
		IMenuManager menuManager = getViewSite().getActionBars().getMenuManager();
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
		Activator.getDefault().getWsService().deregisterWorkspaceListener(wsChangeListener);
		adapterFactory.dispose();
	}

}
