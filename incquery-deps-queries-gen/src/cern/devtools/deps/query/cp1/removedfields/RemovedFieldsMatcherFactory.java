package cern.devtools.deps.query.cp1.removedfields;

import cern.devtools.deps.query.cp1.removedfields.RemovedFieldsMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate RemovedFieldsMatcher in a type-safe way.
 * 
 * @see RemovedFieldsMatcher
 * @see RemovedFieldsMatch
 * 
 */
public class RemovedFieldsMatcherFactory extends BaseGeneratedMatcherFactory<RemovedFieldsMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static RemovedFieldsMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected RemovedFieldsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new RemovedFieldsMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-queries";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.cp1.removedFields";
    
  }
  
  private RemovedFieldsMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<RemovedFieldsMatcherFactory> {
    @Override
    public RemovedFieldsMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static RemovedFieldsMatcherFactory INSTANCE = make();
    
    public static RemovedFieldsMatcherFactory make() {
      try {
      	return new RemovedFieldsMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
