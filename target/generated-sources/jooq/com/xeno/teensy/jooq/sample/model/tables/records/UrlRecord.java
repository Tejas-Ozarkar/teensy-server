/*
 * This file is generated by jOOQ.
 */
package com.xeno.teensy.jooq.sample.model.tables.records;


import com.xeno.teensy.jooq.sample.model.tables.Url;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class UrlRecord extends UpdatableRecordImpl<UrlRecord> implements Record5<Integer, String, String, Integer, String> {

    private static final long serialVersionUID = -1286537183;

    /**
     * Setter for <code>teensy.url.id</code>.
     */
    public UrlRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>teensy.url.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>teensy.url.shortUrl</code>.
     */
    public UrlRecord setShorturl(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>teensy.url.shortUrl</code>.
     */
    public String getShorturl() {
        return (String) get(1);
    }

    /**
     * Setter for <code>teensy.url.longUrl</code>.
     */
    public UrlRecord setLongurl(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>teensy.url.longUrl</code>.
     */
    public String getLongurl() {
        return (String) get(2);
    }

    /**
     * Setter for <code>teensy.url.userid</code>.
     */
    public UrlRecord setUserid(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>teensy.url.userid</code>.
     */
    public Integer getUserid() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>teensy.url.expirydate</code>.
     */
    public UrlRecord setExpirydate(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>teensy.url.expirydate</code>.
     */
    public String getExpirydate() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, Integer, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, String, Integer, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Url.URL.ID;
    }

    @Override
    public Field<String> field2() {
        return Url.URL.SHORTURL;
    }

    @Override
    public Field<String> field3() {
        return Url.URL.LONGURL;
    }

    @Override
    public Field<Integer> field4() {
        return Url.URL.USERID;
    }

    @Override
    public Field<String> field5() {
        return Url.URL.EXPIRYDATE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getShorturl();
    }

    @Override
    public String component3() {
        return getLongurl();
    }

    @Override
    public Integer component4() {
        return getUserid();
    }

    @Override
    public String component5() {
        return getExpirydate();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getShorturl();
    }

    @Override
    public String value3() {
        return getLongurl();
    }

    @Override
    public Integer value4() {
        return getUserid();
    }

    @Override
    public String value5() {
        return getExpirydate();
    }

    @Override
    public UrlRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public UrlRecord value2(String value) {
        setShorturl(value);
        return this;
    }

    @Override
    public UrlRecord value3(String value) {
        setLongurl(value);
        return this;
    }

    @Override
    public UrlRecord value4(Integer value) {
        setUserid(value);
        return this;
    }

    @Override
    public UrlRecord value5(String value) {
        setExpirydate(value);
        return this;
    }

    @Override
    public UrlRecord values(Integer value1, String value2, String value3, Integer value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UrlRecord
     */
    public UrlRecord() {
        super(Url.URL);
    }

    /**
     * Create a detached, initialised UrlRecord
     */
    public UrlRecord(Integer id, String shorturl, String longurl, Integer userid, String expirydate) {
        super(Url.URL);

        set(0, id);
        set(1, shorturl);
        set(2, longurl);
        set(3, userid);
        set(4, expirydate);
    }
}
