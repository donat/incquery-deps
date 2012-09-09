package cern.devtools.deps.query.cp1;

import cern.devtools.deps.query.cp1.addedclasses.AddedClassesMatcher;
import cern.devtools.deps.query.cp1.addedfields.AddedFieldsMatcher;
import cern.devtools.deps.query.cp1.addedmethods.AddedMethodsMatcher;
import cern.devtools.deps.query.cp1.classeswithsamefqnandsameproject.ClassesWithSameFQNAndSameProjectMatcher;
import cern.devtools.deps.query.cp1.fieldswithsamesignatureandsameproject.FieldsWithSameSignatureAndSameProjectMatcher;
import cern.devtools.deps.query.cp1.impactcausedbyremovedclasses.ImpactCausedByRemovedClassesMatcher;
import cern.devtools.deps.query.cp1.impactcausedbyremovedfields.ImpactCausedByRemovedFieldsMatcher;
import cern.devtools.deps.query.cp1.impactcausedbyremovedmethods.ImpactCausedByRemovedMethodsMatcher;
import cern.devtools.deps.query.cp1.incomingclassusages.IncomingClassUsagesMatcher;
import cern.devtools.deps.query.cp1.incomingfieldaccesses.IncomingFieldAccessesMatcher;
import cern.devtools.deps.query.cp1.incominginheritances.IncomingInheritancesMatcher;
import cern.devtools.deps.query.cp1.incomingmethodcalls.IncomingMethodCallsMatcher;
import cern.devtools.deps.query.cp1.incomingmethodoverrides.IncomingMethodOverridesMatcher;
import cern.devtools.deps.query.cp1.methodswithsamesignatureandsameproject.MethodsWithSameSignatureAndSameProjectMatcher;
import cern.devtools.deps.query.cp1.projectswithsamename.ProjectsWithSameNameMatcher;
import cern.devtools.deps.query.cp1.removedclasses.RemovedClassesMatcher;
import cern.devtools.deps.query.cp1.removedfields.RemovedFieldsMatcher;
import cern.devtools.deps.query.cp1.removedmethod.RemovedMethodMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;

public final class GroupOfFileCp1 extends BaseGeneratedPatternGroup {
  public GroupOfFileCp1() throws IncQueryException {
    matcherFactories.add(RemovedMethodMatcher.factory());
    matcherFactories.add(IncomingMethodOverridesMatcher.factory());
    matcherFactories.add(AddedClassesMatcher.factory());
    matcherFactories.add(FieldsWithSameSignatureAndSameProjectMatcher.factory());
    matcherFactories.add(RemovedFieldsMatcher.factory());
    matcherFactories.add(MethodsWithSameSignatureAndSameProjectMatcher.factory());
    matcherFactories.add(IncomingMethodCallsMatcher.factory());
    matcherFactories.add(ImpactCausedByRemovedMethodsMatcher.factory());
    matcherFactories.add(IncomingFieldAccessesMatcher.factory());
    matcherFactories.add(AddedFieldsMatcher.factory());
    matcherFactories.add(ProjectsWithSameNameMatcher.factory());
    matcherFactories.add(AddedMethodsMatcher.factory());
    matcherFactories.add(ImpactCausedByRemovedFieldsMatcher.factory());
    matcherFactories.add(ClassesWithSameFQNAndSameProjectMatcher.factory());
    matcherFactories.add(IncomingInheritancesMatcher.factory());
    matcherFactories.add(IncomingClassUsagesMatcher.factory());
    matcherFactories.add(RemovedClassesMatcher.factory());
    matcherFactories.add(ImpactCausedByRemovedClassesMatcher.factory());
    
  }
}
