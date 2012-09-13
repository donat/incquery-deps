package cern.devtools.deps.query.cp1.addedfields;

import cern.devtools.deps.query.cp1.addedfields.AddedFieldsMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate AddedFieldsMatcher in a type-safe way.
 * 
 * @see AddedFieldsMatcher
 * @see AddedFieldsMatch
 * 
 */
public class AddedFieldsMatcherFactory extends BaseGeneratedMatcherFactory<AddedFieldsMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static AddedFieldsMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected AddedFieldsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new AddedFieldsMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "incquery-deps-matchers";
    
  }
  
  @Override
  protected String patternName() {
    return "cern.devtools.deps.query.cp1.addedFields";
    
  }
  
  private AddedFieldsMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<AddedFieldsMatcherFactory> {
    @Override
    public AddedFieldsMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static AddedFieldsMatcherFactory INSTANCE = make();
    
    public static AddedFieldsMatcherFactory make() {
      try {
      	return new AddedFieldsMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
