package cern.devtools.deps.query.repo.impactcausedbyremovedmethods;

import hu.bme.incquery.deps.repomodel.RMethod;
import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the impactCausedByRemovedMethods pattern, 
 * to be used in conjunction with ImpactCausedByRemovedMethodsMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ImpactCausedByRemovedMethodsMatcher
 * @see ImpactCausedByRemovedMethodsProcessor
 * 
 */
public final class ImpactCausedByRemovedMethodsMatch extends BasePatternMatch implements IPatternMatch {
  private RMethod fFrom;
  
  private RMethod fTo;
  
  private static String[] parameterNames = {"from", "to"};
  
  ImpactCausedByRemovedMethodsMatch(final RMethod pFrom, final RMethod pTo) {
    this.fFrom = pFrom;
    this.fTo = pTo;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("from".equals(parameterName)) return this.fFrom;
    if ("to".equals(parameterName)) return this.fTo;
    return null;
    
  }
  
  public RMethod getFrom() {
    return this.fFrom;
    
  }
  
  public RMethod getTo() {
    return this.fTo;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("from".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.repomodel.RMethod) {
    	this.fFrom = (hu.bme.incquery.deps.repomodel.RMethod) newValue;
    	return true;
    }
    if ("to".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.repomodel.RMethod) {
    	this.fTo = (hu.bme.incquery.deps.repomodel.RMethod) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setFrom(final RMethod pFrom) {
    this.fFrom = pFrom;
    
  }
  
  public void setTo(final RMethod pTo) {
    this.fTo = pTo;
    
  }
  
  @Override
  public String patternName() {
    return "impactCausedByRemovedMethods";
    
  }
  
  @Override
  public String[] parameterNames() {
    return ImpactCausedByRemovedMethodsMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fFrom, fTo};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"from\"=" + prettyPrintValue(fFrom) + ", ");
    result.append("\"to\"=" + prettyPrintValue(fTo));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fFrom == null) ? 0 : fFrom.hashCode()); 
    result = prime * result + ((fTo == null) ? 0 : fTo.hashCode()); 
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
    if (!ImpactCausedByRemovedMethodsMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    ImpactCausedByRemovedMethodsMatch other = (ImpactCausedByRemovedMethodsMatch) obj;
    if (fFrom == null) {if (other.fFrom != null) return false;}
    else if (!fFrom.equals(other.fFrom)) return false;
    if (fTo == null) {if (other.fTo != null) return false;}
    else if (!fTo.equals(other.fTo)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return ImpactCausedByRemovedMethodsMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
