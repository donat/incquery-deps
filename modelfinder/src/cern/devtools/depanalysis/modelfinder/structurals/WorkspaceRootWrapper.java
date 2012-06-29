/*
 * File WorkspaceRootWrapper.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 24, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.structurals;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.jdt.core.IJavaElement;


public class WorkspaceRootWrapper implements WsItemWrapper {

	private final IWorkspaceRoot jdtWorkspaceRoot;

	public WorkspaceRootWrapper(IWorkspaceRoot jdtWorksaceRoot) {
		this.jdtWorkspaceRoot = jdtWorksaceRoot;
	}

	@Override
	public void accept(WsItemWrapperVisitor visitor) {
		visitor.visitWorkspaceRoot(this);
	}

	public IWorkspaceRoot getJdtWorkspace() {
		return jdtWorkspaceRoot;
	}

	public IJavaElement wrappedItem() {
		throw new RuntimeException(
				"This funcition is not supported because the underlying IWorkspaceRoot instance does not implement "
						+ "the IJavaElement interface. Use the #getJdtWorkspace() method instead!");
	}

}
