package hu.bme.incquery.deps.wsmodel.impl;

import hu.bme.incquery.deps.wsmodel.WNamedElement;
import hu.bme.incquery.deps.wsmodel.WWorkspace;

import java.util.Collection;

public class EmfModelUtils {
	public static String printModel(WWorkspace ws) {
		StringBuffer buffer = new StringBuffer();
		return printModel(ws.getProjects(), "", buffer);
	}

	@SuppressWarnings("unchecked")
	private static String printModel(Collection<? extends WNamedElement> cne, String indent, StringBuffer buffer) {
		for (WNamedElement ne : cne) {
			buffer.append(indent);
			buffer.append(ne);
			buffer.append("\n");
			printModel(ne.getChildren(), indent + "  ", buffer);
		}

		return buffer.toString();
	}

}
