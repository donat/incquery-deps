package cern.devtools.deps.query.repo.removedclasses;

import hu.bme.incquery.deps.repomodel.RClass;
import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the removedClasses pattern, 
 * to be used in conjunction with RemovedClassesMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see RemovedClassesMatcher
 * @see RemovedClassesProcessor
 * 
 */
public final class RemovedClassesMatch extends BasePatternMatch implements IPatternMatch {
  private RClass fC;
  
  private static String[] parameterNames = {"c"};
  
  RemovedClassesMatch(final RClass pC) {
    this.fC = pC;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("c".equals(parameterName)) return this.fC;
    return null;
    
  }
  
  public RClass getC() {
    return this.fC;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("c".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.repomodel.RClass) {
    	this.fC = (hu.bme.incquery.deps.repomodel.RClass) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setC(final RClass pC) {
    this.fC = pC;
    
  }
  
  @Override
  public String patternName() {
    return "removedClasses";
    
  }
  
  @Override
  public String[] parameterNames() {
    return RemovedClassesMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fC};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"c\"=" + prettyPrintValue(fC));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fC == null) ? 0 : fC.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (obj == null)
    	return false;
    if (!(obj instanceof IPatternMatch))
    	return false;
    IPatternMatch otherSig  = (IPatternMatch) obj;
    if (!pattern().equals(otherSig.pattern()))
    	return false;
    if (!RemovedClassesMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    RemovedClassesMatch other = (RemovedClassesMatch) obj;
    if (fC == null) {if (other.fC != null) return false;}
    else if (!fC.equals(other.fC)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return RemovedClassesMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
