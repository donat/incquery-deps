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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;

/**
 * The purpose of <code>JavaMetrics</code> is to demonstrate how to integrate with the
 * JDT model. It defines some basic Java code metrics:
 * 
 * <ul>
 * <li>Number of literals
 * <li>Number of fields
 * <li>Number of methods
 * </ul>
 * 
 * This class will work with the <code>JavaMetricsView</code> to enable the user
 * to see basic code metrics updated in real-time as the underlying Java model
 * is changed.
 * 
 * @see	org.eclipse.jdt.core.dom.ASTNode
 * @see	org.eclipse.jdt.core.dom.ASTVisitor
 * @see	org.eclipse.jdt.core.ICompilationUnit
 * @see	org.eclipse.jdt.core.IElementChangedListener
 * @see	IJavaMetricsListener
 * @see	JavaMetricsView
 */
public class JavaMetrics implements IElementChangedListener {
	private int methodDeclarationCount;
	private int fieldDeclarationCount;
	private int stringLiteralCount;
	private ICompilationUnit cu;
	private List listeners = new ArrayList();
	
	/**
	 * This inner class of <code>JavaMetrics</code> visits the AST and notifies
	 * its owner <code>JavaMetrics</code> of the elements that it finds.
	 * 
	 * @see 	JavaMetrics#processFieldDeclaration(FieldDeclaration)
	 * @see 	JavaMetrics#processMethodDeclaration(MethodDeclaration)
	 * @see 	JavaMetrics#processStringLiteral(StringLiteral)
	 */
	static private class JavaMetricsAccumulator extends ASTVisitor {
		private JavaMetrics jm;
		
		/**
		 * Create a new instance, gathering statistics about the given <code>ICompilationUnit</code>
		 * and notifying the given <code>JavaMetrics</code>.
		 * 
		 * @param newJm	Java metrics owner who will be notified of found metrics.
		 * @param newCu	compilation unit whose metrics will be calculated.
		 */
		public JavaMetricsAccumulator(JavaMetrics newJm, ICompilationUnit newCu) {
			this.jm = newJm;

			ASTParser astParser = ASTParser.newParser(AST.JLS3);
			astParser.setSource(newCu);
			astParser.createAST(null).accept(this);
		}

		public boolean visit(StringLiteral node) {
			return jm.processStringLiteral(node);
		}

		public boolean visit(FieldDeclaration node) {
			return jm.processFieldDeclaration(node);
		}

		public boolean visit(MethodDeclaration node) {
			return jm.processMethodDeclaration(node);
		}
	}

	/**
	 * Returns an instance of <code>JavaMetrics</code>, initialized to zero.
	 */
	public JavaMetrics() {
		this.reset(null);
	}
	
	/**
	 * Reset and recalculate code metrics for the given <code>ICompilationUnit</code>.
	 * Listeners will be notified of this change.
	 * 
	 * @param	newcu	new compilation unit whose metrics this class represents.
	 * 
	 * @see	IJavaMetricsListener
	 */
	public void reset(ICompilationUnit newcu) {
		cu = newcu;

		methodDeclarationCount = 0;
		fieldDeclarationCount = 0;
		stringLiteralCount = 0;

		if (cu != null) {
			new JavaMetricsAccumulator(this, cu);
		}
				
		notifyListeners();
	}
	
	/**
	 * Add a change listener.
	 * 
	 * @param	listener	new listener.
	 * 
	 * @see	IJavaMetricsListener
	 */
	public void addListener(IJavaMetricsListener listener) {
		listeners.add(listener);
		JavaCore.addElementChangedListener(this);
	}
	
	/**
	 * Remove a change listener.
	 * 
	 * @param	listener	old listener.
	 * 
	 * @see	IJavaMetricsListener
	 */
	public void removeListener(IJavaMetricsListener listener) {
		listeners.remove(listener);
		JavaCore.removeElementChangedListener(this);
	}

	/**
	 * Notifies that one or more attributes of one or more Java elements have changed.
	 * The specific details of the change are described by the given event.
	 * <code>IJavaMetricsListener</code> will be notified if this affected the
	 * calculated metrics.
	 *
	 * @param 	event the change event
	 * 
	 * @see	IJavaMetricsListener
	 * @see	JavaCore#addElementChangedListener(IElementChangedListener)
	 */
	public void elementChanged(ElementChangedEvent event) {
		if (cu == null)
			return;
			
		ICompilationUnit changedCu = (ICompilationUnit)
			event.getDelta().getElement().getAncestor(IJavaElement.COMPILATION_UNIT);
			
		if (changedCu == null)
			return;
			
		if (cu.equals(changedCu)) {
			// If the changed element is rooted at our CU, notify listeners
			// that the model has either changed in some way or been invalidated 
			// (IJavaElementDelta.REMOVED).
			
			if (event.getDelta().getKind() != IJavaElementDelta.REMOVED)
				reset(changedCu);
			else
				reset(null);
		}
	}

	/**
	 * @see IJavaMetricsListener
	 */
	private void notifyListeners() {
		for (Iterator iterator = listeners.iterator(); iterator.hasNext();) {
			IJavaMetricsListener listener = (IJavaMetricsListener) iterator.next();
			listener.refresh(/*this*/);
		}
	}
	
	/**
	 * See JavaMetricsAccumulator inner class.
	 */
	protected boolean processStringLiteral(StringLiteral node) {
		stringLiteralCount++;
		return false;
	}
	
	/**
	 * See JavaMetricsAccumulator inner class.
	 */
	protected boolean processFieldDeclaration(FieldDeclaration node) {
		fieldDeclarationCount++;
		return false;
	}

	/**
	 * See JavaMetricsAccumulator inner class.
	 */
	protected boolean processMethodDeclaration(MethodDeclaration node) {
		methodDeclarationCount++;
		return true;
	}

	/**
	 * Return basic metrics.
	 * 
	 * @return	The number of methods found in the compilation unit.
	 */
	public int getMethodDeclarationCount() {
		return methodDeclarationCount;
	}

	/**
	 * Return basic metrics.
	 * 
	 * @return	The number of fields found in the compilation unit.
	 */
	public int getFieldDeclarationCount() {
		return fieldDeclarationCount;
	}
	
	/**
	 * Return basic metrics.
	 * 
	 * @return	The number of string literals ("string") found in the compilation unit.
	 */
	public int getStringLiteralCount() {
		return stringLiteralCount;
	}
	
	/**
	 * Return a string representation suitable for display.
	 */
	public String summaryString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append(cu.getElementName() + "\n\n");

		sb.append("# Methods = " + getMethodDeclarationCount() + "\n");
		sb.append("# Fields = " + getFieldDeclarationCount() + "\n");
		sb.append("# String Literals = " + getStringLiteralCount() + "\n");

		return sb.toString();
	}

	/**
	 * This method returns <code>false</code> in the case where this metrics instance
	 * does not yet have a compilation unit (i.e., everything is zero).
	 * 
	 * @see	JavaMetrics#summaryString()
	 */
	public boolean hasValidMetrics() {
		return cu != null;
	}
}