package cern.devtools.depanalysis.modelfinder.builder;

import org.eclipse.jdt.core.IJavaElementDelta;

import cern.devtools.depanalysis.modelfinder.DeltaDisplay;
import cern.devtools.depanalysis.modelfinder.ModelBuilder;

public class NullBuilder implements ModelBuilder {

	private IJavaElementDelta delta;

	public NullBuilder(IJavaElementDelta delta) {
		this.delta = delta;
	}
	
	@Override
	public void build() {
		//DeltaDisplay.display(delta);
	}
}
