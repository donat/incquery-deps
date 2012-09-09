package cern.devtools.deps.query.cp1.incomingmethodcalls;

import cern.devtools.deps.query.cp1.incomingmethodcalls.IncomingMethodCallsMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate IncomingMethodCallsMatcher in a type-safe way.
 * 
 * @see IncomingMethodCallsMatcher
 * @see IncomingMethodCallsMatch
 * 
 */
public class IncomingMethodCallsMatcherFactory extends BaseGeneratedMatcherFactory<IncomingMethodCallsMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IncomingMethodCallsMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected IncomingMethodCallsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new IncomingMethodCallsMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-queries";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.cp1.incomingMethodCalls";
    
  }
  
  private IncomingMethodCallsMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<IncomingMethodCallsMatcherFactory> {
    @Override
    public IncomingMethodCallsMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static IncomingMethodCallsMatcherFactory INSTANCE = make();
    
    public static IncomingMethodCallsMatcherFactory make() {
      try {
      	return new IncomingMethodCallsMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
