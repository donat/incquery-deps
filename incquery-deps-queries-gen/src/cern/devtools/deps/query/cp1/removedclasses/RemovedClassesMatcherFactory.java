package cern.devtools.deps.query.cp1.removedclasses;

import cern.devtools.deps.query.cp1.removedclasses.RemovedClassesMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate RemovedClassesMatcher in a type-safe way.
 * 
 * @see RemovedClassesMatcher
 * @see RemovedClassesMatch
 * 
 */
public class RemovedClassesMatcherFactory extends BaseGeneratedMatcherFactory<RemovedClassesMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static RemovedClassesMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected RemovedClassesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new RemovedClassesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-queries";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.cp1.removedClasses";
    
  }
  
  private RemovedClassesMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<RemovedClassesMatcherFactory> {
    @Override
    public RemovedClassesMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static RemovedClassesMatcherFactory INSTANCE = make();
    
    public static RemovedClassesMatcherFactory make() {
      try {
      	return new RemovedClassesMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
