/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class LongRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.LongRecord> {

	private static final long serialVersionUID = 865188888;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.Long.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.Long.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setOther(java.lang.Long value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.Long.OTHER, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Long getOther() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.Long.OTHER);
	}

	/**
	 * Create a detached LongRecord
	 */
	public LongRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.Long.LONG);
	}

	/**
	 * Create an attached LongRecord
	 * @deprecated - (#363) use the other constructor instead
	 */
	@Deprecated
	public LongRecord(org.jooq.Configuration configuration) {
		super(org.jooq.test.hsqldb.generatedclasses.tables.Long.LONG, configuration);
	}
}
