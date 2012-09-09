package cern.devtools.deps.query.repo.removedmethod;

import cern.devtools.deps.query.repo.removedmethod.RemovedMethodMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate RemovedMethodMatcher in a type-safe way.
 * 
 * @see RemovedMethodMatcher
 * @see RemovedMethodMatch
 * 
 */
public class RemovedMethodMatcherFactory extends BaseGeneratedMatcherFactory<RemovedMethodMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static RemovedMethodMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected RemovedMethodMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new RemovedMethodMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-queries";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.repo.removedMethod";
    
  }
  
  private RemovedMethodMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<RemovedMethodMatcherFactory> {
    @Override
    public RemovedMethodMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static RemovedMethodMatcherFactory INSTANCE = make();
    
    public static RemovedMethodMatcherFactory make() {
      try {
      	return new RemovedMethodMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
