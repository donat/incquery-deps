/*
 * File WsChangeEventListener.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jul 3, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package hu.bme.incquery.deps.core;

import hu.bme.incquery.deps.wsmodel.WWorkspace;

public abstract class WsChangeEventListener {

	public abstract void init(WWorkspace resource);

	public abstract void recover(WWorkspace resource);
	
	public abstract void update(WWorkspace resource);
	

}