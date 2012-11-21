package hu.bme.incquery.deps.ui.result;

import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ResultItemIterator implements Iterator<ResultItem> {

	private final List<ResultItem> allDescendants = new LinkedList<ResultItem>();
	private final EnumSet<ResultItemType> filter;
	private int cIndex = -1; // current index

	public ResultItemIterator(ResultItem root, EnumSet<ResultItemType> filter){
		this.filter = filter;
		initDescendants(root);
	}
	
	private void initDescendants(ResultItem root) {
		if (root == null) {
			return;
		}
		initDescendants(Arrays.asList(root));
	}
	
	private void initDescendants(Collection<ResultItem> items) {
		for (ResultItem item : items) {
			if (filter.contains(item.getType())) {
				allDescendants.add(item);
			}
			initDescendants(item.getChildren());
		}
	}

	public ResultItemIterator(ResultItem root){
		this (root, EnumSet.allOf(ResultItemType.class));
	}
	
	@Override
	public boolean hasNext() {
		return (cIndex + 1) < allDescendants.size();
	}

	@Override
	public ResultItem next() {
		return allDescendants.get(++cIndex);
	}

	@Override
	public void remove() {
		allDescendants.remove(allDescendants.get(cIndex));
		
	}

}
