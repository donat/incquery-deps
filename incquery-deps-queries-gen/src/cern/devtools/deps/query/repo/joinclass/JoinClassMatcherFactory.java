package cern.devtools.deps.query.repo.joinclass;

import cern.devtools.deps.query.repo.joinclass.JoinClassMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate JoinClassMatcher in a type-safe way.
 * 
 * @see JoinClassMatcher
 * @see JoinClassMatch
 * 
 */
public class JoinClassMatcherFactory extends BaseGeneratedMatcherFactory<JoinClassMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static JoinClassMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected JoinClassMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new JoinClassMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-queries";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.repo.joinClass";
    
  }
  
  private JoinClassMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<JoinClassMatcherFactory> {
    @Override
    public JoinClassMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static JoinClassMatcherFactory INSTANCE = make();
    
    public static JoinClassMatcherFactory make() {
      try {
      	return new JoinClassMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
