package hu.bme.incquery.deps.util;

/**
 * Enumeration containing the defined type of dependencies.
 * 
 * @author Donat Csikos
 */
public enum DependencyType {
	/**
	 * Method call dependency.
	 */
	METHOD_CALL(1),

	/**
	 * Method override in the
	 */
	METHOD_OVERRIDE(2),

	/**
	 * Field reference dependency.
	 */
	FIELD_REFERENCE(3),

	/**
	 * Class usage dependency.
	 */
	CLASS_USAGE(4),

	/**
	 * Inheritance dependency.
	 */
	CLASS_INHERITANCE(5),

	/**
	 * Inherited dependency. This dependency occurs when the project has any kind of dependency (from above) contained
	 * inside.
	 */
	PRODUCT_DEPENDENCY(6);

	private final int value;

	
	DependencyType(int value) {
		this.value = value;
	}
	

	public int value() {
		return value;
	}

	public static DependencyType typeOf(int val) {
		switch (val) {
		case 1:
			return METHOD_CALL;
		case 2:
			return METHOD_OVERRIDE;
		case 3:
			return FIELD_REFERENCE;
		case 4:
			return CLASS_USAGE;
		case 5:
			return CLASS_INHERITANCE;
		case 6:
			return PRODUCT_DEPENDENCY;
		default:
			throw new RuntimeException("This type does not exist");
		}
	}
}
