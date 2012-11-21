package hu.bme.incquery.deps.ui.result;

public enum ResultItemType {
	/**
	 * When nothing to display.
	 */
	NULL,
	
	/**
	 * Root for a compilation unit (active source code editor or selection in the project explorer) to display.
	 */
	CU_ROOT,
	
	/**
	 * Root for a project to display.
	 */
	PROJECT_ROOT,
	
	/**
	 * Parent node for types.
	 */
	TYPE_ROOT,

	/**
	 * Parent node for the methods.
	 */
	METHOD_ROOT,
	
	/**
	 * Parent node for the fields.
	 */
	FIELD_ROOT,
	
	/**
	 * Node representing a type. Associated with an IType instance.
	 */
	JDT_TYPE,
	
	/**
	 * Node representing a method. Associated with an IMethod instance.
	 */
	JDT_METHOD,   
	
	/**
	 * Node representing a field. Associated with an IField instance.
	 */
	JDT_FIELD, 
	
	
	
	STRING,
	
	
}
