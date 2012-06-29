/*
 * File MarkerResolutionGenerator.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 20, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package org.eclipse.jdt.ui.examples;

import org.eclipse.core.resources.IMarker;
import org.eclipse.ui.IMarkerResolution;
import org.eclipse.ui.IMarkerResolutionGenerator;

public class MarkerResolutionGenerator implements IMarkerResolutionGenerator {

	@Override
	public IMarkerResolution[] getResolutions(IMarker marker) {
		return new IMarkerResolution[]{};
	}

}
