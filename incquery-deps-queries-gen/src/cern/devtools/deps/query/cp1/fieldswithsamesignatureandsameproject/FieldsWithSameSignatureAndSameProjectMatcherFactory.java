package cern.devtools.deps.query.cp1.fieldswithsamesignatureandsameproject;

import cern.devtools.deps.query.cp1.fieldswithsamesignatureandsameproject.FieldsWithSameSignatureAndSameProjectMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate FieldsWithSameSignatureAndSameProjectMatcher in a type-safe way.
 * 
 * @see FieldsWithSameSignatureAndSameProjectMatcher
 * @see FieldsWithSameSignatureAndSameProjectMatch
 * 
 */
public class FieldsWithSameSignatureAndSameProjectMatcherFactory extends BaseGeneratedMatcherFactory<FieldsWithSameSignatureAndSameProjectMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FieldsWithSameSignatureAndSameProjectMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected FieldsWithSameSignatureAndSameProjectMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new FieldsWithSameSignatureAndSameProjectMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-queries";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.cp1.fieldsWithSameSignatureAndSameProject";
    
  }
  
  private FieldsWithSameSignatureAndSameProjectMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<FieldsWithSameSignatureAndSameProjectMatcherFactory> {
    @Override
    public FieldsWithSameSignatureAndSameProjectMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static FieldsWithSameSignatureAndSameProjectMatcherFactory INSTANCE = make();
    
    public static FieldsWithSameSignatureAndSameProjectMatcherFactory make() {
      try {
      	return new FieldsWithSameSignatureAndSameProjectMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
