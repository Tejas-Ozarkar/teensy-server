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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Teensy extends SchemaImpl {

    private static final long serialVersionUID = -1987557570;

    /**
     * The reference instance of <code>teensy</code>
     */
    public static final Teensy TEENSY = new Teensy();

    /**
     * The table <code>teensy.card</code>.
     */
    public final Card CARD = com.xeno.teensy.jooq.sample.model.tables.Card.CARD;

    /**
     * The table <code>teensy.flyway_schema_history</code>.
     */
    public final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = com.xeno.teensy.jooq.sample.model.tables.FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>teensy.tribe</code>.
     */
    public final Tribe TRIBE = com.xeno.teensy.jooq.sample.model.tables.Tribe.TRIBE;

    /**
     * The table <code>teensy.tribe_admin</code>.
     */
    public final TribeAdmin TRIBE_ADMIN = com.xeno.teensy.jooq.sample.model.tables.TribeAdmin.TRIBE_ADMIN;

    /**
     * The table <code>teensy.url</code>.
     */
    public final Url URL = com.xeno.teensy.jooq.sample.model.tables.Url.URL;

    /**
     * The table <code>teensy.user</code>.
     */
    public final User USER = com.xeno.teensy.jooq.sample.model.tables.User.USER;

    /**
     * No further instances allowed
     */
    private Teensy() {
        super("teensy", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Card.CARD,
            FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY,
            Tribe.TRIBE,
            TribeAdmin.TRIBE_ADMIN,
            Url.URL,
            User.USER);
    }
}
