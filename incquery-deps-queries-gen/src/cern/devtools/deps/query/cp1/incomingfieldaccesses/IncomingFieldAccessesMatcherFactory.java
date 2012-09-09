package cern.devtools.deps.query.cp1.incomingfieldaccesses;

import cern.devtools.deps.query.cp1.incomingfieldaccesses.IncomingFieldAccessesMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate IncomingFieldAccessesMatcher in a type-safe way.
 * 
 * @see IncomingFieldAccessesMatcher
 * @see IncomingFieldAccessesMatch
 * 
 */
public class IncomingFieldAccessesMatcherFactory extends BaseGeneratedMatcherFactory<IncomingFieldAccessesMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IncomingFieldAccessesMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected IncomingFieldAccessesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new IncomingFieldAccessesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-queries";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.cp1.incomingFieldAccesses";
    
  }
  
  private IncomingFieldAccessesMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<IncomingFieldAccessesMatcherFactory> {
    @Override
    public IncomingFieldAccessesMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static IncomingFieldAccessesMatcherFactory INSTANCE = make();
    
    public static IncomingFieldAccessesMatcherFactory make() {
      try {
      	return new IncomingFieldAccessesMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
