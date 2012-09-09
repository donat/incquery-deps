package cern.devtools.deps.query.repo.incomingmethodoverridedeps;

import cern.devtools.deps.query.repo.incomingmethodoverridedeps.IncomingMethodOverrideDepsMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate IncomingMethodOverrideDepsMatcher in a type-safe way.
 * 
 * @see IncomingMethodOverrideDepsMatcher
 * @see IncomingMethodOverrideDepsMatch
 * 
 */
public class IncomingMethodOverrideDepsMatcherFactory extends BaseGeneratedMatcherFactory<IncomingMethodOverrideDepsMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IncomingMethodOverrideDepsMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected IncomingMethodOverrideDepsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new IncomingMethodOverrideDepsMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-queries";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.repo.incomingMethodOverrideDeps";
    
  }
  
  private IncomingMethodOverrideDepsMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<IncomingMethodOverrideDepsMatcherFactory> {
    @Override
    public IncomingMethodOverrideDepsMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static IncomingMethodOverrideDepsMatcherFactory INSTANCE = make();
    
    public static IncomingMethodOverrideDepsMatcherFactory make() {
      try {
      	return new IncomingMethodOverrideDepsMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
