/*
 * File PackageWrapper.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 24, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.structurals;

import org.eclipse.jdt.core.IPackageFragment;


public class PackageWrapper implements WsItemWrapper {

	private final IPackageFragment jdtPackage;

	private PackageWrapper(IPackageFragment jdtPackage) {
		this.jdtPackage = jdtPackage;
	}
	
	public static PackageWrapper newInstance(IPackageFragment jdtPackage) {
		return new PackageWrapper(jdtPackage);
	}
	
	@Override
	public void accept(WsItemWrapperVisitor visitor) {
		visitor.visitPackage(this);
	}

	public IPackageFragment wrappedItem() {
		return jdtPackage;
	}

	
}
