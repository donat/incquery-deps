package hu.bme.incquery.deps.marker;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jface.text.Position;


public class MarkerManager {
	
	public void removeAllMarkers() {
		
	}

	public void deleteAllMarkers() {
		
	}

	public void addMarkerToJavaModelElement(IJavaElement elem,Position pos,  String message) {
		try {
			MyMarkerFactory.createMarker(elem.getResource(), pos, message);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
