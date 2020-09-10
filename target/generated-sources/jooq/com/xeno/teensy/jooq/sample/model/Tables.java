/*
 * This file is generated by jOOQ.
 */
package com.xeno.teensy.jooq.sample.model;


import com.xeno.teensy.jooq.sample.model.tables.Card;
import com.xeno.teensy.jooq.sample.model.tables.FlywaySchemaHistory;
import com.xeno.teensy.jooq.sample.model.tables.Tribe;
import com.xeno.teensy.jooq.sample.model.tables.TribeAdmin;
import com.xeno.teensy.jooq.sample.model.tables.Url;
import com.xeno.teensy.jooq.sample.model.tables.User;

import javax.annotation.processing.Generated;


/**
 * Convenience access to all tables in teensy
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>teensy.card</code>.
     */
    public static final Card CARD = Card.CARD;

    /**
     * The table <code>teensy.flyway_schema_history</code>.
     */
    public static final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>teensy.tribe</code>.
     */
    public static final Tribe TRIBE = Tribe.TRIBE;

    /**
     * The table <code>teensy.tribe_admin</code>.
     */
    public static final TribeAdmin TRIBE_ADMIN = TribeAdmin.TRIBE_ADMIN;

    /**
     * The table <code>teensy.url</code>.
     */
    public static final Url URL = Url.URL;

    /**
     * The table <code>teensy.user</code>.
     */
    public static final User USER = User.USER;
}