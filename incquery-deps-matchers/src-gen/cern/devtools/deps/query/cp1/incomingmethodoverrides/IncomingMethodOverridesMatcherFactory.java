package cern.devtools.deps.query.cp1.incomingmethodoverrides;

import cern.devtools.deps.query.cp1.incomingmethodoverrides.IncomingMethodOverridesMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate IncomingMethodOverridesMatcher in a type-safe way.
 * 
 * @see IncomingMethodOverridesMatcher
 * @see IncomingMethodOverridesMatch
 * 
 */
public class IncomingMethodOverridesMatcherFactory extends BaseGeneratedMatcherFactory<IncomingMethodOverridesMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IncomingMethodOverridesMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected IncomingMethodOverridesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new IncomingMethodOverridesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-matchers";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.cp1.incomingMethodOverrides";
    
  }
  
  private IncomingMethodOverridesMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<IncomingMethodOverridesMatcherFactory> {
    @Override
    public IncomingMethodOverridesMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static IncomingMethodOverridesMatcherFactory INSTANCE = make();
    
    public static IncomingMethodOverridesMatcherFactory make() {
      try {
      	return new IncomingMethodOverridesMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}