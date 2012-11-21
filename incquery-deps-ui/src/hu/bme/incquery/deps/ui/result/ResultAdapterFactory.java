package hu.bme.incquery.deps.ui.result;

//import hu.bme.incquery.deps.cp1model.CP1Class;
//import hu.bme.incquery.deps.wsmodel.WMethod;
//import hu.bme.incquery.deps.wsmodel.WNamedElement;
//import hu.bme.incquery.deps.wsmodel.WPackageFragment;
//import hu.bme.incquery.deps.wsmodel.WType;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
//import org.eclipse.jdt.core.IJavaProject;

//import cern.devtools.deps.query.cp1.projectswithsamename.ProjectsWithSameNameMatch;

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
			case CU_ROOT: 
				ICompilationUnit cu = (ICompilationUnit) obj;
				return cu.getElementName();
			case TYPE_ROOT:
				return "classes";
			case METHOD_ROOT:
				return "methods";
			case FIELD_ROOT:
				return "fields";
			case JDT_FIELD:
				return "field " + ((IField) obj).getElementName();
			case JDT_TYPE:
				return "class " + ((IType) obj).getElementName();
			case JDT_METHOD: 
				return ((IMethod)obj).getElementName() + "()";
			default:
				String result = item.getType().toString();
				if (obj != null) {
					result += " (" + obj.toString() + ")";
				}
				return result;
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
