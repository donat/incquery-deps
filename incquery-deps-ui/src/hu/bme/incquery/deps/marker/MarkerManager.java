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

	
	public long addIncomingMethodCallMarkerToElement(IJavaElement elem, Position pos, String message) {
		try {
			IMarker marker = MyMarkerFactory.createMarker(MyMarkerFactory.MARKER_ADDED_METHOD, elem.getResource(), pos, message);
			return marker.getId();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}

	public void addMarkerToJavaModelElement(String type, IJavaElement elem,Position pos,  String message) {
		try {
			MyMarkerFactory.createMarker(type, elem.getResource(), pos, message);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
}
