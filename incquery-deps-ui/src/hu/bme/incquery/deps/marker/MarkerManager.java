package hu.bme.incquery.deps.marker;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jface.text.Position;


public class MarkerManager {
	
	public void removeMarkerFromResource(String  type, IResource resource) {
		try {
			resource.deleteMarkers(type, true, IResource.DEPTH_INFINITE);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteMarker(IResource res, long id) {
		try {
			res.getMarker(id).delete();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public long addMarkerToJavaModelElement(String type, IJavaElement elem,Position pos,  String message) {
		try {
			IMarker createMarker = MyMarkerFactory.createMarker(type, elem.getResource(), pos, message);
			return createMarker.getId();
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return -1;
	}
}
