package cern.devtools.deps.query.repo.joinfield;

import cern.devtools.deps.query.repo.joinfield.JoinFieldMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate JoinFieldMatcher in a type-safe way.
 * 
 * @see JoinFieldMatcher
 * @see JoinFieldMatch
 * 
 */
public class JoinFieldMatcherFactory extends BaseGeneratedMatcherFactory<JoinFieldMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static JoinFieldMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected JoinFieldMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new JoinFieldMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-queries";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.repo.joinField";
    
  }
  
  private JoinFieldMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<JoinFieldMatcherFactory> {
    @Override
    public JoinFieldMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static JoinFieldMatcherFactory INSTANCE = make();
    
    public static JoinFieldMatcherFactory make() {
      try {
      	return new JoinFieldMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
