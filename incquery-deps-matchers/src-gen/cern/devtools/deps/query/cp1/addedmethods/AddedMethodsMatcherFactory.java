package cern.devtools.deps.query.cp1.addedmethods;

import cern.devtools.deps.query.cp1.addedmethods.AddedMethodsMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate AddedMethodsMatcher in a type-safe way.
 * 
 * @see AddedMethodsMatcher
 * @see AddedMethodsMatch
 * 
 */
public class AddedMethodsMatcherFactory extends BaseGeneratedMatcherFactory<AddedMethodsMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static AddedMethodsMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected AddedMethodsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new AddedMethodsMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-matchers";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.cp1.addedMethods";
    
  }
  
  private AddedMethodsMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<AddedMethodsMatcherFactory> {
    @Override
    public AddedMethodsMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static AddedMethodsMatcherFactory INSTANCE = make();
    
    public static AddedMethodsMatcherFactory make() {
      try {
      	return new AddedMethodsMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
