package hu.bme.incquery.deps.ui.result;

import hu.bme.incquery.deps.cp1model.CP1Class;
//import hu.bme.incquery.deps.cp1model.CP1PRoject;
import hu.bme.incquery.deps.engine.IncQueryDepsChangeListener;
//import hu.bme.incquery.deps.wsmodel.WProject;
import hu.bme.incquery.deps.wsmodel.WType;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
//import org.eclipse.jdt.core.IType;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;

//import cern.devtools.deps.query.cp1.addedclasses.AddedClassesMatcher;
//import cern.devtools.deps.query.cp1.fieldsinwstype.FieldsInWsTypeMatch;
//import cern.devtools.deps.query.cp1.fieldsinwstype.FieldsInWsTypeMatcher;
//import cern.devtools.deps.query.cp1.incomingclassusages.IncomingClassUsagesMatcher;
//import cern.devtools.deps.query.cp1.incominginheritances.IncomingInheritancesMatch;
//import cern.devtools.deps.query.cp1.incominginheritances.IncomingInheritancesMatcher;
//import cern.devtools.deps.query.cp1.methodsinwstype.MethodsInWsTypeMatch;
//import cern.devtools.deps.query.cp1.methodsinwstype.MethodsInWsTypeMatcher;
//import cern.devtools.deps.query.cp1.projectswithsamename.ProjectsWithSameNameMatch;
//import cern.devtools.deps.query.cp1.projectswithsamename.ProjectsWithSameNameMatcher;
//import cern.devtools.deps.query.cp1.removedclasses.RemovedClassesMatcher;
//import cern.devtools.deps.query.cp1.removedclassesfromproject.RemovedClassesFromProjectMatch;
//import cern.devtools.deps.query.cp1.removedclassesfromproject.RemovedClassesFromProjectMatcher;
//import cern.devtools.deps.query.cp1.typesinwsproject.TypesInWsProjectMatch;
//import cern.devtools.deps.query.cp1.typesinwsproject.TypesInWsProjectMatcher;

/**
 * 
 * @author dcsikos
 * 
 */
@SuppressWarnings("all")
public class ResultContentProvider implements ITreeContentProvider, IncQueryDepsChangeListener {

	private TreeViewer viewer;
	private IJavaProject selectedProject;
	private ICompilationUnit selectedCU;
//	private ProjectsWithSameNameMatcher projectsWithSameName;
//	private AddedClassesMatcher addedClassesMatcher;
//	private TypesInWsProjectMatcher typesInWsProjectMatcher;
//	private RemovedClassesFromProjectMatcher removedClassesFromProjectMatcher;
//	private MethodsInWsTypeMatcher methodsInWsTypeMatcher;
//	private FieldsInWsTypeMatcher fieldsInWsTypeMatcher;
//	private IncomingClassUsagesMatcher incomingClassUsagesMatcher;
//	private IncomingInheritancesMatcher incomingInheritancesMatcher;

	public ResultContentProvider(TreeViewer viewer) {
		this.viewer = viewer;
		hu.bme.incquery.deps.engine.Activator
				.getDefault()
				.getIncQueryDepsEngine()
				.registerChangeListener(this/*,ProjectsWithSameNameMatcher.class, AddedClassesMatcher.class,
						RemovedClassesMatcher.class, TypesInWsProjectMatcher.class,
						RemovedClassesFromProjectMatcher.class, FieldsInWsTypeMatcher.class,
						MethodsInWsTypeMatcher.class, IncomingClassUsagesMatcher.class, IncomingInheritancesMatcher.class*/);
	}

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// Do nothing
	}

	@Override
	public Object[] getElements(Object inputElement) {
		// If a compilation unit is selected , build it.
		if (inputElement instanceof ICompilationUnit) {
			return buildCompilationUnit((ICompilationUnit) inputElement);
		}
		// Else display info for the entire project.
		else if (inputElement instanceof IJavaProject) {
			return buildJavaProject((IJavaProject) inputElement);
		}
		// Or the third option: does not display anything.
		return new Object[] { new ResultItem(null, ResultItemType.NULL, null) };
	}

	private Object[] buildJavaProject(IJavaProject selectedProject) {
		// Store selected project.
		this.selectedProject = selectedProject;

		// Add joined project information.
		ResultItem root = buildProjectRoot(selectedProject);

		// Build only if it is a traced project.
//		if (root.getObj() instanceof ProjectsWithSameNameMatch) {
//
//			// Build classes
//			buildAllProjectTypes(root);
//		}

		return new Object[] { root };
	}

	private ResultItem buildProjectRoot(IJavaProject project) {
//		if (projectsWithSameName != null) {
//			Collection<ProjectsWithSameNameMatch> tracedProjectsMatches = projectsWithSameName.getAllMatches();
//			for (ProjectsWithSameNameMatch match : tracedProjectsMatches) {
//				if (match.getWsProject().getHandler().equals(project.getHandleIdentifier())) {
//					return new ResultItem(null, ResultItemType.PROJECT_ROOT, match);
//				}
//			}
//		}
		return new ResultItem(null, ResultItemType.PROJECT_ROOT, project);
	}

	private void buildAllProjectTypes(ResultItem root) {
		Collection<CP1Class> removedTypes = new LinkedList<CP1Class>();
		Collection<WType> addedOrSyncTypes = new LinkedList<WType>();

		// add sync and added types
//		if (typesInWsProjectMatcher != null) {
//			ProjectsWithSameNameMatch projectMatch = (ProjectsWithSameNameMatch) root.getObj();
//			CP1Project repoProject = projectMatch.getRepoProject();
//			WProject wsProject = projectMatch.getWsProject();
//			for (TypesInWsProjectMatch m : typesInWsProjectMatcher.getAllMatches(null, wsProject)) {
//				// check if a type is added
//				WType type = m.getWsType();
//				addedOrSyncTypes.add(type);
//			}
//
//			if (removedClassesFromProjectMatcher != null) {
//				for (RemovedClassesFromProjectMatch m : removedClassesFromProjectMatcher.getAllMatches(null,
//						repoProject)) {
//					removedTypes.add(m.getRepoClass());
//				}
//			}
//
//			buildTypes(root, removedTypes, addedOrSyncTypes);
//		}
//
	}

	private void buildTypes(ResultItem root, Collection<CP1Class> removedTypes, Collection<WType> addedOrSyncTypes) {
		for (WType addedOrSyncType : addedOrSyncTypes) {
//			if (addedClassesMatcher.getAllMatches(addedOrSyncType).size() > 0) {
//				ResultItem node = new ResultItem(root, ResultItemType.TYPE_ADDED, addedOrSyncType);
//				// TODO: add dependencies.
//				buildClassSubTree(node);
//
//			} else {
//				ResultItem node = new ResultItem(root, ResultItemType.TYPE_SYNC, addedOrSyncType);
//				buildClassSubTree(node);
//			}
		}

		for (CP1Class removedType : removedTypes) {
			ResultItem node = new ResultItem(root, ResultItemType.TYPE_REMOVED, removedType);
			buildClassSubTree(node);
		}

	}

	private void buildClassSubTree(ResultItem classNode) {
		buildClassDependenciesSubTree(classNode);
		buildMethodsSubtTree(classNode);
		buildFieldsSubtTree(classNode);
	}

	private void buildClassDependenciesSubTree(ResultItem node) {
		ResultItem depRoot = new ResultItem(node, ResultItemType.DEPENDENCIES, null);

		if (node.getType() == ResultItemType.TYPE_SYNC) {
			// Build incoming dependencies
//			for (IncomingInheritancesMatch m : incomingInheritancesMatcher.getAllMatches(null, (WType)node.getObj())) {
//				new ResultItem(depRoot, ResultItemType.TYPE_SYNC, m.getRepoSource());
//				
//			}
		} else if (node.getType() == ResultItemType.TYPE_REMOVED) {
			// Build impact dependencies
		}

	}

	private void buildMethodsSubtTree(ResultItem classNode) {
		ResultItem methodsRoot = new ResultItem(classNode, ResultItemType.METHODS, null);
		
		if (classNode.getType() == ResultItemType.TYPE_ADDED || classNode.getType() == ResultItemType.TYPE_SYNC) {
			// Add new and sync methods
//			for (MethodsInWsTypeMatch match : methodsInWsTypeMatcher.getAllMatches(null, (WType) classNode.getObj())) {
//				new ResultItem(methodsRoot, ResultItemType.METHOD_ADDED, match.getWsMethod());
//			}

			// Add removed methods
		} else if (classNode.getType() == ResultItemType.TYPE_REMOVED) {

		}

		else
			throw new RuntimeException("Invalid node type:" + classNode.getType());

	}

	private void buildFieldsSubtTree(ResultItem classNode) {
		// TODO Auto-generated method stub

	}

	private Object[] buildCompilationUnit(ICompilationUnit cu) {
		// Save compilation unit reference and create root for the result.
		this.selectedCU = cu;
		ResultItem root = new ResultItem(null, ResultItemType.CU_ROOT, cu);

		// Add all types to the root.
		// addTypes(root);

		// Return the tree root.
		return new Object[] { root };

	}

	// private Object[] wsClassIfExistInRepoOrNull(IType obj) {
	// if (classesWithSameName == null) {
	// return null;
	// }
	//
	// for (ClassesWithSameFQNAndSameProjectMatch m : classesWithSameName) {
	// if (m.getWsClass().getHandler().equals(obj.getHandleIdentifier())) {
	// return new Object[] { m.getWsClass(), m.getRepoClass() };
	// }
	// }
	// return null;
	// }
	//
	// private void addTypes(ResultItem root) {
	// try {
	// for (IType t : ((ICompilationUnit) root.getObj()).getAllTypes()) {
	// ResultItem jdtTypeItem = new ResultItem(root, ResultItemType.JDT_TYPE, t);
	//
	// Object[] classes = wsClassIfExistInRepoOrNull(t);
	// if (classes == null) {
	// new ResultItem(jdtTypeItem, ResultItemType.NOT_DEFINED, null);
	// } else {
	// buildDepInfoTreeForType(jdtTypeItem, (WType) classes[0], (CP1Class) classes[1]);
	// }
	// }
	// } catch (Exception e) {
	// throw new RuntimeException(e);
	// }
	// }

	/**
	 * Build info tree: incoming dependencies, added/removed methods, added/removed fields.
	 * 
	 * @param root
	 * @param wsClass
	 * @param repoClass
	 */
	private void buildDepInfoTreeForType(ResultItem root, WType wsClass, CP1Class repoClass) {
		// // Add incoming dependencies.
		//
		// ResultItem incDepsRoot = new ResultItem(root, ResultItemType.INCOMING_DEPENDENCY_ROOT, null);
		// if (incomingClassUsagesMatcher != null && incomingInheritancesMatcher != null) {
		// for (IncomingClassUsagesMatch m : incomingClassUsagesMatcher.getAllMatches(null, wsClass)) {
		// new ResultItem(incDepsRoot, ResultItemType.INCDEP_CLASS_USAGE, m.getRepoSource());
		// }
		// for (IncomingInheritancesMatch m : incomingInheritancesMatcher.getAllMatches(null, wsClass)) {
		// new ResultItem(incDepsRoot, ResultItemType.INCDEP_INHERITANCE, m.getRepoSource());
		// }
		// }
		//
		// // Add methods.
		// ResultItem methodsNode = new ResultItem(root, ResultItemType.METHODS_ROOT, null);
		// for (WMethod m : wsClass.getMethods()) {
		// new ResultItem(methodsNode, ResultItemType.METHOD, m);
		// }
		//
		// // Add fields.
		// ResultItem fieldsroot = new ResultItem(root, ResultItemType.FIELDS_ROOT, null);
		// for (WField f : wsClass.getFields()) {
		// new ResultItem(fieldsroot, ResultItemType.FIELD, f);
		// }

	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof ResultItem) {
			return ((ResultItem) parentElement).getChildren().toArray();
		} else
			return null;
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof ResultItem) {
			return ((ResultItem) element).getParent();
		} else
			return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof ResultItem) {
			return !((ResultItem) element).getChildren().isEmpty();
		} else
			return false;
	}

	@Override
	@SuppressWarnings("rawtypes")
	public void matchesChanged(IncQueryMatcher matcher) {
//		if (matcher instanceof ProjectsWithSameNameMatcher) {
//			projectsWithSameName = (ProjectsWithSameNameMatcher) matcher;
//		} else if (matcher instanceof AddedClassesMatcher) {
//			addedClassesMatcher = (AddedClassesMatcher) matcher;
//		} else if (matcher instanceof TypesInWsProjectMatcher) {
//			typesInWsProjectMatcher = (TypesInWsProjectMatcher) matcher;
//		} else if (matcher instanceof RemovedClassesFromProjectMatcher) {
//			removedClassesFromProjectMatcher = (RemovedClassesFromProjectMatcher) matcher;
//		} else if (matcher instanceof FieldsInWsTypeMatcher) {
//			fieldsInWsTypeMatcher = (FieldsInWsTypeMatcher) matcher;
//		} else if (matcher instanceof MethodsInWsTypeMatcher) {
//			methodsInWsTypeMatcher = (MethodsInWsTypeMatcher) matcher;
//		}
//		else if (matcher instanceof IncomingInheritancesMatcher) {
//			incomingInheritancesMatcher = (IncomingInheritancesMatcher) matcher;
//		}
//		else if (matcher instanceof IncomingClassUsagesMatcher) {
//			incomingClassUsagesMatcher = (IncomingClassUsagesMatcher) matcher;
//		}

		if (!Display.getDefault().isDisposed()) {
			Display.getDefault().syncExec(new Runnable() {

				@Override
				public void run() {
					viewer.refresh();
					viewer.expandAll();
				}
			});
		}
	}

}
