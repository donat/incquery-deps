package org.eclipse.jdt.ui.examples;

import java.util.HashMap;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.compiler.IScanner;
import org.eclipse.jdt.core.compiler.ITerminalSymbols;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.texteditor.MarkerUtilities;
import org.eclipse.jface.dialogs.MessageDialog;

/**
 * Our sample action implements workbench action delegate.
 * The action proxy will be created by the workbench and
 * shown in the UI. When the user tries to use the action,
 * this delegate will be created and execution will be 
 * delegated to it.
 * @see IWorkbenchWindowActionDelegate
 */
public class SampleAction implements IWorkbenchWindowActionDelegate {
	@SuppressWarnings("unused")
	private IWorkbenchWindow window;

	
	public static final String MARKER_TYPE= "org.eclipse.jdt.ui.tests.testmarker";

	private ICompilationUnit fCompilationUnit;



	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		try {
			JavaUI.openInEditor(fCompilationUnit);

			IScanner scanner= ToolFactory.createScanner(true, false, false, true);
			scanner.setSource(fCompilationUnit.getSource().toCharArray());

			int count= 0;
			int tok;
			do {
				tok= scanner.getNextToken();
				if (isComment(tok)) {
					int start= scanner.getCurrentTokenStartPosition();
					int end= scanner.getCurrentTokenEndPosition() + 1;
					int line= scanner.getLineNumber(start);
					createMarker(fCompilationUnit, line, start, end - start);
					count++;
				}
			} while (tok != ITerminalSymbols.TokenNameEOF);

			MessageDialog.openInformation(null, "Test Markers", count + " markers added");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static boolean isComment(int token) {
		return token == ITerminalSymbols.TokenNameCOMMENT_BLOCK || token == ITerminalSymbols.TokenNameCOMMENT_JAVADOC
			|| token == ITerminalSymbols.TokenNameCOMMENT_LINE;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		fCompilationUnit= null;
		if (selection instanceof IStructuredSelection) {
			Object object= ((IStructuredSelection) selection).getFirstElement();
			if (object instanceof ICompilationUnit) {
				fCompilationUnit= (ICompilationUnit) object;

			}
		}
	}


	private void createMarker(ICompilationUnit cu, int line, int offset, int len) throws CoreException {
		HashMap<String, Comparable<?>> map= new HashMap<String, Comparable<?>>();
		map.put(IMarker.LOCATION, cu.getElementName());
		map.put(IMarker.MESSAGE, "Test marker");
		map.put(IMarker.SEVERITY, new Integer(IMarker.SEVERITY_ERROR));
		map.put(IMarker.LINE_NUMBER, new Integer(line));
		map.put(IMarker.CHAR_START, new Integer(offset));
		map.put(IMarker.CHAR_END, new Integer(offset + len));

		MarkerUtilities.createMarker(cu.getResource(), map, MARKER_TYPE);
	}

	
	
	
	public void dispose() {
	}

	/**
	 * We will cache window object in order to
	 * be able to provide parent shell for the message dialog.
	 * @see IWorkbenchWindowActionDelegate#init
	 */
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}
}