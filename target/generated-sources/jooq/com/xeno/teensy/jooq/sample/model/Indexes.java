/*
 * This file is generated by jOOQ.
 */
package com.xeno.teensy.jooq.sample.model;


import com.xeno.teensy.jooq.sample.model.tables.FlywaySchemaHistory;
import com.xeno.teensy.jooq.sample.model.tables.Url;

import javax.annotation.processing.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>teensy</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index FLYWAY_SCHEMA_HISTORY_FLYWAY_SCHEMA_HISTORY_S_IDX = Indexes0.FLYWAY_SCHEMA_HISTORY_FLYWAY_SCHEMA_HISTORY_S_IDX;
    public static final Index FLYWAY_SCHEMA_HISTORY_PRIMARY = Indexes0.FLYWAY_SCHEMA_HISTORY_PRIMARY;
    public static final Index URL_PRIMARY = Indexes0.URL_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index FLYWAY_SCHEMA_HISTORY_FLYWAY_SCHEMA_HISTORY_S_IDX = Internal.createIndex("flyway_schema_history_s_idx", FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, new OrderField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.SUCCESS }, false);
        public static Index FLYWAY_SCHEMA_HISTORY_PRIMARY = Internal.createIndex("PRIMARY", FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, new OrderField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
        public static Index URL_PRIMARY = Internal.createIndex("PRIMARY", Url.URL, new OrderField[] { Url.URL.ID }, true);
    }
}
