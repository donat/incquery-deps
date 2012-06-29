/*
 * File VisitorFailure.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 24, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.structurals;

public class VisitorFailure extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public VisitorFailure(Exception e) {
		super(e);
	}
}
