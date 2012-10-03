package cern.devtools.deps.query.cp1.classeswithsamefqnandsameproject;

import hu.bme.incquery.deps.cp1model.CP1Class;
import hu.bme.incquery.deps.wsmodel.WType;
import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the classesWithSameFQNAndSameProject pattern, 
 * to be used in conjunction with ClassesWithSameFQNAndSameProjectMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ClassesWithSameFQNAndSameProjectMatcher
 * @see ClassesWithSameFQNAndSameProjectProcessor
 * 
 */
public final class ClassesWithSameFQNAndSameProjectMatch extends BasePatternMatch implements IPatternMatch {
  private CP1Class fRepoClass;
  
  private WType fWsClass;
  
  private static String[] parameterNames = {"repoClass", "wsClass"};
  
  ClassesWithSameFQNAndSameProjectMatch(final CP1Class pRepoClass, final WType pWsClass) {
    this.fRepoClass = pRepoClass;
    this.fWsClass = pWsClass;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("repoClass".equals(parameterName)) return this.fRepoClass;
    if ("wsClass".equals(parameterName)) return this.fWsClass;
    return null;
    
  }
  
  public CP1Class getRepoClass() {
    return this.fRepoClass;
    
  }
  
  public WType getWsClass() {
    return this.fWsClass;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("repoClass".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.cp1model.CP1Class) {
    	this.fRepoClass = (hu.bme.incquery.deps.cp1model.CP1Class) newValue;
    	return true;
    }
    if ("wsClass".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.wsmodel.WType) {
    	this.fWsClass = (hu.bme.incquery.deps.wsmodel.WType) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setRepoClass(final CP1Class pRepoClass) {
    this.fRepoClass = pRepoClass;
    
  }
  
  public void setWsClass(final WType pWsClass) {
    this.fWsClass = pWsClass;
    
  }
  
  @Override
  public String patternName() {
    return "classesWithSameFQNAndSameProject";
    
  }
  
  @Override
  public String[] parameterNames() {
    return ClassesWithSameFQNAndSameProjectMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRepoClass, fWsClass};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"repoClass\"=" + prettyPrintValue(fRepoClass) + ", ");
    result.append("\"wsClass\"=" + prettyPrintValue(fWsClass));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRepoClass == null) ? 0 : fRepoClass.hashCode()); 
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
    if (!ClassesWithSameFQNAndSameProjectMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    ClassesWithSameFQNAndSameProjectMatch other = (ClassesWithSameFQNAndSameProjectMatch) obj;
    if (fRepoClass == null) {if (other.fRepoClass != null) return false;}
    else if (!fRepoClass.equals(other.fRepoClass)) return false;
    if (fWsClass == null) {if (other.fWsClass != null) return false;}
    else if (!fWsClass.equals(other.fWsClass)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return ClassesWithSameFQNAndSameProjectMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}