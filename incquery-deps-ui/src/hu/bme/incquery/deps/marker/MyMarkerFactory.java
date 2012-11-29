package hu.bme.incquery.deps.marker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.texteditor.SimpleMarkerAnnotation;


public class MyMarkerFactory {
	
	//Marker ID
	public static final String MARKER_BASE = "com.ibm.mymarkers.mymarker";
	
	public static final String MARKER_INCOMPAT_SUPERTYPE = "hu.bme.incquery.deps.markers.incompatsupertype";
	
	//Annotation ID
	public static final String ANNOTATION = "com.ibm.myannotation";
	
	
	/*
	 * Creates a Marker
	 */
	public static IMarker createMarker(String type, IResource res, Position position, String message)
    throws CoreException {
            IMarker marker = null;
            //note: you use the id that is defined in your plugin.xml
            marker = res.createMarker(type);
            marker.setAttribute(IMarker.MESSAGE, message);
            //compute and set char start and char end
            int start = position.getOffset();
            int end = position.getOffset() + position.getLength();
            marker.setAttribute(IMarker.CHAR_START, start);
            marker.setAttribute(IMarker.CHAR_END, end);
            return marker;
    }

	/*
	 * returns a list of a resources markers
	 */
	public static List<IMarker> findMarkers(IResource resource, String markerType) {
	     try {
	         return Arrays.asList(resource.findMarkers(markerType, true, IResource.DEPTH_ZERO));
	     } catch (CoreException e) {
	         return new ArrayList<IMarker>();
	    }
	}
	
	/*
	 * Returns a list of markers that are linked to the resource or any sub resource of the resource
	 */
	public static List<IMarker> findAllMarkers(IResource  resource, String markerType) {
        try {
            return Arrays.asList(resource.findMarkers(markerType, true, IResource.DEPTH_INFINITE));
        } catch (CoreException e) {
            return new ArrayList<IMarker>();
        }
    }
	
	/*
	 * Returns the selection of the package explorer
	 */
	public static TreeSelection getTreeSelection() {

		ISelection selection = MyMarkerPlugin.getActiveWorkbenchWindow().getSelectionService().getSelection();
		if (selection instanceof TreeSelection) {
			return (TreeSelection)selection;
		}
		return null;
	}

	/*
	 * Returns the selection of the package explorer
	 */
	public static TextSelection getTextSelection() {

		ISelection selection = MyMarkerPlugin.getActiveWorkbenchWindow().getSelectionService().getSelection();
		if (selection instanceof TextSelection) {
			return (TextSelection)selection;
		}
		return null;
	}
	
	public static void addAnnotation(IMarker marker, ITextSelection selection, ITextEditor editor) {
	      //The DocumentProvider enables to get the document currently loaded in the editor
	      IDocumentProvider idp = editor.getDocumentProvider();

	      //This is the document we want to connect to. This is taken from the current editor input.
	      IDocument document = idp.getDocument(editor.getEditorInput());

	      //The IannotationModel enables to add/remove/change annoatation to a Document loaded in an Editor
	      IAnnotationModel iamf = idp.getAnnotationModel(editor.getEditorInput());

	      //Note: The annotation type id specify that you want to create one of your annotations
	      SimpleMarkerAnnotation ma = new SimpleMarkerAnnotation(ANNOTATION, marker);

	      //Finally add the new annotation to the model
	      iamf.connect(document);
	      iamf.addAnnotation(ma,new Position(selection.getOffset(),selection.getLength()));
	      iamf.disconnect(document);
	}

	
}
