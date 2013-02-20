package hu.bme.incquery.deps.core;

import hu.bme.incquery.deps.wsmodel.WCompilationUnit;
import hu.bme.incquery.deps.wsmodel.WNamedElement;
import hu.bme.incquery.deps.wsmodel.WWorkspace;

import java.util.Arrays;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;

public class ModelComparer {

    private WWorkspace wsBeforeChanges;
    private IJavaElementDelta delta;
    private WsBuildPrimitives modelOps;

    private ModelComparer(WWorkspace wsBeforeChanges, IJavaElementDelta delta) {
        this.wsBeforeChanges = wsBeforeChanges;
        this.delta = delta;
        this.modelOps = new WsBuildPrimitives(wsBeforeChanges);
    }

    public static void compareAndUpdateModel(WWorkspace wsBeforeChanges, IJavaElementDelta delta) {
        new ModelComparer(wsBeforeChanges, delta).doUpdate();
    }

    private void doUpdate() {

        boolean deletedProject = false;
        if (delta.getRemovedChildren() != null) {
            for (IJavaElementDelta removedDelta : delta.getRemovedChildren()) {
                IJavaElement elem = removedDelta.getElement();
                if (elem instanceof IJavaProject) {
                    IJavaProject removedProject = (IJavaProject) elem;
                    modelOps.removeEntireProject(removedProject);
                    PreferenceStore.getStore().removeTracedProject(removedProject.getElementName());
                    deletedProject = true;
                }
            }
        }

        if (!deletedProject) {
            updateWsModel(wsBeforeChanges, delta);
            // wsAfterChanges = createModelOfModifiedProjects(delta);
            // buildNew = new WsBuildPrimitives(wsAfterChanges);
            // findAndApplyChanges(delta);
        }
    }

    private void updateWsModel(WWorkspace ws, IJavaElementDelta delta) {
        // Leave out every delta which does not belong to the traced projects.
        if (delta.getElement().getJavaProject() != null
                && !Activator.getDefault().getWsService().isTracedProject(delta.getElement().getJavaProject())) {
            return;
        }
        
        

        switch (delta.getKind()) {

        case IJavaElementDelta.ADDED:
            addElement(delta);
            break;
        case IJavaElementDelta.REMOVED:
            removeElement(delta);
            // If something is deleted, the children is automatically deleted; no need for recursion.
            return;
        case IJavaElementDelta.CHANGED:
            if (delta.getElement() instanceof ICompilationUnit
                    && (delta.getFlags() & IJavaElementDelta.F_PRIMARY_RESOURCE) != 0) {
                refreshCompilationUnit((ICompilationUnit) delta.getElement());
                return;
            } 
            break;
        }

        // call update recursively
        for (IJavaElementDelta childrenDelta : delta.getAffectedChildren()) {
            updateWsModel(wsBeforeChanges, childrenDelta);
        }
    }   

//    private void findAndApplyChanges(IJavaElementDelta delta2) {
//
//        // Leave out every delta which does not belong to the traced projects.
//        if (delta2.getElement().getJavaProject() != null
//                && !Activator.getDefault().getWsService().isTracedProject(delta2.getElement().getJavaProject())) {
//            return;
//        }
//
//        switch (delta2.getKind()) {
//        case IJavaElementDelta.ADDED:
//            addElement(delta2);
//            break;
//        case IJavaElementDelta.REMOVED:
//            removeElement(delta2);
//            break;
//        case IJavaElementDelta.CHANGED:
//            if (delta2.getElement() instanceof ICompilationUnit
//                    && (delta2.getFlags() & IJavaElementDelta.F_PRIMARY_RESOURCE) != 0) {
//                refreshCompilationUnit((ICompilationUnit) delta2.getElement());
//            } else {
//                for (IJavaElementDelta child : delta2.getAffectedChildren()) {
//                    findAndApplyChanges(child);
//                }
//            }
//            break;
//        default:
//            break;
//        }
//    }

    private void addElement(IJavaElementDelta delta) {
        if (delta.getMovedFromElement() != null) {
            modelOps.removeNamedElement(delta.getMovedFromElement());
        }
        IJavaElement newElem = delta.getElement();
        IJavaElement parent = newElem instanceof IType ? ((IType) newElem).getCompilationUnit() : newElem.getParent();

        WNamedElement emfOldParent = modelOps.findJdtElementInEmfModel(parent);
        
        
        if (newElem instanceof ICompilationUnit) {
            try {
                WCompilationUnit newCu = WsStructure.createCompilationUnitModel((ICompilationUnit)newElem);
                emfOldParent.getChildren().add(newCu);
                newCu.setParent(emfOldParent);
            } catch (JavaModelException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else {
            modelOps.addNamedElementToModel(emfOldParent, newElem);
        }
    }

    private void removeElement(IJavaElementDelta delta) {
        if (delta.getMovedToElement() == null) {
            modelOps.removeNamedElement(delta.getElement());
        }

    }

//    @SuppressWarnings("unchecked")
//    private void updateChildrenDependenciesRecurive(List<WNamedElement> children) {
//        for (WNamedElement elem : children) {
//            // Insert deps
//            WsDeps deps = new WsDeps(buildOld);
//            if (elem instanceof WType) {
//                IType type = (IType) JavaCore.create(elem.getHandler());
//                deps.addTypeToSearch(type);
//
//            } else if (elem instanceof WMethod) {
//                IMethod method = (IMethod) JavaCore.create(elem.getHandler());
//                deps.addMethodToSearch(method);
//            }
//
//            deps.execute();
//            updateChildrenDependenciesRecurive(elem.getChildren());
//        }
//    }

    private void refreshCompilationUnit(ICompilationUnit cu) {
        try {
            WCompilationUnit emfCu = (WCompilationUnit) modelOps.findJdtElementInEmfModel(cu);
            WNamedElement emfCuParent = modelOps.findJdtElementInEmfModel(cu.getParent());

            // remove old version of compilation unit
            for (Object emfCuO : emfCuParent.getChildren()) {
                WNamedElement emfCuToDel = (WNamedElement) emfCuO;
                if (emfCuToDel.getName().equals(cu.getElementName())) {
                    modelOps.removeNamedElement(emfCuToDel.getHandler());
                }
            }
            
            // add the updated compilation unit.
            WNamedElement emfNewCu = modelOps.addNamedElementToModel(emfCuParent, cu);
            for (IType t : cu.getAllTypes()) {
                WNamedElement newEmfType = modelOps.addNamedElementToModel(emfNewCu, t);
                
                for (IMethod m : t.getMethods()) {
                    modelOps.addNamedElementToModel(newEmfType, m);
                }
                for (IField f : t.getFields()) {
                    modelOps.addNamedElementToModel(newEmfType, f);
                }
            }
        } catch (JavaModelException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
//        // add the updated compilation unit.
//        WCompilationUnit newCu = null;
//        try {
//            newCu = WsStructure.createCompilationUnitModel(cu);
//        } catch (JavaModelException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        if (newCu != null)
//            wsModel.addNamedElementToModel(container, jdtItem)
    }
    
    

//    private static WWorkspace createModelOfModifiedProjects(IJavaElementDelta javaModelDelta) {
//        try {
//            WWorkspace wsAfterChanges = WsmodelFactory.eINSTANCE.createWWorkspace();
//            WsBuildPrimitives buildPrimitives = new WsBuildPrimitives(wsAfterChanges);
//
//            Set<IJavaProject> projects = new HashSet<IJavaProject>();
//            for (IJavaElementDelta child : javaModelDelta.getAffectedChildren()) {
//                if (Activator.getDefault().getWsService().isTracedProject(child.getElement().getJavaProject())) {
//                    projects.add(child.getElement().getJavaProject());
//                }
//            }
//
//            for (IJavaProject project : projects) {
//                WNamedElement emfProject = buildPrimitives.addNamedElementToModel(null, project);
//
//                // Add all package fragment roots which are actual folders and not jar archives
//                for (IPackageFragmentRoot pfr : project.getPackageFragmentRoots()) {
//                    if (!pfr.isArchive()) {
//                        WNamedElement emfPfr = buildPrimitives.addNamedElementToModel(emfProject, pfr);
//                        for (IJavaElement pkgObject : pfr.getChildren()) {
//                            IPackageFragment pkg = (IPackageFragment) pkgObject;
//                            WNamedElement emfpf = buildPrimitives.addNamedElementToModel(emfPfr, pkg);
//                            for (ICompilationUnit cu : pkg.getCompilationUnits()) {
//                                WNamedElement emfCu = buildPrimitives.addNamedElementToModel(emfpf, cu);
//                                for (IType t : cu.getTypes()) {
//                                    addType(emfCu, t, buildPrimitives);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//
//            return wsAfterChanges;
//        } catch (JavaModelException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    private static void addType(WNamedElement emfCu, IType t, WsBuildPrimitives buildPrimitives)
//            throws JavaModelException {
//        WNamedElement emfType = buildPrimitives.addNamedElementToModel(emfCu, t);
//        for (IType innerType : t.getTypes()) {
//            addType(emfCu, innerType, buildPrimitives);
//        }
//
//        for (IMethod m : t.getMethods()) {
//            buildPrimitives.addNamedElementToModel(emfType, m);
//        }
//
//        for (IField f : t.getFields()) {
//            buildPrimitives.addNamedElementToModel(emfType, f);
//        }
//    }

}
