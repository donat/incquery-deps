package cern.devtools.deps.query.cp1.incominginheritances;

import cern.devtools.deps.query.cp1.incominginheritances.IncomingInheritancesMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate IncomingInheritancesMatcher in a type-safe way.
 * 
 * @see IncomingInheritancesMatcher
 * @see IncomingInheritancesMatch
 * 
 */
public class IncomingInheritancesMatcherFactory extends BaseGeneratedMatcherFactory<IncomingInheritancesMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IncomingInheritancesMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected IncomingInheritancesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new IncomingInheritancesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-matchers";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.cp1.incomingInheritances";
    
  }
  
  private IncomingInheritancesMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<IncomingInheritancesMatcherFactory> {
    @Override
    public IncomingInheritancesMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static IncomingInheritancesMatcherFactory INSTANCE = make();
    
    public static IncomingInheritancesMatcherFactory make() {
      try {
      	return new IncomingInheritancesMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
