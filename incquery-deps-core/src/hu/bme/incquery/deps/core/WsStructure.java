package hu.bme.incquery.deps.core;

import hu.bme.incquery.deps.wsmodel.WCompilationUnit;
import hu.bme.incquery.deps.wsmodel.WNamedElement;
import hu.bme.incquery.deps.wsmodel.WWorkspace;

import java.util.List;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;

public class WsStructure {

	public static void buildEntireProject(WWorkspace workspace, List<IJavaProject> projects) {
		try {

			WsBuildPrimitives buildPrimitives = new WsBuildPrimitives(workspace);

			for (IJavaProject project : projects) {
				WNamedElement emfProject = buildPrimitives.addNamedElementToModel(null, project);

				// Add all package fragment roots which are actual folders and not jar archives
				for (IPackageFragmentRoot pfr : project.getPackageFragmentRoots()) {
					if (!pfr.isArchive()) {
						WNamedElement emfPfr = buildPrimitives.addNamedElementToModel(emfProject, pfr);
						for (IJavaElement pkgObject : pfr.getChildren()) {
							IPackageFragment pkg = (IPackageFragment) pkgObject;
							WNamedElement emfpf = buildPrimitives.addNamedElementToModel(emfPfr, pkg);
							for (ICompilationUnit cu : pkg.getCompilationUnits()) {
								WNamedElement emfCu = buildPrimitives.addNamedElementToModel(emfpf, cu);
								for (IType t : cu.getAllTypes()) {
									WNamedElement emfType = buildPrimitives.addNamedElementToModel(emfCu, t);
									for (IMethod m : t.getMethods()) {
										buildPrimitives.addNamedElementToModel(emfType, m);
									}

									for (IField f : t.getFields()) {
										buildPrimitives.addNamedElementToModel(emfType, f);
									}
								}
							}
						}
					}
				}
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
		
		

		// TODO: optimize dependency resolution!
//		WsBuildPrimitives prim = new WsBuildPrimitives(workspace);
//		try {
//			WsDeps deps = new WsDeps(prim);
//			for (IJavaElement elem : JdtModelWalker.allElements(projects)) {
//				if (elem instanceof IType || elem instanceof IMethod) {
//					deps.addElementToSearch(elem);
//				}
//			}
//			
//			deps.execute();
//
//		} catch (CoreException e) {
//			e.printStackTrace();
//		}
	}
	
	public static WCompilationUnit createCompilationUnitModel(ICompilationUnit cu) throws JavaModelException {
        WCompilationUnit emfCu = (WCompilationUnit) WsBuildPrimitives.addNamedElement(null, cu);
        for (IType t : cu.getAllTypes()) {
            WNamedElement emfType = WsBuildPrimitives.addNamedElement(emfCu, t);
            for (IMethod m : t.getMethods()) {
                WsBuildPrimitives.addNamedElement(emfType, m);
            }

            for (IField f : t.getFields()) {
                WsBuildPrimitives.addNamedElement(emfType, f);
            }
        }
        return emfCu;
    }

	public static void removeEntireProject(WWorkspace workspace, List<IJavaProject> projects) {
		WsBuildPrimitives buildPrimitives = new WsBuildPrimitives(workspace);
		for (IJavaProject project : projects) {
			buildPrimitives.removeEntireProject(project);
		}
	}
}
