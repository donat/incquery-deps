package cern.devtools.deps.query.cp1.classeswithsamefqnandsameproject;

import cern.devtools.deps.query.cp1.classeswithsamefqnandsameproject.ClassesWithSameFQNAndSameProjectMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate ClassesWithSameFQNAndSameProjectMatcher in a type-safe way.
 * 
 * @see ClassesWithSameFQNAndSameProjectMatcher
 * @see ClassesWithSameFQNAndSameProjectMatch
 * 
 */
public class ClassesWithSameFQNAndSameProjectMatcherFactory extends BaseGeneratedMatcherFactory<ClassesWithSameFQNAndSameProjectMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ClassesWithSameFQNAndSameProjectMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ClassesWithSameFQNAndSameProjectMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new ClassesWithSameFQNAndSameProjectMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-queries";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.cp1.classesWithSameFQNAndSameProject";
    
  }
  
  private ClassesWithSameFQNAndSameProjectMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<ClassesWithSameFQNAndSameProjectMatcherFactory> {
    @Override
    public ClassesWithSameFQNAndSameProjectMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static ClassesWithSameFQNAndSameProjectMatcherFactory INSTANCE = make();
    
    public static ClassesWithSameFQNAndSameProjectMatcherFactory make() {
      try {
      	return new ClassesWithSameFQNAndSameProjectMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
