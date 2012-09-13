package cern.devtools.deps.query.cp1.repoproject;

import hu.bme.incquery.deps.cp1model.CP1Project;
import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the repoProject pattern, 
 * to be used in conjunction with RepoProjectMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see RepoProjectMatcher
 * @see RepoProjectProcessor
 * 
 */
public final class RepoProjectMatch extends BasePatternMatch implements IPatternMatch {
  private CP1Project fP;
  
  private static String[] parameterNames = {"p"};
  
  RepoProjectMatch(final CP1Project pP) {
    this.fP = pP;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("p".equals(parameterName)) return this.fP;
    return null;
    
  }
  
  public CP1Project getP() {
    return this.fP;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("p".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.cp1model.CP1Project) {
    	this.fP = (hu.bme.incquery.deps.cp1model.CP1Project) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setP(final CP1Project pP) {
    this.fP = pP;
    
  }
  
  @Override
  public String patternName() {
    return "repoProject";
    
  }
  
  @Override
  public String[] parameterNames() {
    return RepoProjectMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fP};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"p\"=" + prettyPrintValue(fP));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fP == null) ? 0 : fP.hashCode()); 
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
    if (!RepoProjectMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    RepoProjectMatch other = (RepoProjectMatch) obj;
    if (fP == null) {if (other.fP != null) return false;}
    else if (!fP.equals(other.fP)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return RepoProjectMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
