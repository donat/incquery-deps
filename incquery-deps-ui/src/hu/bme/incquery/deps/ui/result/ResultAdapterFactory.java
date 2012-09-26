package hu.bme.incquery.deps.ui.result;

import hu.bme.incquery.deps.cp1model.CP1Class;
import hu.bme.incquery.deps.wsmodel.WMethod;
import hu.bme.incquery.deps.wsmodel.WNamedElement;
import hu.bme.incquery.deps.wsmodel.WPackageFragment;
import hu.bme.incquery.deps.wsmodel.WType;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import cern.devtools.deps.query.cp1.projectswithsamename.ProjectsWithSameNameMatch;

public class ResultAdapterFactory implements IAdapterFactory {

	private IWorkbenchAdapter adapter = new IWorkbenchAdapter() {

		@Override
		public Object getParent(Object o) {
			return ((ResultItem) o).getParent();
		}

		@Override
		public String getLabel(Object o) {
			if (o == null) {
				throw new RuntimeException("Invalid type");
			}
			ResultItem item = (ResultItem) o;
			Object obj = item.getObj();

			switch (item.getType()) {
			case NULL:
				return "Nothing to display";
			case PROJECT_ROOT:
				if (obj instanceof ProjectsWithSameNameMatch) {
					return String.format("Project %s (in repository)", ((ProjectsWithSameNameMatch) obj)
							.getRepoProject().getName());
				} else {
					return String.format("Project %s (not synchronized)", ((IJavaProject) obj).getElementName());
				}
			case TYPE_ADDED:
				return ((WPackageFragment) ((WType) obj).getParent().getParent()).getName() + "."
						+ ((WType) obj).getName() + "(+)";
			case TYPE_SYNC:
				return ((WPackageFragment) ((WType) obj).getParent().getParent()).getName() + "."
						+ ((WType) obj).getName();
			case TYPE_REMOVED:
			case TYPE_REMOTE:
				return ((CP1Class) obj).getPackageName() + "." + ((CP1Class) obj).getSimpleName() + "(-)";
			case DEPENDENCIES:
				return "Incoming dependencies";
			case METHODS:
				return "Methods";
			case METHOD_ADDED: 
				return ((WMethod)obj).getSignature() + "(+)";
				
				//
				// return "Project informations";
				// case PROJECT_IN_REPO:
				// return String.format("Project %s", ((CP1Project) item.getObj()).getName());
				// case ADDED_CLASSES_ROOT:
				// return "Added classes";
				// case REMOVED_CLASSES_ROOT:
				// return "Removed classes";
				// case WS_CLASS:
				// WType c = (WType) item.getObj();
				// return String.format("%s.%s", c.getCompilationUnit().getPackageFragment().getName(), c.getName());
				// case REPO_CLASS:
				// CP1Class c2 = (CP1Class) item.getObj();
				// return String.format("%s.%s", c2.getPackageName(), c2.getSimpleName());
				// case CU_ROOT:
				// return String.format("Dependency information for %s",
				// ((ICompilationUnit)item.getObj()).getElementName());
				// case NOT_DEFINED:
				// return "This item is not defined in the repository";
				// case JDT_TYPE:
				// return ((IType)item.getObj()).getElementName();
				// case INCOMING_DEPENDENCY_ROOT:
				// return "Incoming dependencies";
			default:
				return item.getType().toString();
			}
		}

		@Override
		public ImageDescriptor getImageDescriptor(Object object) {
			return null;
		}

		@Override
		public Object[] getChildren(Object o) {
			return ((ResultItem) o).getChildren().toArray();
		}
	};

	@Override
	public Object getAdapter(Object adaptableObject, @SuppressWarnings("rawtypes") Class adapterType) {
		if (adapterType == IWorkbenchAdapter.class && adaptableObject instanceof ResultItem) {
			return adapter;
		} else
			return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getAdapterList() {
		return new Class[] { IWorkbenchAdapter.class };
	}

}
