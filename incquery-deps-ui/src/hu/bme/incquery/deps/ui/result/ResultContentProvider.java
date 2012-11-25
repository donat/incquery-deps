package hu.bme.incquery.deps.ui.result;

import hu.bme.incquery.deps.pub.IncQueryDepsChangeListener;
import hu.bme.incquery.deps.util.LoggingUtil;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;

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

	public ResultContentProvider(TreeViewer viewer) {
		this.viewer = viewer;
		// hu.bme.incquery.deps.engine.Activator
		// .getDefault()
		// .getIncQueryDepsEngine()
		// .registerChangeListener(this/*,ProjectsWithSameNameMatcher.class, AddedClassesMatcher.class,
		// RemovedClassesMatcher.class, TypesInWsProjectMatcher.class,
		// RemovedClassesFromProjectMatcher.class, FieldsInWsTypeMatcher.class,
		// MethodsInWsTypeMatcher.class, IncomingClassUsagesMatcher.class, IncomingInheritancesMatcher.class*/);
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

		return new Object[] { root };
	}

	private ResultItem buildProjectRoot(IJavaProject project) {
		return new ResultItem(null, ResultItemType.PROJECT_ROOT, project);
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
	@SuppressWarnings("rawtypes")
	public void matchesChanged(IncQueryMatcher matcher) {

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
