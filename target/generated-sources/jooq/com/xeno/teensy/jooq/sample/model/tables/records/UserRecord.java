/*
 * This file is generated by jOOQ.
 */
package com.xeno.teensy.jooq.sample.model.tables.records;


import com.xeno.teensy.jooq.sample.model.tables.User;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record6<Integer, String, String, String, String, String> {

    private static final long serialVersionUID = 548113246;

    /**
     * Setter for <code>teensy.user.id</code>.
     */
    public UserRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>teensy.user.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>teensy.user.firstName</code>.
     */
    public UserRecord setFirstname(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>teensy.user.firstName</code>.
     */
    public String getFirstname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>teensy.user.lastName</code>.
     */
    public UserRecord setLastname(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>teensy.user.lastName</code>.
     */
    public String getLastname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>teensy.user.username</code>.
     */
    public UserRecord setUsername(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>teensy.user.username</code>.
     */
    public String getUsername() {
        return (String) get(3);
    }

    /**
     * Setter for <code>teensy.user.email</code>.
     */
    public UserRecord setEmail(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>teensy.user.email</code>.
     */
    public String getEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>teensy.user.password</code>.
     */
    public UserRecord setPassword(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>teensy.user.password</code>.
     */
    public String getPassword() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return User.USER.ID;
    }

    @Override
    public Field<String> field2() {
        return User.USER.FIRSTNAME;
    }

    @Override
    public Field<String> field3() {
        return User.USER.LASTNAME;
    }

    @Override
    public Field<String> field4() {
        return User.USER.USERNAME;
    }

    @Override
    public Field<String> field5() {
        return User.USER.EMAIL;
    }

    @Override
    public Field<String> field6() {
        return User.USER.PASSWORD;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getFirstname();
    }

    @Override
    public String component3() {
        return getLastname();
    }

    @Override
    public String component4() {
        return getUsername();
    }

    @Override
    public String component5() {
        return getEmail();
    }

    @Override
    public String component6() {
        return getPassword();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getFirstname();
    }

    @Override
    public String value3() {
        return getLastname();
    }

    @Override
    public String value4() {
        return getUsername();
    }

    @Override
    public String value5() {
        return getEmail();
    }

    @Override
    public String value6() {
        return getPassword();
    }

    @Override
    public UserRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public UserRecord value2(String value) {
        setFirstname(value);
        return this;
    }

    @Override
    public UserRecord value3(String value) {
        setLastname(value);
        return this;
    }

    @Override
    public UserRecord value4(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public UserRecord value5(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public UserRecord value6(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public UserRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Integer id, String firstname, String lastname, String username, String email, String password) {
        super(User.USER);

        set(0, id);
        set(1, firstname);
        set(2, lastname);
        set(3, username);
        set(4, email);
        set(5, password);
    }
}