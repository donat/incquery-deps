/*
 * File JavaProjectWrapper.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 24, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.structurals;

import org.eclipse.jdt.core.IJavaProject;


public class JavaProjectWrapper implements WsItemWrapper {

	private final IJavaProject jdtProject;

	public static JavaProjectWrapper newInstance(IJavaProject jdtProject) {
		return new JavaProjectWrapper(jdtProject);
	}
	
	private JavaProjectWrapper(IJavaProject jdtProject) {
		this.jdtProject = jdtProject;
		
	}
	
	public IJavaProject wrappedItem() {
		return this.jdtProject;
	}

	@Override
	public void accept(WsItemWrapperVisitor visitor) {
		visitor.visitProject(this);
	}

}