package cern.devtools.deps.query.repo.impactcausedbyremovedfields;

import cern.devtools.deps.query.repo.impactcausedbyremovedfields.ImpactCausedByRemovedFieldsMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate ImpactCausedByRemovedFieldsMatcher in a type-safe way.
 * 
 * @see ImpactCausedByRemovedFieldsMatcher
 * @see ImpactCausedByRemovedFieldsMatch
 * 
 */
public class ImpactCausedByRemovedFieldsMatcherFactory extends BaseGeneratedMatcherFactory<ImpactCausedByRemovedFieldsMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ImpactCausedByRemovedFieldsMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ImpactCausedByRemovedFieldsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new ImpactCausedByRemovedFieldsMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-queries";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.repo.impactCausedByRemovedFields";
    
  }
  
  private ImpactCausedByRemovedFieldsMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<ImpactCausedByRemovedFieldsMatcherFactory> {
    @Override
    public ImpactCausedByRemovedFieldsMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static ImpactCausedByRemovedFieldsMatcherFactory INSTANCE = make();
    
    public static ImpactCausedByRemovedFieldsMatcherFactory make() {
      try {
      	return new ImpactCausedByRemovedFieldsMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
