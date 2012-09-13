package cern.devtools.deps.query.cp1.impactcausedbyremovedmethods;

import cern.devtools.deps.query.cp1.impactcausedbyremovedmethods.ImpactCausedByRemovedMethodsMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate ImpactCausedByRemovedMethodsMatcher in a type-safe way.
 * 
 * @see ImpactCausedByRemovedMethodsMatcher
 * @see ImpactCausedByRemovedMethodsMatch
 * 
 */
public class ImpactCausedByRemovedMethodsMatcherFactory extends BaseGeneratedMatcherFactory<ImpactCausedByRemovedMethodsMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ImpactCausedByRemovedMethodsMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ImpactCausedByRemovedMethodsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new ImpactCausedByRemovedMethodsMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-matchers";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.cp1.impactCausedByRemovedMethods";
    
  }
  
  private ImpactCausedByRemovedMethodsMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<ImpactCausedByRemovedMethodsMatcherFactory> {
    @Override
    public ImpactCausedByRemovedMethodsMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static ImpactCausedByRemovedMethodsMatcherFactory INSTANCE = make();
    
    public static ImpactCausedByRemovedMethodsMatcherFactory make() {
      try {
      	return new ImpactCausedByRemovedMethodsMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
