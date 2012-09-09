package hu.bme.incquery.deps.ui;

import java.util.Collection;
import java.util.Set;

import hu.bme.incquery.deps.core.Activator;
import hu.bme.incquery.deps.core.IncQueryDepsChangeListener;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;

import cern.devtools.deps.query.cp1.addedclasses.AddedClassesMatch;
import cern.devtools.deps.query.cp1.addedclasses.AddedClassesMatcher;

public class IncQueryDepsOutput extends ViewPart {
	private Text txtNumOfAddedMethods;

	public IncQueryDepsOutput() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(2, false));

		Label lblNumberOfAdded = new Label(parent, SWT.NONE);
		lblNumberOfAdded.setText("Added methods");

		txtNumOfAddedMethods = new Text(parent, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);
		GridData gd_txtNumOfAddedMethods = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_txtNumOfAddedMethods.heightHint = 265;
		txtNumOfAddedMethods.setLayoutData(gd_txtNumOfAddedMethods);
		// TODO Auto-generated method stub

		initTxtinput();
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	private void initTxtinput() {
		Activator.getDefault().getIncQueryDepsEngine().registerChangeListener(new IncQueryDepsChangeListener() {

			@Override
			public void matchesChanged(Set<IncQueryMatcher<?>> matchers) {
				for (IncQueryMatcher<?> m : matchers) {
					if (m instanceof AddedClassesMatcher) {
						Collection<AddedClassesMatch> matches = ((AddedClassesMatcher) m).getAllMatches();
						final String[] result = {""};
						for (AddedClassesMatch acm : matches) {
							result[0] += acm.getWsClass().toString() + "\n";
						}
						
						Display.getDefault().syncExec(new Runnable() {
							
							@Override
							public void run() {
								txtNumOfAddedMethods.setText(result[0]);
							}
						});
						
					}

				}

			}
		});

	}

}
