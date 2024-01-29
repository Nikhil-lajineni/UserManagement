CREATE TABLE address
(
    id              BIGINT NOT NULL,
    created_at      datetime NULL,
    last_updated_at datetime NULL,
    is_deleted      BIT(1) NULL,
    city            VARCHAR(255) NULL,
    street          VARCHAR(255) NULL,
    number          BIGINT NULL,
    zipcode         VARCHAR(255) NULL,
    geolocation_id  BIGINT NULL,
    CONSTRAINT pk_address PRIMARY KEY (id)
);

CREATE TABLE geo_location
(
    id              BIGINT NOT NULL,
    created_at      datetime NULL,
    last_updated_at datetime NULL,
    is_deleted      BIT(1) NULL,
    lat             VARCHAR(255) NULL,
    lon             VARCHAR(255) NULL,
    CONSTRAINT pk_geolocation PRIMARY KEY (id)
);

CREATE TABLE name
(
    id              BIGINT NOT NULL,
    created_at      datetime NULL,
    last_updated_at datetime NULL,
    is_deleted      BIT(1) NULL,
    first_name      VARCHAR(255) NULL,
    last_name       VARCHAR(255) NULL,
    CONSTRAINT pk_name PRIMARY KEY (id)
);

CREATE TABLE user
(
    id              BIGINT NOT NULL,
    created_at      datetime NULL,
    last_updated_at datetime NULL,
    is_deleted      BIT(1) NULL,
    email           VARCHAR(255) NULL,
    user_name       VARCHAR(255) NULL,
    password        VARCHAR(255) NULL,
    name_id         BIGINT NULL,
    address_id      BIGINT NULL,
    phone           VARCHAR(255) NULL,
    CONSTRAINT pk_user PRIMARY KEY (id)
);

ALTER TABLE address
    ADD CONSTRAINT FK_ADDRESS_ON_GEOLOCATION FOREIGN KEY (geolocation_id) REFERENCES geo_location (id);

ALTER TABLE user
    ADD CONSTRAINT FK_USER_ON_ADDRESS FOREIGN KEY (address_id) REFERENCES address (id);

ALTER TABLE user
    ADD CONSTRAINT FK_USER_ON_NAME FOREIGN KEY (name_id) REFERENCES name (id);