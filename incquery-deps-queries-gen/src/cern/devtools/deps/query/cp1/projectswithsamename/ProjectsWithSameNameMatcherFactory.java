package cern.devtools.deps.query.cp1.projectswithsamename;

import cern.devtools.deps.query.cp1.projectswithsamename.ProjectsWithSameNameMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate ProjectsWithSameNameMatcher in a type-safe way.
 * 
 * @see ProjectsWithSameNameMatcher
 * @see ProjectsWithSameNameMatch
 * 
 */
public class ProjectsWithSameNameMatcherFactory extends BaseGeneratedMatcherFactory<ProjectsWithSameNameMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ProjectsWithSameNameMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ProjectsWithSameNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new ProjectsWithSameNameMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-queries";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.cp1.projectsWithSameName";
    
  }
  
  private ProjectsWithSameNameMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<ProjectsWithSameNameMatcherFactory> {
    @Override
    public ProjectsWithSameNameMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static ProjectsWithSameNameMatcherFactory INSTANCE = make();
    
    public static ProjectsWithSameNameMatcherFactory make() {
      try {
      	return new ProjectsWithSameNameMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
