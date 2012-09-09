package cern.devtools.deps.query.cp1.projectswithsamename;

import hu.bme.incquery.deps.cp1model.CP1Project;
import hu.bme.incquery.deps.wsmodel.WProject;
import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the projectsWithSameName pattern, 
 * to be used in conjunction with ProjectsWithSameNameMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ProjectsWithSameNameMatcher
 * @see ProjectsWithSameNameProcessor
 * 
 */
public final class ProjectsWithSameNameMatch extends BasePatternMatch implements IPatternMatch {
  private CP1Project fRepoProject;
  
  private WProject fWsProject;
  
  private static String[] parameterNames = {"repoProject", "wsProject"};
  
  ProjectsWithSameNameMatch(final CP1Project pRepoProject, final WProject pWsProject) {
    this.fRepoProject = pRepoProject;
    this.fWsProject = pWsProject;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("repoProject".equals(parameterName)) return this.fRepoProject;
    if ("wsProject".equals(parameterName)) return this.fWsProject;
    return null;
    
  }
  
  public CP1Project getRepoProject() {
    return this.fRepoProject;
    
  }
  
  public WProject getWsProject() {
    return this.fWsProject;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("repoProject".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.cp1model.CP1Project) {
    	this.fRepoProject = (hu.bme.incquery.deps.cp1model.CP1Project) newValue;
    	return true;
    }
    if ("wsProject".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.wsmodel.WProject) {
    	this.fWsProject = (hu.bme.incquery.deps.wsmodel.WProject) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setRepoProject(final CP1Project pRepoProject) {
    this.fRepoProject = pRepoProject;
    
  }
  
  public void setWsProject(final WProject pWsProject) {
    this.fWsProject = pWsProject;
    
  }
  
  @Override
  public String patternName() {
    return "projectsWithSameName";
    
  }
  
  @Override
  public String[] parameterNames() {
    return ProjectsWithSameNameMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRepoProject, fWsProject};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"repoProject\"=" + prettyPrintValue(fRepoProject) + ", ");
    result.append("\"wsProject\"=" + prettyPrintValue(fWsProject));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRepoProject == null) ? 0 : fRepoProject.hashCode()); 
    result = prime * result + ((fWsProject == null) ? 0 : fWsProject.hashCode()); 
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
    if (!ProjectsWithSameNameMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    ProjectsWithSameNameMatch other = (ProjectsWithSameNameMatch) obj;
    if (fRepoProject == null) {if (other.fRepoProject != null) return false;}
    else if (!fRepoProject.equals(other.fRepoProject)) return false;
    if (fWsProject == null) {if (other.fWsProject != null) return false;}
    else if (!fWsProject.equals(other.fWsProject)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return ProjectsWithSameNameMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
