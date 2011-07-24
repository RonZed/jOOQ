/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class TBook extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = -804494646;

	/**
	 * The singleton instance of t_book
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.TBook T_BOOK = new org.jooq.test.sybase.generatedclasses.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord> __RECORD_TYPE = org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, java.lang.Integer> ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, java.lang.Integer>("ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.t_book.AUTHOR_ID]
	 * REFERENCES t_author [dba.t_author.ID]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, java.lang.Integer>("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.t_book.CO_AUTHOR_ID]
	 * REFERENCES t_author [dba.t_author.ID]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, java.lang.Integer>("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, java.lang.Integer>("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, java.lang.String> TITLE = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, java.lang.String>("TITLE", org.jooq.impl.SQLDataType.VARCHAR, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, java.lang.Integer>("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.t_book.LANGUAGE_ID]
	 * REFERENCES t_language [dba.t_language.id]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, org.jooq.test.sybase.generatedclasses.enums.TLanguage> LANGUAGE_ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, org.jooq.test.sybase.generatedclasses.enums.TLanguage>("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER.asMasterDataType(org.jooq.test.sybase.generatedclasses.enums.TLanguage.class), T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, java.lang.String>("CONTENT_TEXT", org.jooq.impl.SQLDataType.LONGVARCHAR, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, byte[]> CONTENT_PDF = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, byte[]>("CONTENT_PDF", org.jooq.impl.SQLDataType.LONGVARBINARY, T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("t_book", org.jooq.test.sybase.generatedclasses.Dba.DBA);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord> getMainKey() {
		return org.jooq.test.sybase.generatedclasses.Keys.t_book_pk_t_book;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord>>asList(org.jooq.test.sybase.generatedclasses.Keys.t_book_pk_t_book);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, ?>>asList(org.jooq.test.sybase.generatedclasses.Keys.t_book_fk_t_book_author_id, org.jooq.test.sybase.generatedclasses.Keys.t_book_fk_t_book_co_author_id);
	}
}
