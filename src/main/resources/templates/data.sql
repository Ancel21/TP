CREATE TABLE address(
    id int primary key not null,
    creation timestamp,
    content text
);
INSERT INTO address (id, creation, content) VALUES (1, CURRENT_TIMESTAMP(), '57 boulevard demorieux');
INSERT INTO address (id, creation, content) VALUES (2, CURRENT_TIMESTAMP(), '51 allee du gamay 34080 montpellier');
commit;