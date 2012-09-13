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

import java.util.Collection;
import java.util.Set;

import hu.bme.incquery.deps.engine.IncQueryDepsChangeListener;
import hu.bme.incquery.deps.internal.MarkerManager;
import hu.bme.incquery.deps.wsmodel.WCompilationUnit;
import hu.bme.incquery.deps.wsmodel.WMethod;

import org.eclipse.core.resources.IFile;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;

import cern.devtools.deps.query.cp1.addedclasses.AddedClassesMatch;
import cern.devtools.deps.query.cp1.addedclasses.AddedClassesMatcher;
import cern.devtools.deps.query.cp1.addedmethods.AddedMethodsMatch;
import cern.devtools.deps.query.cp1.addedmethods.AddedMethodsMatcher;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Label;

/**
 * This class will work with a <code>JavaMetrics</code> to enable the user to see basic code metrics updated in
 * real-time as the underlying Java model is changed. This view shows the metrics of the currently selected
 * <code>ICompilationUnit</code>, whether it is in the Package Explorer, Outline, or Hierarchy view.
 * 
 * @see com.ibm.jdg2e.jdt.JavaMetrics
 */
public class JavaMetricsView extends ViewPart implements ISelectionListener, 
		IncQueryDepsChangeListener {
	static final String NO_SELECTION_MESSAGE = "No metrics available for the current selection.";

	// JavaMetrics jm;

	/**
	 * Return a new instance of <code>JavaMetricsView</code>.
	 */
	public JavaMetricsView() {
		super();
	}

	/**
	 * Create a very simple view to display the Java metrics. This is intentionally a trivial view, since the focus of
	 * this solution is the interaction with the Java model.
	 * 
	 * @see org.eclipse.ui.IWorkbenchPart#createPartControl(Composite)
	 */
	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(2, false));
		
		Label lblAddedMethods = new Label(parent, SWT.NONE);
		lblAddedMethods.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblAddedMethods.setText("Added Methods");
		
		txtAddedMethods = new Text(parent, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);
		GridData gd_text = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_text.heightHint = 90;
		txtAddedMethods.setLayoutData(gd_text);

		// Listen for changes in the Workbench selection.
		getViewSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);

		// Create the model and listen for changes in it.
		// jm = new JavaMetrics();
		// jm.addListener(this);

		// Subscribe for changes
		hu.bme.incquery.deps.engine.Activator.getDefault().getIncQueryDepsEngine().registerChangeListener(this);
	}

	/*
	 * non-Javadoc
	 * 
	 * @see IWorkbenchPart#setFocus()
	 */
	public void setFocus() {
		txtAddedMethods.setFocus();
	}

	/**
	 * Update the view to match the selection, if it is an <code>ICompilationUnit</code>.
	 * 
	 * @see ISelectionService#addSelectionListener(ISelectionListener)
	 */
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			ICompilationUnit cu = getCompilationUnit((IStructuredSelection) selection);
			// jm.reset(cu);
			refresh(cu);
		} else if (selection instanceof TextSelection) {
			IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
			IJavaElement jdtElem = JavaUI.getEditorInputJavaElement(editor.getEditorInput());
			if (jdtElem instanceof ICompilationUnit) {
				// jm.reset((ICompilationUnit)jdtElem);
				refresh((ICompilationUnit)jdtElem);
			}
		}
	}

	/*
	 * non-Javadoc Remove the listeners that were established in <code>createPartControl</code>.
	 */
	public void dispose() {
		getViewSite().getWorkbenchWindow().getSelectionService().removeSelectionListener(this);
		// jm.removeListener(this);

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

	/**
	 * Update the view to reflect changes in the metrics.
	 * @param cu 
	 * 
	 * @see IJavaMetricsListener#refresh(JavaMetrics)
	 */
	public void refresh(ICompilationUnit cu/* JavaMetrics unused */) {
		txtAddedMethods.setText("");
		
		if (amM != null) {
			Collection<AddedMethodsMatch> matches = amM.getAllMatches();
			for (AddedMethodsMatch m : matches) {
				WMethod wsMethod = m.getWsMethod();
				
				if (wsMethod.getParent().getParent().getHandler().equals(cu.getHandleIdentifier())) {
					txtAddedMethods.append(wsMethod.getSignature() + "\n");
				}
			}
		}
		// // Notifications don't necessarily occur on the UI thread,
		// // so make sure the update does run on it.
		// Display.getDefault().syncExec(new Runnable() {
		// public void run() {
		// if (jm.hasValidMetrics())
		// message.setText(jm.summaryString());
		// else
		// message.setText(NO_SELECTION_MESSAGE);
		//
		// }
		// });
	}

	AddedMethodsMatcher amM;
	private Text txtAddedMethods;

	@Override
	public void matchesChanged(Set<IncQueryMatcher<?>> matchers) {
		for (IncQueryMatcher<?> m : matchers) {
			if (m instanceof AddedMethodsMatcher) {
				amM = (AddedMethodsMatcher) m;
			}
		}
	}
}