DROP TABLE IF EXISTS portal;
DROP TABLE IF EXISTS grid;

CREATE TABLE grid
    (    uuid         TEXT PRIMARY KEY
    ,    description  TEXT
    );
CREATE UNIQUE INDEX grid_names ON grid(description);
    
CREATE TABLE portal
    (    uuid         TEXT PRIMARY KEY
    ,    entrance     TEXT REFERENCES grid(uuid)
    ,    entrance_x   REAL
    ,    entrance_y   REAL
    ,    exit         TEXT REFERENCES grid(uuid)
    ,    exit_x       REAL
    ,    exit_y       REAL
    );
    
/*
CREATE TABLE gobs ( uuid TEXT PRIMARY KEY );
CREATE TABLE gents (
    gob  TEXT REFERENCES gobs(uuid),
    name TEXT
);
CREATE UNIQUE INDEX i1 ON gents(gob);
CREATE TABLE stat (
    uuid TEXT REFERENCES gets(uuid),
    stat TEXT,
    value INTEGER
);
CREATE UNIQUE INDEX i2 ON stat(uuid,stat);
DROP TABLE IF EXISTS objective;
CREATE TABLE objective (
    guid    STRING (36)  REFERENCES guid(guid),
    name    STRING (255)
);
DROP TABLE IF EXISTS dependence;
CREATE TABLE dependence (
    objective_guid          STRING (36) REFERENCES objective(guid),
    requires_objective_guid STRING (36) REFERENCES objective(guid)
);
DROP TABLE IF EXISTS character;
CREATE TABLE character (
    name    STRING(16) PRIMARY KEY,
    guid    STRING(36) REFERENCES guid(guid)
);
*/
