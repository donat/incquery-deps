package cern.devtools.deps.query.repo.incominginheritancedeps;

import hu.bme.incquery.deps.repomodel.RClass;
import hu.bme.incquery.deps.wsmodel.WType;
import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the incomingInheritanceDeps pattern, 
 * to be used in conjunction with IncomingInheritanceDepsMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see IncomingInheritanceDepsMatcher
 * @see IncomingInheritanceDepsProcessor
 * 
 */
public final class IncomingInheritanceDepsMatch extends BasePatternMatch implements IPatternMatch {
  private RClass fFrom;
  
  private RClass fTo;
  
  private WType fWsTo;
  
  private static String[] parameterNames = {"from", "to", "wsTo"};
  
  IncomingInheritanceDepsMatch(final RClass pFrom, final RClass pTo, final WType pWsTo) {
    this.fFrom = pFrom;
    this.fTo = pTo;
    this.fWsTo = pWsTo;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("from".equals(parameterName)) return this.fFrom;
    if ("to".equals(parameterName)) return this.fTo;
    if ("wsTo".equals(parameterName)) return this.fWsTo;
    return null;
    
  }
  
  public RClass getFrom() {
    return this.fFrom;
    
  }
  
  public RClass getTo() {
    return this.fTo;
    
  }
  
  public WType getWsTo() {
    return this.fWsTo;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("from".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.repomodel.RClass) {
    	this.fFrom = (hu.bme.incquery.deps.repomodel.RClass) newValue;
    	return true;
    }
    if ("to".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.repomodel.RClass) {
    	this.fTo = (hu.bme.incquery.deps.repomodel.RClass) newValue;
    	return true;
    }
    if ("wsTo".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.wsmodel.WType) {
    	this.fWsTo = (hu.bme.incquery.deps.wsmodel.WType) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setFrom(final RClass pFrom) {
    this.fFrom = pFrom;
    
  }
  
  public void setTo(final RClass pTo) {
    this.fTo = pTo;
    
  }
  
  public void setWsTo(final WType pWsTo) {
    this.fWsTo = pWsTo;
    
  }
  
  @Override
  public String patternName() {
    return "incomingInheritanceDeps";
    
  }
  
  @Override
  public String[] parameterNames() {
    return IncomingInheritanceDepsMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fFrom, fTo, fWsTo};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"from\"=" + prettyPrintValue(fFrom) + ", ");
    result.append("\"to\"=" + prettyPrintValue(fTo) + ", ");
    result.append("\"wsTo\"=" + prettyPrintValue(fWsTo));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fFrom == null) ? 0 : fFrom.hashCode()); 
    result = prime * result + ((fTo == null) ? 0 : fTo.hashCode()); 
    result = prime * result + ((fWsTo == null) ? 0 : fWsTo.hashCode()); 
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
    if (!IncomingInheritanceDepsMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    IncomingInheritanceDepsMatch other = (IncomingInheritanceDepsMatch) obj;
    if (fFrom == null) {if (other.fFrom != null) return false;}
    else if (!fFrom.equals(other.fFrom)) return false;
    if (fTo == null) {if (other.fTo != null) return false;}
    else if (!fTo.equals(other.fTo)) return false;
    if (fWsTo == null) {if (other.fWsTo != null) return false;}
    else if (!fWsTo.equals(other.fWsTo)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return IncomingInheritanceDepsMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
