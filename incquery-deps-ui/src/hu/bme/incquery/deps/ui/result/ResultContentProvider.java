package hu.bme.incquery.deps.ui.result;

import hu.bme.incquery.deps.cp1model.CP1Project;
import hu.bme.incquery.deps.engine.IncQueryDepsChangeListener;

import java.util.Collection;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;

import cern.devtools.deps.query.cp1.addedclasses.AddedClassesMatch;
import cern.devtools.deps.query.cp1.addedclasses.AddedClassesMatcher;
import cern.devtools.deps.query.cp1.projectswithsamename.ProjectsWithSameNameMatch;
import cern.devtools.deps.query.cp1.projectswithsamename.ProjectsWithSameNameMatcher;
import cern.devtools.deps.query.cp1.removedclasses.RemovedClassesMatch;
import cern.devtools.deps.query.cp1.removedclasses.RemovedClassesMatcher;

/**
 * 
 * @author dcsikos
 * 
 */
public class ResultContentProvider implements ITreeContentProvider, IncQueryDepsChangeListener {

	private Viewer viewer;
	private Collection<ProjectsWithSameNameMatch> projectsWithSame;
	private Collection<AddedClassesMatch> addedClasses;
	private IJavaProject selectedProject;
	private Collection<RemovedClassesMatch> removedClasses;

	public ResultContentProvider(Viewer viewer) {
		this.viewer = viewer;
		hu.bme.incquery.deps.engine.Activator.getDefault().getIncQueryDepsEngine()
				.registerChangeListener(this, ProjectsWithSameNameMatcher.class, AddedClassesMatcher.class, RemovedClassesMatcher.class);
	}

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof ICompilationUnit) {
			return buildCompilationUnitResult((ICompilationUnit) inputElement);
		} else if (inputElement instanceof IJavaProject) {
			return buildJavaProject((IJavaProject) inputElement);
		}
		return new Object[] { new ResultItem(null, ResultItemType.NULL, null) };
	}

	private Object[] buildJavaProject(IJavaProject selectedProject) {
		// Store selected project.
		this.selectedProject = selectedProject;
		
		// Add joined project information.
		ResultItem root = new ResultItem(null, ResultItemType.PROJECT_ROOT, null);
		projectAddSameProjectInWorkspace(root);
		
		// Add added classes.
		ResultItem acr = new ResultItem(root, ResultItemType.ADDED_CLASSES_ROOT, null);
		addedClasses(acr);
		
		// Add removed classes.
		ResultItem rcr  = new ResultItem(root, ResultItemType.REMOVED_CLASSES_ROOT, null);
		removedClasses(rcr);
		
		return new Object[] { root };
	}

	

	private void addedClasses(ResultItem root) {
		if (addedClasses != null) {
			for (AddedClassesMatch m : addedClasses) {
				if (m.getWsClass().getCompilationUnit().getPackageFragment().getPackageFragmentRoot().getProject()
						.getHandler().equals(selectedProject.getHandleIdentifier())) {
					new ResultItem(root, ResultItemType.WS_CLASS, m.getWsClass());
				}
			}
		}
	}
	
	private void removedClasses(ResultItem rcr) {
		if (removedClasses != null) {
			for (RemovedClassesMatch m : removedClasses) {
				if (((CP1Project)m.getWsClass().eContainer()).getName().equals(selectedProject.getElementName())) {
					new ResultItem(rcr, ResultItemType.REPO_CLASS, m.getWsClass());
				}
			}
		}
	}

	private void projectAddSameProjectInWorkspace(ResultItem root) {
		if (projectsWithSame != null) {
			for (ProjectsWithSameNameMatch m : projectsWithSame) {
				new ResultItem(root, ResultItemType.PROJECT_IN_REPO, m.getRepoProject());
			}
		}
	}

	private Object[] buildCompilationUnitResult(ICompilationUnit inputElement) {
		return new Object[] { new ResultItem(null, ResultItemType.NULL, null) };

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
		if (matcher instanceof ProjectsWithSameNameMatcher) {
			ProjectsWithSameNameMatcher m = (ProjectsWithSameNameMatcher) matcher;
			projectsWithSame = m.getAllMatches();
		}

		else if (matcher instanceof AddedClassesMatcher) {
			AddedClassesMatcher m = (AddedClassesMatcher) matcher;
			addedClasses = m.getAllMatches();
		}
		
		else if (matcher instanceof RemovedClassesMatcher) {
			RemovedClassesMatcher m = (RemovedClassesMatcher) matcher;
			removedClasses = m.getAllMatches();
		}

		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				viewer.refresh();
			}
		});
	}

}
