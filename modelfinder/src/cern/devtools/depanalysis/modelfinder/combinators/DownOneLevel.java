/*
 * File DownOneLevel.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jul 2, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.combinators;

import cern.devtools.depanalysis.modelfinder.structurals.WsItemWrapperVisitor;

public class DownOneLevel extends Sequence{
	private DownOneLevel(WsItemWrapperVisitor v) {
		super(v, null);
	}

	public static DownOneLevel newInstance(WsItemWrapperVisitor v) {
		DownOneLevel traverse = new DownOneLevel(v);
		traverse.second = new Children(traverse);
		return traverse;
	}
}
