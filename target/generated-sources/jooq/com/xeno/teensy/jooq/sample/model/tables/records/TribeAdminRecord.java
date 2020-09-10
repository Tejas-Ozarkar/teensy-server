/*
 * This file is generated by jOOQ.
 */
package com.xeno.teensy.jooq.sample.model.tables.records;


import com.xeno.teensy.jooq.sample.model.tables.TribeAdmin;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class TribeAdminRecord extends UpdatableRecordImpl<TribeAdminRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = 1186863202;

    /**
     * Setter for <code>teensy.tribe_admin.id</code>.
     */
    public TribeAdminRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>teensy.tribe_admin.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>teensy.tribe_admin.userId</code>.
     */
    public TribeAdminRecord setUserid(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>teensy.tribe_admin.userId</code>.
     */
    public Integer getUserid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>teensy.tribe_admin.groupId</code>.
     */
    public TribeAdminRecord setGroupid(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>teensy.tribe_admin.groupId</code>.
     */
    public Integer getGroupid() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TribeAdmin.TRIBE_ADMIN.ID;
    }

    @Override
    public Field<Integer> field2() {
        return TribeAdmin.TRIBE_ADMIN.USERID;
    }

    @Override
    public Field<Integer> field3() {
        return TribeAdmin.TRIBE_ADMIN.GROUPID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getUserid();
    }

    @Override
    public Integer component3() {
        return getGroupid();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getUserid();
    }

    @Override
    public Integer value3() {
        return getGroupid();
    }

    @Override
    public TribeAdminRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public TribeAdminRecord value2(Integer value) {
        setUserid(value);
        return this;
    }

    @Override
    public TribeAdminRecord value3(Integer value) {
        setGroupid(value);
        return this;
    }

    @Override
    public TribeAdminRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TribeAdminRecord
     */
    public TribeAdminRecord() {
        super(TribeAdmin.TRIBE_ADMIN);
    }

    /**
     * Create a detached, initialised TribeAdminRecord
     */
    public TribeAdminRecord(Integer id, Integer userid, Integer groupid) {
        super(TribeAdmin.TRIBE_ADMIN);

        set(0, id);
        set(1, userid);
        set(2, groupid);
    }
}