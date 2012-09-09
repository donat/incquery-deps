package cern.devtools.deps.query.repo;

import cern.devtools.deps.query.repo.addedclasses.AddedClassesMatcher;
import cern.devtools.deps.query.repo.addedfields.AddedFieldsMatcher;
import cern.devtools.deps.query.repo.addedmethods.AddedMethodsMatcher;
import cern.devtools.deps.query.repo.impactcausedbyremovedclasses.ImpactCausedByRemovedClassesMatcher;
import cern.devtools.deps.query.repo.impactcausedbyremovedfields.ImpactCausedByRemovedFieldsMatcher;
import cern.devtools.deps.query.repo.impactcausedbyremovedmethods.ImpactCausedByRemovedMethodsMatcher;
import cern.devtools.deps.query.repo.incomingclassusagedeps.IncomingClassUsageDepsMatcher;
import cern.devtools.deps.query.repo.incomingfieldaccessdeps.IncomingFieldAccessDepsMatcher;
import cern.devtools.deps.query.repo.incominginheritancedeps.IncomingInheritanceDepsMatcher;
import cern.devtools.deps.query.repo.incomingmethodcalldeps.IncomingMethodCallDepsMatcher;
import cern.devtools.deps.query.repo.incomingmethodoverridedeps.IncomingMethodOverrideDepsMatcher;
import cern.devtools.deps.query.repo.joinclass.JoinClassMatcher;
import cern.devtools.deps.query.repo.joinfield.JoinFieldMatcher;
import cern.devtools.deps.query.repo.joinmethod.JoinMethodMatcher;
import cern.devtools.deps.query.repo.joinproject.JoinProjectMatcher;
import cern.devtools.deps.query.repo.removedclasses.RemovedClassesMatcher;
import cern.devtools.deps.query.repo.removedfields.RemovedFieldsMatcher;
import cern.devtools.deps.query.repo.removedmethod.RemovedMethodMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;

public final class GroupOfFileRepo extends BaseGeneratedPatternGroup {
  public GroupOfFileRepo() throws IncQueryException {
    matcherFactories.add(JoinFieldMatcher.factory());
    matcherFactories.add(AddedClassesMatcher.factory());
    matcherFactories.add(JoinProjectMatcher.factory());
    matcherFactories.add(IncomingMethodCallDepsMatcher.factory());
    matcherFactories.add(IncomingMethodOverrideDepsMatcher.factory());
    matcherFactories.add(JoinMethodMatcher.factory());
    matcherFactories.add(IncomingFieldAccessDepsMatcher.factory());
    matcherFactories.add(IncomingInheritanceDepsMatcher.factory());
    matcherFactories.add(AddedMethodsMatcher.factory());
    matcherFactories.add(ImpactCausedByRemovedMethodsMatcher.factory());
    matcherFactories.add(JoinClassMatcher.factory());
    matcherFactories.add(IncomingClassUsageDepsMatcher.factory());
    matcherFactories.add(RemovedClassesMatcher.factory());
    matcherFactories.add(ImpactCausedByRemovedClassesMatcher.factory());
    matcherFactories.add(RemovedMethodMatcher.factory());
    matcherFactories.add(AddedFieldsMatcher.factory());
    matcherFactories.add(ImpactCausedByRemovedFieldsMatcher.factory());
    matcherFactories.add(RemovedFieldsMatcher.factory());
    
  }
}
