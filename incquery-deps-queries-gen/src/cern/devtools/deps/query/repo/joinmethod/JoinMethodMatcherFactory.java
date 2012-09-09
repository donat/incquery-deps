package cern.devtools.deps.query.repo.joinmethod;

import cern.devtools.deps.query.repo.joinmethod.JoinMethodMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate JoinMethodMatcher in a type-safe way.
 * 
 * @see JoinMethodMatcher
 * @see JoinMethodMatch
 * 
 */
public class JoinMethodMatcherFactory extends BaseGeneratedMatcherFactory<JoinMethodMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static JoinMethodMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected JoinMethodMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new JoinMethodMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-queries";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.repo.joinMethod";
    
  }
  
  private JoinMethodMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<JoinMethodMatcherFactory> {
    @Override
    public JoinMethodMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static JoinMethodMatcherFactory INSTANCE = make();
    
    public static JoinMethodMatcherFactory make() {
      try {
      	return new JoinMethodMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
