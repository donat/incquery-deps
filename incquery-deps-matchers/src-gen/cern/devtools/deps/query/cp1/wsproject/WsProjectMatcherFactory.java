package cern.devtools.deps.query.cp1.wsproject;

import cern.devtools.deps.query.cp1.wsproject.WsProjectMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate WsProjectMatcher in a type-safe way.
 * 
 * @see WsProjectMatcher
 * @see WsProjectMatch
 * 
 */
public class WsProjectMatcherFactory extends BaseGeneratedMatcherFactory<WsProjectMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static WsProjectMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected WsProjectMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new WsProjectMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-matchers";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.cp1.wsProject";
    
  }
  
  private WsProjectMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<WsProjectMatcherFactory> {
    @Override
    public WsProjectMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static WsProjectMatcherFactory INSTANCE = make();
    
    public static WsProjectMatcherFactory make() {
      try {
      	return new WsProjectMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
