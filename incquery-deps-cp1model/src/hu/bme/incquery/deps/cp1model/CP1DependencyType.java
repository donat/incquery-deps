/**
 */
package hu.bme.incquery.deps.cp1model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CP1 Dependency Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hu.bme.incquery.deps.cp1model.Cp1modelPackage#getCP1DependencyType()
 * @model
 * @generated
 */
public enum CP1DependencyType implements Enumerator {
	/**
	 * The '<em><b>INHERITANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INHERITANCE_VALUE
	 * @generated
	 * @ordered
	 */
	INHERITANCE(5, "INHERITANCE", "5"),

	/**
	 * The '<em><b>METHOD CALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHOD_CALL_VALUE
	 * @generated
	 * @ordered
	 */
	METHOD_CALL(1, "METHOD_CALL", "1"),

	/**
	 * The '<em><b>METHOD OVERRIDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHOD_OVERRIDE_VALUE
	 * @generated
	 * @ordered
	 */
	METHOD_OVERRIDE(2, "METHOD_OVERRIDE", "2"),

	/**
	 * The '<em><b>FIELD REFERENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIELD_REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	FIELD_REFERENCE(3, "FIELD_REFERENCE", "3"),

	/**
	 * The '<em><b>CLASS USAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_USAGE_VALUE
	 * @generated
	 * @ordered
	 */
	CLASS_USAGE(4, "CLASS_USAGE", "4");

	/**
	 * The '<em><b>INHERITANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INHERITANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INHERITANCE
	 * @model literal="5"
	 * @generated
	 * @ordered
	 */
	public static final int INHERITANCE_VALUE = 5;

	/**
	 * The '<em><b>METHOD CALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METHOD CALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METHOD_CALL
	 * @model literal="1"
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_CALL_VALUE = 1;

	/**
	 * The '<em><b>METHOD OVERRIDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METHOD OVERRIDE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METHOD_OVERRIDE
	 * @model literal="2"
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_OVERRIDE_VALUE = 2;

	/**
	 * The '<em><b>FIELD REFERENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIELD REFERENCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIELD_REFERENCE
	 * @model literal="3"
	 * @generated
	 * @ordered
	 */
	public static final int FIELD_REFERENCE_VALUE = 3;

	/**
	 * The '<em><b>CLASS USAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLASS USAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLASS_USAGE
	 * @model literal="4"
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_USAGE_VALUE = 4;

	/**
	 * An array of all the '<em><b>CP1 Dependency Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CP1DependencyType[] VALUES_ARRAY =
		new CP1DependencyType[] {
			INHERITANCE,
			METHOD_CALL,
			METHOD_OVERRIDE,
			FIELD_REFERENCE,
			CLASS_USAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>CP1 Dependency Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CP1DependencyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CP1 Dependency Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CP1DependencyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CP1DependencyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CP1 Dependency Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CP1DependencyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CP1DependencyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CP1 Dependency Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CP1DependencyType get(int value) {
		switch (value) {
			case INHERITANCE_VALUE: return INHERITANCE;
			case METHOD_CALL_VALUE: return METHOD_CALL;
			case METHOD_OVERRIDE_VALUE: return METHOD_OVERRIDE;
			case FIELD_REFERENCE_VALUE: return FIELD_REFERENCE;
			case CLASS_USAGE_VALUE: return CLASS_USAGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CP1DependencyType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CP1DependencyType
