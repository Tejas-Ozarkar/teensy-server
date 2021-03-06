/*
 * This file is generated by jOOQ.
 */
package com.xeno.teensy.jooq.sample.model.tables;


import com.xeno.teensy.jooq.sample.model.Indexes;
import com.xeno.teensy.jooq.sample.model.Keys;
import com.xeno.teensy.jooq.sample.model.Teensy;
import com.xeno.teensy.jooq.sample.model.tables.records.UrlRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Url extends TableImpl<UrlRecord> {

    private static final long serialVersionUID = -785530920;

    /**
     * The reference instance of <code>teensy.url</code>
     */
    public static final Url URL = new Url();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UrlRecord> getRecordType() {
        return UrlRecord.class;
    }

    /**
     * The column <code>teensy.url.id</code>.
     */
    public final TableField<UrlRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>teensy.url.shortUrl</code>.
     */
    public final TableField<UrlRecord, String> SHORTURL = createField(DSL.name("shortUrl"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>teensy.url.longUrl</code>.
     */
    public final TableField<UrlRecord, String> LONGURL = createField(DSL.name("longUrl"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>teensy.url.userid</code>.
     */
    public final TableField<UrlRecord, Integer> USERID = createField(DSL.name("userid"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>teensy.url.expirydate</code>.
     */
    public final TableField<UrlRecord, String> EXPIRYDATE = createField(DSL.name("expirydate"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>teensy.url</code> table reference
     */
    public Url() {
        this(DSL.name("url"), null);
    }

    /**
     * Create an aliased <code>teensy.url</code> table reference
     */
    public Url(String alias) {
        this(DSL.name(alias), URL);
    }

    /**
     * Create an aliased <code>teensy.url</code> table reference
     */
    public Url(Name alias) {
        this(alias, URL);
    }

    private Url(Name alias, Table<UrlRecord> aliased) {
        this(alias, aliased, null);
    }

    private Url(Name alias, Table<UrlRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Url(Table<O> child, ForeignKey<O, UrlRecord> key) {
        super(child, key, URL);
    }

    @Override
    public Schema getSchema() {
        return Teensy.TEENSY;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.URL_PRIMARY, Indexes.URL_USERID);
    }

    @Override
    public Identity<UrlRecord, Integer> getIdentity() {
        return Keys.IDENTITY_URL;
    }

    @Override
    public UniqueKey<UrlRecord> getPrimaryKey() {
        return Keys.KEY_URL_PRIMARY;
    }

    @Override
    public List<UniqueKey<UrlRecord>> getKeys() {
        return Arrays.<UniqueKey<UrlRecord>>asList(Keys.KEY_URL_PRIMARY);
    }

    @Override
    public List<ForeignKey<UrlRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UrlRecord, ?>>asList(Keys.URL_IBFK_1);
    }

    public User user() {
        return new User(this, Keys.URL_IBFK_1);
    }

    @Override
    public Url as(String alias) {
        return new Url(DSL.name(alias), this);
    }

    @Override
    public Url as(Name alias) {
        return new Url(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Url rename(String name) {
        return new Url(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Url rename(Name name) {
        return new Url(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, Integer, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
