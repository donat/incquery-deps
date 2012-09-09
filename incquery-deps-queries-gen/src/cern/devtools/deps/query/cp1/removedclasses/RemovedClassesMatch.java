package cern.devtools.deps.query.cp1.removedclasses;

import hu.bme.incquery.deps.cp1model.CP1Class;
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
  private CP1Class fWsClass;
  
  private static String[] parameterNames = {"wsClass"};
  
  RemovedClassesMatch(final CP1Class pWsClass) {
    this.fWsClass = pWsClass;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("wsClass".equals(parameterName)) return this.fWsClass;
    return null;
    
  }
  
  public CP1Class getWsClass() {
    return this.fWsClass;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("wsClass".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.cp1model.CP1Class) {
    	this.fWsClass = (hu.bme.incquery.deps.cp1model.CP1Class) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setWsClass(final CP1Class pWsClass) {
    this.fWsClass = pWsClass;
    
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
    return new Object[]{fWsClass};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"wsClass\"=" + prettyPrintValue(fWsClass));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fWsClass == null) ? 0 : fWsClass.hashCode()); 
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
    if (fWsClass == null) {if (other.fWsClass != null) return false;}
    else if (!fWsClass.equals(other.fWsClass)) return false;
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
