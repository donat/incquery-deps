package cern.devtools.deps.query.cp1.repoproject;

import cern.devtools.deps.query.cp1.repoproject.RepoProjectMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate RepoProjectMatcher in a type-safe way.
 * 
 * @see RepoProjectMatcher
 * @see RepoProjectMatch
 * 
 */
public class RepoProjectMatcherFactory extends BaseGeneratedMatcherFactory<RepoProjectMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static RepoProjectMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected RepoProjectMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new RepoProjectMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-matchers";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.cp1.repoProject";
    
  }
  
  private RepoProjectMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<RepoProjectMatcherFactory> {
    @Override
    public RepoProjectMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static RepoProjectMatcherFactory INSTANCE = make();
    
    public static RepoProjectMatcherFactory make() {
      try {
      	return new RepoProjectMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
