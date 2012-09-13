package cern.devtools.deps.query.cp1.methodswithsamesignatureandsameproject;

import cern.devtools.deps.query.cp1.methodswithsamesignatureandsameproject.MethodsWithSameSignatureAndSameProjectMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate MethodsWithSameSignatureAndSameProjectMatcher in a type-safe way.
 * 
 * @see MethodsWithSameSignatureAndSameProjectMatcher
 * @see MethodsWithSameSignatureAndSameProjectMatch
 * 
 */
public class MethodsWithSameSignatureAndSameProjectMatcherFactory extends BaseGeneratedMatcherFactory<MethodsWithSameSignatureAndSameProjectMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MethodsWithSameSignatureAndSameProjectMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected MethodsWithSameSignatureAndSameProjectMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new MethodsWithSameSignatureAndSameProjectMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-matchers";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.cp1.methodsWithSameSignatureAndSameProject";
    
  }
  
  private MethodsWithSameSignatureAndSameProjectMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<MethodsWithSameSignatureAndSameProjectMatcherFactory> {
    @Override
    public MethodsWithSameSignatureAndSameProjectMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static MethodsWithSameSignatureAndSameProjectMatcherFactory INSTANCE = make();
    
    public static MethodsWithSameSignatureAndSameProjectMatcherFactory make() {
      try {
      	return new MethodsWithSameSignatureAndSameProjectMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
