/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding authors of books
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class TAuthorRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.tables.records.TAuthorRecord> {

	private static final long serialVersionUID = -1763594771;

	/**
	 * The author ID
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.tables.TAuthor.ID, value);
	}

	/**
	 * The author ID
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.tables.TAuthor.ID);
	}

	/**
	 * The author ID
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord> fetchTBookListByAuthorId() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.oracle.generatedclasses.tables.TBook.AUTHOR_ID.equal(getValue(org.jooq.test.oracle.generatedclasses.tables.TAuthor.ID)))
			.fetch();
	}

	/**
	 * The author ID
	 * 
	 * PRIMARY KEY
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public java.util.List<org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord> getTBookListByAuthorId() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.oracle.generatedclasses.tables.TBook.AUTHOR_ID.equal(getValue(org.jooq.test.oracle.generatedclasses.tables.TAuthor.ID)))
			.fetch();
	}

	/**
	 * The author ID
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord> fetchTBookListByCoAuthorId() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.oracle.generatedclasses.tables.TBook.CO_AUTHOR_ID.equal(getValue(org.jooq.test.oracle.generatedclasses.tables.TAuthor.ID)))
			.fetch();
	}

	/**
	 * The author ID
	 * 
	 * PRIMARY KEY
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public java.util.List<org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord> getTBookListByCoAuthorId() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.oracle.generatedclasses.tables.TBook.CO_AUTHOR_ID.equal(getValue(org.jooq.test.oracle.generatedclasses.tables.TAuthor.ID)))
			.fetch();
	}

	/**
	 * The author's first name
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.tables.TAuthor.FIRST_NAME, value);
	}

	/**
	 * The author's first name
	 */
	public java.lang.String getFirstName() {
		return getValue(org.jooq.test.oracle.generatedclasses.tables.TAuthor.FIRST_NAME);
	}

	/**
	 * The author's last name
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.tables.TAuthor.LAST_NAME, value);
	}

	/**
	 * The author's last name
	 */
	public java.lang.String getLastName() {
		return getValue(org.jooq.test.oracle.generatedclasses.tables.TAuthor.LAST_NAME);
	}

	/**
	 * The author's date of birth
	 */
	public void setDateOfBirth(java.sql.Date value) {
		setValue(org.jooq.test.oracle.generatedclasses.tables.TAuthor.DATE_OF_BIRTH, value);
	}

	/**
	 * The author's date of birth
	 */
	public java.sql.Date getDateOfBirth() {
		return getValue(org.jooq.test.oracle.generatedclasses.tables.TAuthor.DATE_OF_BIRTH);
	}

	/**
	 * The author's year of birth
	 */
	public void setYearOfBirth(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.tables.TAuthor.YEAR_OF_BIRTH, value);
	}

	/**
	 * The author's year of birth
	 */
	public java.lang.Integer getYearOfBirth() {
		return getValue(org.jooq.test.oracle.generatedclasses.tables.TAuthor.YEAR_OF_BIRTH);
	}

	/**
	 * The author's address
	 */
	public void setAddress(org.jooq.test.oracle.generatedclasses.udt.records.UAddressTypeRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.tables.TAuthor.ADDRESS, value);
	}

	/**
	 * The author's address
	 */
	public org.jooq.test.oracle.generatedclasses.udt.records.UAddressTypeRecord getAddress() {
		return getValue(org.jooq.test.oracle.generatedclasses.tables.TAuthor.ADDRESS);
	}

	/**
	 * Create a detached TAuthorRecord
	 */
	public TAuthorRecord() {
		super(org.jooq.test.oracle.generatedclasses.tables.TAuthor.T_AUTHOR);
	}

	/**
	 * Create an attached TAuthorRecord
	 */
	public TAuthorRecord(org.jooq.Configuration configuration) {
		super(org.jooq.test.oracle.generatedclasses.tables.TAuthor.T_AUTHOR, configuration);
	}
}
