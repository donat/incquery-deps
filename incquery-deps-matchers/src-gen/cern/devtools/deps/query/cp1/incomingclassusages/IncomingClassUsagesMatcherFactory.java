package cern.devtools.deps.query.cp1.incomingclassusages;

import cern.devtools.deps.query.cp1.incomingclassusages.IncomingClassUsagesMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate IncomingClassUsagesMatcher in a type-safe way.
 * 
 * @see IncomingClassUsagesMatcher
 * @see IncomingClassUsagesMatch
 * 
 */
public class IncomingClassUsagesMatcherFactory extends BaseGeneratedMatcherFactory<IncomingClassUsagesMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IncomingClassUsagesMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected IncomingClassUsagesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new IncomingClassUsagesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-matchers";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.cp1.incomingClassUsages";
    
  }
  
  private IncomingClassUsagesMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<IncomingClassUsagesMatcherFactory> {
    @Override
    public IncomingClassUsagesMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static IncomingClassUsagesMatcherFactory INSTANCE = make();
    
    public static IncomingClassUsagesMatcherFactory make() {
      try {
      	return new IncomingClassUsagesMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
