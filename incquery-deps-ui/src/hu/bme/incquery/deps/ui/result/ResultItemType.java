package hu.bme.incquery.deps.ui.result;

public enum ResultItemType {
	/**
	 * When nothing to display.
	 */
	NULL,
	
	/**
	 * Root for a project to display.
	 */
	PROJECT_ROOT,
	
	/**
	 * Root for a compilation unit (active source code editor or selection in the project explorer) to display.
	 */
	CU_ROOT,
	
	/**
	 * A type definition which exist only in the workspace.
	 */
	TYPE_ADDED,
	
	TYPE_SYNC,
	
	TYPE_REMOVED,
	
	TYPE_REMOTE,
	
	DEPENDENCIES,
	
	METHODS,
	
	METHOD_ADDED,
	
	METHOD_SYNC,
	
	METHOD_REMOVED,
	
	
//	PROJECT_IN_REPO,
//	ADDED_CLASSES_ROOT,
//	REMOVED_CLASSES_ROOT,
//	WS_CLASS,
//	REPO_CLASS,
//	CU_ROOT,
//	JDT_TYPE, 
//	NOT_DEFINED, 
//	CLASS_ROOT,
//	INCOMING_DEPENDENCY_ROOT, 
//	INCDEP_INHERITANCE,
//	INCDEP_CLASS_USAGE,
//	METHODS_ROOT,
//	FIELDS_ROOT,
//	METHOD, 
//	FIELD
}
