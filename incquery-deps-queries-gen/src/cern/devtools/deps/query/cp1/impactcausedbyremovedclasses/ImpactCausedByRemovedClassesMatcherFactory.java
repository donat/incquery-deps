package cern.devtools.deps.query.cp1.impactcausedbyremovedclasses;

import cern.devtools.deps.query.cp1.impactcausedbyremovedclasses.ImpactCausedByRemovedClassesMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate ImpactCausedByRemovedClassesMatcher in a type-safe way.
 * 
 * @see ImpactCausedByRemovedClassesMatcher
 * @see ImpactCausedByRemovedClassesMatch
 * 
 */
public class ImpactCausedByRemovedClassesMatcherFactory extends BaseGeneratedMatcherFactory<ImpactCausedByRemovedClassesMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ImpactCausedByRemovedClassesMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ImpactCausedByRemovedClassesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new ImpactCausedByRemovedClassesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-queries";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.cp1.impactCausedByRemovedClasses";
    
  }
  
  private ImpactCausedByRemovedClassesMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<ImpactCausedByRemovedClassesMatcherFactory> {
    @Override
    public ImpactCausedByRemovedClassesMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static ImpactCausedByRemovedClassesMatcherFactory INSTANCE = make();
    
    public static ImpactCausedByRemovedClassesMatcherFactory make() {
      try {
      	return new ImpactCausedByRemovedClassesMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
