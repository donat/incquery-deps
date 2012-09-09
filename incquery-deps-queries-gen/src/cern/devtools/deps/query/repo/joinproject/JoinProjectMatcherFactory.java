package cern.devtools.deps.query.repo.joinproject;

import cern.devtools.deps.query.repo.joinproject.JoinProjectMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate JoinProjectMatcher in a type-safe way.
 * 
 * @see JoinProjectMatcher
 * @see JoinProjectMatch
 * 
 */
public class JoinProjectMatcherFactory extends BaseGeneratedMatcherFactory<JoinProjectMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static JoinProjectMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected JoinProjectMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new JoinProjectMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-queries";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.repo.joinProject";
    
  }
  
  private JoinProjectMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<JoinProjectMatcherFactory> {
    @Override
    public JoinProjectMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static JoinProjectMatcherFactory INSTANCE = make();
    
    public static JoinProjectMatcherFactory make() {
      try {
      	return new JoinProjectMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
