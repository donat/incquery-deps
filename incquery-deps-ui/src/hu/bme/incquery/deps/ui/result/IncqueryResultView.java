package hu.bme.incquery.deps.ui.result;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.ViewPart;

public class IncqueryResultView extends ViewPart implements ISelectionListener {
	static final String NO_SELECTION_MESSAGE = "No metrics available for the current selection.";

	private IAdapterFactory adapterFactory = new ResultAdapterFactory();

	private TreeViewer treeViewer;

	/**
	 * Return a new instance of <code>JavaMetricsView</code>.
	 */
	public IncqueryResultView() {
		super();
	}

	/**
	 * Create a very simple view to display the Java metrics. This is intentionally a trivial view, since the focus of
	 * this solution is the interaction with the Java model.
	 * 
	 * @see org.eclipse.ui.IWorkbenchPart#createPartControl(Composite)
	 */
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout(SWT.HORIZONTAL));

		treeViewer = new TreeViewer(parent, SWT.BORDER);

		// Listen for changes in the Workbench selection.
		getViewSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);

		// Subscribe for changes
		// hu.bme.incquery.deps.engine.Activator.getDefault().getIncQueryDepsEngine().registerChangeListener(this);
		Platform.getAdapterManager().registerAdapters(adapterFactory, ResultItem.class);

		treeViewer.setContentProvider(new ResultContentProvider(treeViewer));
		treeViewer.setLabelProvider(new WorkbenchLabelProvider());
	}

	/*
	 * non-Javadoc
	 * 
	 * @see IWorkbenchPart#setFocus()
	 */
	public void setFocus() {
		treeViewer.getTree().setFocus();
	}

	/**
	 * Update the view to match the selection, if it is an <code>ICompilationUnit</code>.
	 * 
	 * @see ISelectionService#addSelectionListener(ISelectionListener)
	 */
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof TreeSelection) {
			TreeSelection te = (TreeSelection) selection;
			Object element = te.getFirstElement();
			refresh(element);
			return;
		}
		if (selection instanceof IJavaProject) {
			treeViewer.setInput(selection);
			return;
		}
		if (selection instanceof IStructuredSelection) {
			ICompilationUnit cu = getCompilationUnit((IStructuredSelection) selection);
			refresh(cu);
			return;
		} else if (selection instanceof TextSelection) {
			IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
			IJavaElement jdtElem = JavaUI.getEditorInputJavaElement(editor.getEditorInput());
			if (jdtElem != null && jdtElem instanceof ICompilationUnit) {
				refresh((ICompilationUnit) jdtElem);
			}
		}
	}

	private void refresh(Object element) {
		if (element != null) {
			treeViewer.setInput(element);
		}
		treeViewer.expandAll();
	}

	/*
	 * non-Javadoc Remove the listeners that were established in <code>createPartControl</code>.
	 */
	public void dispose() {
		Platform.getAdapterManager().unregisterAdapters(adapterFactory, ResultItem.class);
		getViewSite().getWorkbenchWindow().getSelectionService().removeSelectionListener(this);

		super.dispose();
	}

	/**
	 * If the selection corresponds to an <code>ICompilationUnit</code> (or *.java file), return it.
	 * 
	 * @return an <code>ICompilationUnit</code> or null
	 */
	private ICompilationUnit getCompilationUnit(IStructuredSelection ss) {
		if (ss.getFirstElement() instanceof IJavaElement) {
			IJavaElement je = (IJavaElement) ss.getFirstElement();
			return (ICompilationUnit) je.getAncestor(IJavaElement.COMPILATION_UNIT);
		}
		if (ss.getFirstElement() instanceof IFile) {
			IFile f = (IFile) ss.getFirstElement();
			if (f.getFileExtension() != null && f.getFileExtension().compareToIgnoreCase("java") == 0)
				return (ICompilationUnit) JavaCore.create(f);
		}

		return null;
	}
}