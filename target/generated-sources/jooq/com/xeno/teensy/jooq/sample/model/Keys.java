/*
 * This file is generated by jOOQ.
 */
package com.xeno.teensy.jooq.sample.model;


import com.xeno.teensy.jooq.sample.model.tables.FlywaySchemaHistory;
import com.xeno.teensy.jooq.sample.model.tables.Url;
import com.xeno.teensy.jooq.sample.model.tables.records.FlywaySchemaHistoryRecord;
import com.xeno.teensy.jooq.sample.model.tables.records.UrlRecord;

import javax.annotation.processing.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>teensy</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<UrlRecord, Integer> IDENTITY_URL = Identities0.IDENTITY_URL;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FlywaySchemaHistoryRecord> KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY = UniqueKeys0.KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY;
    public static final UniqueKey<UrlRecord> KEY_URL_PRIMARY = UniqueKeys0.KEY_URL_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<UrlRecord, Integer> IDENTITY_URL = Internal.createIdentity(Url.URL, Url.URL.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<FlywaySchemaHistoryRecord> KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "KEY_flyway_schema_history_PRIMARY", FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK);
        public static final UniqueKey<UrlRecord> KEY_URL_PRIMARY = Internal.createUniqueKey(Url.URL, "KEY_url_PRIMARY", Url.URL.ID);
    }
}
