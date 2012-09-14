package hu.bme.incquery.deps.ui.result;

import hu.bme.incquery.deps.cp1model.CP1Class;
import hu.bme.incquery.deps.cp1model.CP1Project;
import hu.bme.incquery.deps.wsmodel.WType;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

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

			switch (item.getType()) {
			case NULL:
				return "Invalid selection";
			case PROJECT_ROOT:
				return "Project informations";
			case PROJECT_IN_REPO:
				return String.format("Project %s", ((CP1Project) item.getObj()).getName());
			case ADDED_CLASSES_ROOT:
				return "Added classes";
			case REMOVED_CLASSES_ROOT:
				return "Removed classes";
			case WS_CLASS:
				WType c = (WType) item.getObj();
				return String.format("%s.%s", c.getCompilationUnit().getPackageFragment().getName(), c.getName());
			case REPO_CLASS: 
				CP1Class c2 = (CP1Class) item.getObj();
				return String.format("%s.%s", c2.getPackageName(), c2.getSimpleName());
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
