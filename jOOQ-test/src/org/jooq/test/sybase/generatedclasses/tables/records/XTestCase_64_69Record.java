/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class XTestCase_64_69Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = 1523074527;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_71Record> fetchXTestCase_71List() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.sybase.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71)
			.where(org.jooq.test.sybase.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID.equal(getValue(org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public java.util.List<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_71Record> getXTestCase_71List() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.sybase.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71)
			.where(org.jooq.test.sybase.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID.equal(getValue(org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.x_test_case_64_69.UNUSED_ID]
	 * REFERENCES x_unused [dba.x_unused.ID]
	 * </pre></code>
	 */
	public void setUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69.UNUSED_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.x_test_case_64_69.UNUSED_ID]
	 * REFERENCES x_unused [dba.x_unused.ID]
	 * </pre></code>
	 */
	public java.lang.Integer getUnusedId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69.UNUSED_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.x_test_case_64_69.UNUSED_ID]
	 * REFERENCES x_unused [dba.x_unused.ID]
	 * </pre></code>
	 */
	public org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord fetchXUnused() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.sybase.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.sybase.generatedclasses.tables.XUnused.ID.equal(getValue(org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69.UNUSED_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.x_test_case_64_69.UNUSED_ID]
	 * REFERENCES x_unused [dba.x_unused.ID]
	 * </pre></code>
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord getXUnused() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.sybase.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.sybase.generatedclasses.tables.XUnused.ID.equal(getValue(org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69.UNUSED_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached XTestCase_64_69Record
	 */
	public XTestCase_64_69Record() {
		super(org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}

	/**
	 * Create an attached XTestCase_64_69Record
	 */
	public XTestCase_64_69Record(org.jooq.Configuration configuration) {
		super(org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, configuration);
	}
}
