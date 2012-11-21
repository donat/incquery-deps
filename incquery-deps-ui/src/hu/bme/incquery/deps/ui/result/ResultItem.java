package hu.bme.incquery.deps.ui.result;

import java.util.EnumSet;
import java.util.Iterator;
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
	 * 
	 * @param parent
	 *            The parent node
	 * @param type
	 *            Node type
	 * @param obj
	 *            The represented object
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

	/**
	 * Created new node, without a represented object. Using this constructor result in getting a <code>null</code> by
	 * calling the {@link #getObj()} method.
	 * 
	 * @param parent
	 *            The parent node
	 * @param type
	 *            Node type
	 */
	protected ResultItem(ResultItem parent, ResultItemType type) {
		this(parent, type, null);
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
	
	public Iterator<ResultItem> iterator() {
		return new ResultItemIterator(this);
	}
	
	public Iterator<ResultItem> iterator(ResultItemType searchedType) {
		return new ResultItemIterator(this, EnumSet.of(searchedType));
	}

	@Override
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}
}