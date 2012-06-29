/*
 * File Traverse.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 24, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.combinators;

import cern.devtools.depanalysis.modelfinder.structurals.WsItemWrapperVisitor;


public class TopDown extends Sequence {

	private TopDown(WsItemWrapperVisitor v) {
		super(v, null);
	}

	public static TopDown newInstance(WsItemWrapperVisitor v) {
		TopDown traverse = new TopDown(v);
		traverse.second = new All(traverse);
		return traverse;
	}
}
