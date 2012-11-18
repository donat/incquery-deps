
package hu.bme.incquery.deps.ui.result;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;


 public class ResultItem implements IAdaptable {
	
	private final ResultItemType type;
	
	private List<ResultItem> children;

	private ResultItem parent;

	private final Object obj;

	/**
	 * Created new node 
	 * @param parent The parent node
	 * @param type Node type
	 * @param obj The represented object
	 */
	protected ResultItem(ResultItem parent, ResultItemType type, Object obj) {
		this.obj = obj;
		if (type == null) {
			throw new RuntimeException("The type must be specified");
		}
		
		this.setParent(parent);
		if (parent != null) {
			parent.getChildren().add(this);
		}
		this.type = type;

	}

	public ResultItem getParent() {
		return parent;
	}

	public void setParent(ResultItem parent) {
		this.parent = parent;
	}

	public ResultItemType getType() {
		return type;
	}

	public List<ResultItem> getChildren() {
		return children == null ? (children = new LinkedList<ResultItem>()) : children;
	}

	public Object getObj() {
		return obj;
	}

	@Override
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}
}