/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class TArraysRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.tables.records.TArraysRecord> {

	private static final long serialVersionUID = -142812855;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.tables.TArrays.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.tables.TArrays.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setStringArray(org.jooq.test.oracle.generatedclasses.udt.records.UStringArrayRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.tables.TArrays.STRING_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test.oracle.generatedclasses.udt.records.UStringArrayRecord getStringArray() {
		return getValue(org.jooq.test.oracle.generatedclasses.tables.TArrays.STRING_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setNumberArray(org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.tables.TArrays.NUMBER_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord getNumberArray() {
		return getValue(org.jooq.test.oracle.generatedclasses.tables.TArrays.NUMBER_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setNumberLongArray(org.jooq.test.oracle.generatedclasses.udt.records.UNumberLongArrayRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.tables.TArrays.NUMBER_LONG_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test.oracle.generatedclasses.udt.records.UNumberLongArrayRecord getNumberLongArray() {
		return getValue(org.jooq.test.oracle.generatedclasses.tables.TArrays.NUMBER_LONG_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setDateArray(org.jooq.test.oracle.generatedclasses.udt.records.UDateArrayRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.tables.TArrays.DATE_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test.oracle.generatedclasses.udt.records.UDateArrayRecord getDateArray() {
		return getValue(org.jooq.test.oracle.generatedclasses.tables.TArrays.DATE_ARRAY);
	}

	/**
	 * Create a detached TArraysRecord
	 */
	public TArraysRecord() {
		super(org.jooq.test.oracle.generatedclasses.tables.TArrays.T_ARRAYS);
	}

	/**
	 * Create an attached TArraysRecord
	 */
	public TArraysRecord(org.jooq.Configuration configuration) {
		super(org.jooq.test.oracle.generatedclasses.tables.TArrays.T_ARRAYS, configuration);
	}
}
