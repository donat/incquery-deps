package hu.bme.incquery.deps.modelloader;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;

public interface RepoModelLoadingService {

	Map<?, ?> loadOptions();
	
	Resource getUnloadedResource(List<String> targetProjects);
}
