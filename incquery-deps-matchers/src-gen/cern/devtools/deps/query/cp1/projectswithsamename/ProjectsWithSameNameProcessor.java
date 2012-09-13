package cern.devtools.deps.query.cp1.projectswithsamename;

import cern.devtools.deps.query.cp1.projectswithsamename.ProjectsWithSameNameMatch;
import hu.bme.incquery.deps.cp1model.CP1Project;
import hu.bme.incquery.deps.wsmodel.WProject;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the projectsWithSameName pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class ProjectsWithSameNameProcessor implements IMatchProcessor<ProjectsWithSameNameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRepoProject the value of pattern parameter repoProject in the currently processed match 
   * @param pWsProject the value of pattern parameter wsProject in the currently processed match 
   * 
   */
  public abstract void process(final CP1Project repoProject, final WProject wsProject);
  
  @Override
  public void process(final ProjectsWithSameNameMatch match) {
    process(match.getRepoProject(), match.getWsProject());  				
    
  }
}
