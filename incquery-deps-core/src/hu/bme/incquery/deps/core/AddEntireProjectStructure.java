package hu.bme.incquery.deps.core;

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

public class AddEntireProjectStructure implements ModelBuilder {

	private List<IJavaProject> projects;
	private WsBuildPrimitives buildPrimitives;
	@SuppressWarnings("unused")
	private WWorkspace workspace;

	public AddEntireProjectStructure(WWorkspace workspace, List<IJavaProject> projects) {
		this.workspace = workspace;
		this.projects = projects;
		this.buildPrimitives = new WsBuildPrimitives(workspace);
	}

	@Override
	public void build() {
		try {

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
								WNamedElement emfCu  = buildPrimitives.addNamedElementToModel(emfpf, cu); 
								for (IType t :cu.getTypes()) {
									addType(emfCu, t);
								}
							}
						}
					}
				}
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
	}

	private void addType(WNamedElement emfCu, IType t) throws JavaModelException {
		WNamedElement emfType = buildPrimitives.addNamedElementToModel(emfCu, t);
		for (IType innerType : t.getTypes()) {
			addType(emfCu, innerType);
		}
		
		for(IMethod m : t.getMethods()) {
			buildPrimitives.addNamedElementToModel(emfType, m);
		}
		
		for(IField f : t.getFields()) {
			buildPrimitives.addNamedElementToModel(emfType, f);
		}
	}

}
