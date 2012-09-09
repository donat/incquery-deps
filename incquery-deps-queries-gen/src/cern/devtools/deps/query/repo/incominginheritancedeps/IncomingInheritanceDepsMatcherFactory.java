package cern.devtools.deps.query.repo.incominginheritancedeps;

import cern.devtools.deps.query.repo.incominginheritancedeps.IncomingInheritanceDepsMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate IncomingInheritanceDepsMatcher in a type-safe way.
 * 
 * @see IncomingInheritanceDepsMatcher
 * @see IncomingInheritanceDepsMatch
 * 
 */
public class IncomingInheritanceDepsMatcherFactory extends BaseGeneratedMatcherFactory<IncomingInheritanceDepsMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IncomingInheritanceDepsMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected IncomingInheritanceDepsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new IncomingInheritanceDepsMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-queries";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.repo.incomingInheritanceDeps";
    
  }
  
  private IncomingInheritanceDepsMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<IncomingInheritanceDepsMatcherFactory> {
    @Override
    public IncomingInheritanceDepsMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static IncomingInheritanceDepsMatcherFactory INSTANCE = make();
    
    public static IncomingInheritanceDepsMatcherFactory make() {
      try {
      	return new IncomingInheritanceDepsMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
