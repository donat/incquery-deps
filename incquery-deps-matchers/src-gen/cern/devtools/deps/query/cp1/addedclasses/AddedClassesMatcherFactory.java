package cern.devtools.deps.query.cp1.addedclasses;

import cern.devtools.deps.query.cp1.addedclasses.AddedClassesMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate AddedClassesMatcher in a type-safe way.
 * 
 * @see AddedClassesMatcher
 * @see AddedClassesMatch
 * 
 */
public class AddedClassesMatcherFactory extends BaseGeneratedMatcherFactory<AddedClassesMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static AddedClassesMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected AddedClassesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new AddedClassesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-matchers";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.cp1.addedClasses";
    
  }
  
  private AddedClassesMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<AddedClassesMatcherFactory> {
    @Override
    public AddedClassesMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static AddedClassesMatcherFactory INSTANCE = make();
    
    public static AddedClassesMatcherFactory make() {
      try {
      	return new AddedClassesMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
