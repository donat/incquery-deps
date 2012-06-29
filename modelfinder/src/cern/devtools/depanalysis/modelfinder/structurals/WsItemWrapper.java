/*
 * File VisitableWorkspaceItem.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 24, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.structurals;

import org.eclipse.jdt.core.IJavaElement;



public interface WsItemWrapper {
	public void accept(WsItemWrapperVisitor visitor);
	public IJavaElement wrappedItem(); 
}
