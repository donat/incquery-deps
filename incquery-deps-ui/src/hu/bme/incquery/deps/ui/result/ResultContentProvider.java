package hu.bme.incquery.deps.ui.result;

import hu.bme.incquery.deps.cp3model.CP3Class;
import hu.bme.incquery.deps.cp3model.CP3Method;
import hu.bme.incquery.deps.cp3model.CP3Project;
import hu.bme.incquery.deps.pub.IncQueryDepsChangeListener;
import hu.bme.incquery.deps.util.DependencyType;
import hu.bme.incquery.deps.util.LoggingUtil;
import hu.bme.incquery.deps.wsmodel.WMethod;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.internal.win32.DWM_BLURBEHIND;
import org.eclipse.swt.widgets.Display;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;

import cern.devtools.deps.query.cp3.addedclasses.AddedClassesMatch;
import cern.devtools.deps.query.cp3.addedclasses.AddedClassesMatcher;
import cern.devtools.deps.query.cp3.impactcausedbyremovedclasses.ImpactCausedByRemovedClassesMatch;
import cern.devtools.deps.query.cp3.impactcausedbyremovedclasses.ImpactCausedByRemovedClassesMatcher;
import cern.devtools.deps.query.cp3.incomingmethodcalls.IncomingMethodCallsMatch;
import cern.devtools.deps.query.cp3.incomingmethodcalls.IncomingMethodCallsMatcher;
import cern.devtools.deps.query.cp3.removedclasses.RemovedClassesMatch;
import cern.devtools.deps.query.cp3.removedclasses.RemovedClassesMatcher;

/**
 * 
 * @author dcsikos
 * 
 */
@SuppressWarnings("all")
public class ResultContentProvider implements ITreeContentProvider, IncQueryDepsChangeListener {

	// private TreeViewer viewer;
	private IJavaProject selectedProject;
	private ICompilationUnit selectedCU;

	private TreeViewer viewer;
	private Set<IncQueryMatcher<IPatternMatch>> matchers;

	public ResultContentProvider() {
	}

	public void setViewer(TreeViewer viewer) {
		this.viewer = viewer;
	}

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
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
		} else if (inputElement instanceof IMethod) {
			return buildJavaMethod((IMethod) inputElement);
		}
		// Or the third option: does not display anything.
		return new Object[] { new ResultItem(null, ResultItemType.NULL, null) };
	}

	private Object[] buildJavaProject(IJavaProject selectedProject) {
		// Store selected project.
		this.selectedProject = selectedProject;

		// Add joined project information.
		ResultItem root = buildProjectRoot(selectedProject);

		return new Object[] { root };
	}

	private Object[] buildJavaMethod(IMethod inputElement) {
		//ResultItem root = new ResultItem(null, ResultItemType.JDT_METHOD, inputElement);
		ResultItem root = new ResultItem(null, ResultItemType.STRING, "Incoming method calls");
		IncomingMethodCallsMatcher matcher = getMatcher(IncomingMethodCallsMatcher.class);		
		
		String hi = inputElement.getHandleIdentifier();
		for (IncomingMethodCallsMatch match : matcher.getAllMatches()) {
			WMethod wMethod = match.getWsTarget();
			if (wMethod.getHandler().equals(hi)) {
				
				CP3Method sourceMethod = match.getRepoSource();
				CP3Class sourceClass = sourceMethod.getClasses().get(0);
				CP3Project sourceProject = sourceClass.getProjects().get(0);
				
				String result = sourceClass.getName() + "#" + sourceMethod.getName() + "() in project " + sourceProject.getName();
				
				new ResultItem(root, ResultItemType.STRING, result);
			}
		}
		
		return new Object[] { root };
	}

	private ResultItem buildProjectRoot(IJavaProject project) {
		ResultItem root = new ResultItem(null, ResultItemType.PROJECT_ROOT, project);
		ResultItem addedClassesRoot = new ResultItem(root, ResultItemType.ADDED_CLASSES);
		ResultItem removedClassesroot = new ResultItem(root, ResultItemType.REMOVED_CLASSES);

		for (IncQueryMatcher<? extends IPatternMatch> matcher : matchers) {
			if (matcher instanceof AddedClassesMatcher) {
				for (IPatternMatch match : matcher.getAllMatches()) {
					AddedClassesMatch m = (AddedClassesMatch) match;
					if (m.getWsProject().getName().equals(project.getElementName())) {
						new ResultItem(addedClassesRoot, ResultItemType.JDT_TYPE, JavaCore.create(m.getWsClass()
								.getHandler()));
					}
				}
			} else if (matcher instanceof RemovedClassesMatcher) {
				RemovedClassesMatcher matcher2 = (RemovedClassesMatcher) matcher;
				for (RemovedClassesMatch match : matcher2.getAllMatches()) {
					RemovedClassesMatch m = (RemovedClassesMatch) match;
					for (CP3Project p : m.getRepoClass().getProjects()) {
						if (p.getName().equals(project.getElementName())) {
							ResultItem removedClassNode = new ResultItem(removedClassesroot, ResultItemType.STRING, m
									.getRepoClass().getName());
							ResultItem removedClassImpactNode = new ResultItem(removedClassesroot,
									ResultItemType.STRING, "Referenced by");

							// add impact to this node
							ImpactCausedByRemovedClassesMatcher impact1 = selectMatcher(ImpactCausedByRemovedClassesMatcher.class);
							Collection<ImpactCausedByRemovedClassesMatch> classImpact = impact1.getAllMatches(null,
									m.getRepoClass(), null);

							for (ImpactCausedByRemovedClassesMatch im : classImpact) {
								new ResultItem(removedClassImpactNode, ResultItemType.STRING, im.getRepoFrom()
										.getName() + "(" + DependencyType.typeOf(im.getType()) + ")");
							}

						}
					}
				}
			}
		}

		return root;
	}

	private <T extends IncQueryMatcher<?>> T selectMatcher(Class<T> matcherClass) {
		if (matchers == null) {
			return null;
		}
		for (Object m : matchers) {
			if (m.getClass().equals(matcherClass)) {
				return (T) m;
			}
		}
		return null;
	}

	private Object[] buildCompilationUnit(ICompilationUnit cu) {
		// Add internal type and method nodes.
		ResultItem root = buildStructureNode(cu);

		// Use IncQuery info to attach dependency info to the tree.

		appendDependencyNodes(root);
		// Return the tree root.
		return new Object[] { root };
	}

	private ResultItem buildStructureNode(ICompilationUnit cu) {
		// Save compilation unit reference and create root for the result.
		this.selectedCU = cu;
		ResultItem root = new ResultItem(null, ResultItemType.CU_ROOT, cu);

		// Add all types to the root.
		Collection<ResultItem> typeNodes = addTypes(root);

		// Add method children to the type nodes.
		for (ResultItem typeNode : typeNodes) {
			addMethods(typeNode);
			addFields(typeNode);
		}
		return root;
	}

	private Collection<ResultItem> addTypes(ResultItem root) {
		// Add separate root for the types.
		ResultItem typeRoot = new ResultItem(root, ResultItemType.TYPE_ROOT);

		// Collect type nodes.
		Collection<ResultItem> typeNodes = new LinkedList<ResultItem>();

		try {
			// Create a type node for every type inside.
			for (IType t : ((ICompilationUnit) root.getObj()).getAllTypes()) {
				ResultItem typeNode = new ResultItem(typeRoot, ResultItemType.JDT_TYPE, t);
				typeNodes.add(typeNode);
			}

		} catch (Exception e) {
			// Just log, the children won't be displayed and that is it.
			LoggingUtil.logWarn(e);
		}

		return typeNodes;
	}

	private void addMethods(ResultItem root) {
		// Add separate root for the methods.
		ResultItem methodRoot = new ResultItem(root, ResultItemType.METHOD_ROOT);

		// Acquire root type.
		Object rootTypeObject = root.getObj();
		if (rootTypeObject == null || !(rootTypeObject instanceof IType)) {
			throw new RuntimeException("Method nodes should be added below type nodes");
		}
		IType rootType = (IType) rootTypeObject;

		// Instantiate the method objects
		try {
			for (IMethod m : rootType.getMethods()) {
				new ResultItem(methodRoot, ResultItemType.JDT_METHOD, m);
			}
		} catch (JavaModelException e) {
			LoggingUtil.logWarn(e);
		}
	}

	private void addFields(ResultItem root) {
		// Add separate root for the methods.
		ResultItem methodRoot = new ResultItem(root, ResultItemType.FIELD_ROOT);

		// Acquire root type.
		Object rootTypeObject = root.getObj();
		if (rootTypeObject == null || !(rootTypeObject instanceof IType)) {
			throw new RuntimeException("Field nodes should be added below type nodes");
		}
		IType rootType = (IType) rootTypeObject;

		// Instantiate the field objects
		try {
			for (IField m : rootType.getFields()) {
				new ResultItem(methodRoot, ResultItemType.JDT_FIELD, m);
			}
		} catch (JavaModelException e) {
			LoggingUtil.logWarn(e);
		}
	}

	private void appendDependencyNodes(ResultItem root) {
		// Test: add incoming dependencies into the type nodes.
		Iterator<ResultItem> it = root.iterator(ResultItemType.JDT_TYPE);
		while (it.hasNext()) {
			ResultItem ri = it.next();
			new ResultItem(ri, ResultItemType.STRING, "Here comes the incoming dependency");
		}
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
	public void matchesChanged(Set<IncQueryMatcher<IPatternMatch>> matcher) {
		refreshViewer();
	}

	private void refreshViewer() {
		if (viewer != null) {
			Display.getDefault().syncExec(new Runnable() {

				@Override
				public void run() {
					viewer.refresh();
				}
			});
		}
	}

	@Override
	public void init(Set<IncQueryMatcher<IPatternMatch>> matchers) {
		this.matchers = matchers;
		fillMatcherMap(matchers);
		refreshViewer();
	}

	Map<Class<?>, IncQueryMatcher<? extends IPatternMatch>> matcherMap = new HashMap<Class<?>, IncQueryMatcher<? extends IPatternMatch>>();

	private void fillMatcherMap(Set<IncQueryMatcher<IPatternMatch>> matchers) {
		for (IncQueryMatcher<? extends IPatternMatch> matcher : matchers) {
			matcherMap.put(matcher.getClass(), matcher);
		}
	}

	@SuppressWarnings("unchecked")
	private <T> T getMatcher(Class<T> mClass) {
		return (T) matcherMap.get(mClass);
	}

}
