package cern.devtools.deps.query.repo.incomingfieldaccessdeps;

import cern.devtools.deps.query.repo.incomingfieldaccessdeps.IncomingFieldAccessDepsMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate IncomingFieldAccessDepsMatcher in a type-safe way.
 * 
 * @see IncomingFieldAccessDepsMatcher
 * @see IncomingFieldAccessDepsMatch
 * 
 */
public class IncomingFieldAccessDepsMatcherFactory extends BaseGeneratedMatcherFactory<IncomingFieldAccessDepsMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IncomingFieldAccessDepsMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected IncomingFieldAccessDepsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new IncomingFieldAccessDepsMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-queries";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.repo.incomingFieldAccessDeps";
    
  }
  
  private IncomingFieldAccessDepsMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<IncomingFieldAccessDepsMatcherFactory> {
    @Override
    public IncomingFieldAccessDepsMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static IncomingFieldAccessDepsMatcherFactory INSTANCE = make();
    
    public static IncomingFieldAccessDepsMatcherFactory make() {
      try {
      	return new IncomingFieldAccessDepsMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
