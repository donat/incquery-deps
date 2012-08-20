package cern.devtools.depanalysis.modelfinder;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;

public class DeltaDisplay {

	private static final String INDENT = "\t";

	public static void display(IJavaElementDelta delta) {
		display(delta, "");
	}

	private static void display(IJavaElementDelta delta, String indent) {
		IJavaElement elem = delta.getElement();
		IJavaElement from = delta.getMovedFromElement();
		IJavaElement to = delta.getMovedToElement();

		System.out.println(indent + "delta kind: " + JdtUtils.getDeltaKind(delta.getKind()));
		System.out.println(indent + "element name: " + elem.getElementName());
		System.out.println(indent + "element type: " + JdtUtils.getJavaElemType(elem.getElementType()));
		System.out.println(indent + "element hndl: " + delta.getElement().getHandleIdentifier());
		System.out.println(indent + "from: " + (from == null ? "" : from.getElementName()));
		System.out.println(indent + "to: " + (to == null ? "" : to.getElementName()));
		System.out.println("---------------------------------------------------------");
	}

	public static void displayRecursive(IJavaElementDelta delta) {
		displayRecursive(delta, "");
	}

	private static void displayRecursive(IJavaElementDelta delta, String indent) {
		display(delta, indent);
		for (IJavaElementDelta child : delta.getAffectedChildren()) {
			displayRecursive(child, indent + INDENT);
		}
	}
}
