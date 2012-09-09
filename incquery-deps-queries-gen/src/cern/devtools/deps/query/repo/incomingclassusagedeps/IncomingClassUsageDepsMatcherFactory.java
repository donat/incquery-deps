package cern.devtools.deps.query.repo.incomingclassusagedeps;

import cern.devtools.deps.query.repo.incomingclassusagedeps.IncomingClassUsageDepsMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate IncomingClassUsageDepsMatcher in a type-safe way.
 * 
 * @see IncomingClassUsageDepsMatcher
 * @see IncomingClassUsageDepsMatch
 * 
 */
public class IncomingClassUsageDepsMatcherFactory extends BaseGeneratedMatcherFactory<IncomingClassUsageDepsMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IncomingClassUsageDepsMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected IncomingClassUsageDepsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new IncomingClassUsageDepsMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-queries";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.repo.incomingClassUsageDeps";
    
  }
  
  private IncomingClassUsageDepsMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<IncomingClassUsageDepsMatcherFactory> {
    @Override
    public IncomingClassUsageDepsMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static IncomingClassUsageDepsMatcherFactory INSTANCE = make();
    
    public static IncomingClassUsageDepsMatcherFactory make() {
      try {
      	return new IncomingClassUsageDepsMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
