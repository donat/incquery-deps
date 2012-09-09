package cern.devtools.deps.query.repo.incomingmethodcalldeps;

import cern.devtools.deps.query.repo.incomingmethodcalldeps.IncomingMethodCallDepsMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate IncomingMethodCallDepsMatcher in a type-safe way.
 * 
 * @see IncomingMethodCallDepsMatcher
 * @see IncomingMethodCallDepsMatch
 * 
 */
public class IncomingMethodCallDepsMatcherFactory extends BaseGeneratedMatcherFactory<IncomingMethodCallDepsMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IncomingMethodCallDepsMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected IncomingMethodCallDepsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new IncomingMethodCallDepsMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-queries";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.repo.incomingMethodCallDeps";
    
  }
  
  private IncomingMethodCallDepsMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<IncomingMethodCallDepsMatcherFactory> {
    @Override
    public IncomingMethodCallDepsMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static IncomingMethodCallDepsMatcherFactory INSTANCE = make();
    
    public static IncomingMethodCallDepsMatcherFactory make() {
      try {
      	return new IncomingMethodCallDepsMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
