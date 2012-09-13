package cern.devtools.deps.query.cp1.impactcausedbyremovedfields;

import hu.bme.incquery.deps.cp1model.CP1DependencyType;
import hu.bme.incquery.deps.cp1model.CP1Field;
import hu.bme.incquery.deps.cp1model.CP1Method;
import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the impactCausedByRemovedFields pattern, 
 * to be used in conjunction with ImpactCausedByRemovedFieldsMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ImpactCausedByRemovedFieldsMatcher
 * @see ImpactCausedByRemovedFieldsProcessor
 * 
 */
public final class ImpactCausedByRemovedFieldsMatch extends BasePatternMatch implements IPatternMatch {
  private CP1Method fRepoFrom;
  
  private CP1Field fRepoTo;
  
  private CP1DependencyType fType;
  
  private static String[] parameterNames = {"repoFrom", "repoTo", "type"};
  
  ImpactCausedByRemovedFieldsMatch(final CP1Method pRepoFrom, final CP1Field pRepoTo, final CP1DependencyType pType) {
    this.fRepoFrom = pRepoFrom;
    this.fRepoTo = pRepoTo;
    this.fType = pType;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("repoFrom".equals(parameterName)) return this.fRepoFrom;
    if ("repoTo".equals(parameterName)) return this.fRepoTo;
    if ("type".equals(parameterName)) return this.fType;
    return null;
    
  }
  
  public CP1Method getRepoFrom() {
    return this.fRepoFrom;
    
  }
  
  public CP1Field getRepoTo() {
    return this.fRepoTo;
    
  }
  
  public CP1DependencyType getType() {
    return this.fType;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("repoFrom".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.cp1model.CP1Method) {
    	this.fRepoFrom = (hu.bme.incquery.deps.cp1model.CP1Method) newValue;
    	return true;
    }
    if ("repoTo".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.cp1model.CP1Field) {
    	this.fRepoTo = (hu.bme.incquery.deps.cp1model.CP1Field) newValue;
    	return true;
    }
    if ("type".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.cp1model.CP1DependencyType) {
    	this.fType = (hu.bme.incquery.deps.cp1model.CP1DependencyType) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setRepoFrom(final CP1Method pRepoFrom) {
    this.fRepoFrom = pRepoFrom;
    
  }
  
  public void setRepoTo(final CP1Field pRepoTo) {
    this.fRepoTo = pRepoTo;
    
  }
  
  public void setType(final CP1DependencyType pType) {
    this.fType = pType;
    
  }
  
  @Override
  public String patternName() {
    return "impactCausedByRemovedFields";
    
  }
  
  @Override
  public String[] parameterNames() {
    return ImpactCausedByRemovedFieldsMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRepoFrom, fRepoTo, fType};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"repoFrom\"=" + prettyPrintValue(fRepoFrom) + ", ");
    result.append("\"repoTo\"=" + prettyPrintValue(fRepoTo) + ", ");
    result.append("\"type\"=" + prettyPrintValue(fType));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRepoFrom == null) ? 0 : fRepoFrom.hashCode()); 
    result = prime * result + ((fRepoTo == null) ? 0 : fRepoTo.hashCode()); 
    result = prime * result + ((fType == null) ? 0 : fType.hashCode()); 
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
    if (!ImpactCausedByRemovedFieldsMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    ImpactCausedByRemovedFieldsMatch other = (ImpactCausedByRemovedFieldsMatch) obj;
    if (fRepoFrom == null) {if (other.fRepoFrom != null) return false;}
    else if (!fRepoFrom.equals(other.fRepoFrom)) return false;
    if (fRepoTo == null) {if (other.fRepoTo != null) return false;}
    else if (!fRepoTo.equals(other.fRepoTo)) return false;
    if (fType == null) {if (other.fType != null) return false;}
    else if (!fType.equals(other.fType)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return ImpactCausedByRemovedFieldsMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
