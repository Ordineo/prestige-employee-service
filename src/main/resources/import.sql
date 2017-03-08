INSERT INTO USERS (USERNAME, PASSWORD, EMAIL, FIRSTNAME, LASTNAME, AVATAR, PHONE, UNIT, GENDER) VALUES ('tyranwyn', 'derp', 'sammi.fux@ordina.be', 'Sammi', 'Fux', 'https://media.licdn.com/media/AAEAAQAAAAAAAAVgAAAAJDRjNGE2ZWVkLTM3NzEtNDNhZC1hMDdiLTI3NmU4MGU5Mzk0Zg.jpg', '0469696969', 'JWORKS', 'M');
INSERT INTO USERS (USERNAME, PASSWORD, EMAIL, FIRSTNAME, LASTNAME, AVATAR, PHONE, UNIT, GENDER) VALUES ('Nivek', 'derp', 'kevin.vam.houtte@ordina.be', 'Kevin', 'Van Houtte', 'http://d33v4339jhl8k0.cloudfront.net/docs/assets/528e78fee4b0865bc066be5a/images/52af1e8ce4b074ab9e98f0e0/file-mxuiNezRS5.jpg', '0469696969', 'JWORKS', 'M');
INSERT INTO USERS (USERNAME, PASSWORD, EMAIL, FIRSTNAME, LASTNAME, AVATAR, PHONE, UNIT, GENDER) VALUES ('Turbots', 'derp', 'dieter.hubau@ordina.be', 'Dieter', 'Hubau', 'http://d33v4339jhl8k0.cloudfront.net/docs/assets/528e78fee4b0865bc066be5a/images/52af1e8ce4b074ab9e98f0e0/file-mxuiNezRS5.jpg', '0469696969', 'JWORKS', 'M');
INSERT INTO USERS (USERNAME, PASSWORD, EMAIL, FIRSTNAME, LASTNAME, AVATAR, PHONE, UNIT, GENDER) VALUES ('Gide', 'derp', 'gina.de.beukelaer@ordina.be', 'Gina', 'De Beukelaer', 'http://d33v4339jhl8k0.cloudfront.net/docs/assets/528e78fee4b0865bc066be5a/images/52af1e8ce4b074ab9e98f0e0/file-mxuiNezRS5.jpg', '0469696969', 'JWORKS', 'V');
INSERT INTO USERS (USERNAME, PASSWORD, EMAIL, FIRSTNAME, LASTNAME, AVATAR, PHONE, UNIT, GENDER) VALUES ('Rydg', 'derp', 'ryan.de.gruyter@ordina.be', 'Ryan', 'De Gruyter', 'http://d33v4339jhl8k0.cloudfront.net/docs/assets/528e78fee4b0865bc066be5a/images/52af1e8ce4b074ab9e98f0e0/file-mxuiNezRS5.jpg', '0469696969', 'JWORKS', 'M');
INSERT INTO USERS (USERNAME, PASSWORD, EMAIL, FIRSTNAME, LASTNAME, AVATAR, PHONE, UNIT, GENDER) VALUES ('Hami', 'derp', 'hans.michiels@ordina.be', 'Hans', 'Michiels', 'http://d33v4339jhl8k0.cloudfront.net/docs/assets/528e78fee4b0865bc066be5a/images/52af1e8ce4b074ab9e98f0e0/file-mxuiNezRS5.jpg', '0469696969', 'JWORKS', 'M');
INSERT INTO USERS (USERNAME, PASSWORD, EMAIL, FIRSTNAME, LASTNAME, AVATAR, PHONE, UNIT, GENDER) VALUES ('Jabi', 'derp', 'jasper.biesmans@ordina.be', 'Jasper', 'Biesemans', 'http://d33v4339jhl8k0.cloudfront.net/docs/assets/528e78fee4b0865bc066be5a/images/52af1e8ce4b074ab9e98f0e0/file-mxuiNezRS5.jpg', '0469696969', 'JWORKS', 'M');
INSERT INTO USERS (USERNAME, PASSWORD, EMAIL, FIRSTNAME, LASTNAME, AVATAR, PHONE, UNIT, GENDER) VALUES ('Dedu', 'derp', 'derya.duru@ordina.be', 'Derya', 'Duru', 'http://d33v4339jhl8k0.cloudfront.net/docs/assets/528e78fee4b0865bc066be5a/images/52af1e8ce4b074ab9e98f0e0/file-mxuiNezRS5.jpg', '0469696969', 'JWORKS', 'V');
INSERT INTO USERS (USERNAME, PASSWORD, EMAIL, FIRSTNAME, LASTNAME, AVATAR, PHONE, UNIT, GENDER) VALUES ('JLEFE1', 'derp', 'joris.lefever@ordina.be', 'Joris', 'Lefever', 'http://d33v4339jhl8k0.cloudfront.net/docs/assets/528e78fee4b0865bc066be5a/images/52af1e8ce4b074ab9e98f0e0/file-mxuiNezRS5.jpg', '0469696969', 'JWORKS', 'M');

INSERT INTO ROLES (TITLE) VALUES ('rookie');
INSERT INTO ROLE_ASSIGNMENTS (USER_ID, ROLE_ID) VALUES (1, 1);
INSERT INTO ROLES (TITLE) VALUES ('senior');
INSERT INTO ROLE_ASSIGNMENTS (USER_ID, ROLE_ID) VALUES (2, 2);
INSERT INTO ROLE_ASSIGNMENTS (USER_ID, ROLE_ID) VALUES (3, 2);
INSERT INTO ROLE_ASSIGNMENTS (USER_ID, ROLE_ID) VALUES (4, 2);
INSERT INTO ROLE_ASSIGNMENTS (USER_ID, ROLE_ID) VALUES (5, 2);
INSERT INTO ROLE_ASSIGNMENTS (USER_ID, ROLE_ID) VALUES (6, 2);
INSERT INTO ROLE_ASSIGNMENTS (USER_ID, ROLE_ID) VALUES (7, 2);
INSERT INTO ROLE_ASSIGNMENTS (USER_ID, ROLE_ID) VALUES (8, 2);
INSERT INTO ROLE_ASSIGNMENTS (USER_ID, ROLE_ID) VALUES (9, 2);
INSERT INTO ROLES (TITLE) VALUES ('admin');
INSERT INTO ROLE_ASSIGNMENTS (USER_ID, ROLE_ID) VALUES (1, 3);
INSERT INTO ROLE_ASSIGNMENTS (USER_ID, ROLE_ID) VALUES (9, 3);

INSERT INTO CATEGORIES (NAME) VALUES ('Presentation');
INSERT INTO CATEGORIES (NAME) VALUES ('Email');
INSERT INTO CATEGORIES (NAME) VALUES ('Coffee');
INSERT INTO CATEGORIES (NAME) VALUES ('Briefing');
INSERT INTO CATEGORIES (NAME) VALUES ('Workshop');

INSERT INTO PRESTIGES (GRANTOR_ID, RECEIVER_ID, SCORE, REASON, URL) VALUES (2, 3, 1, 'De presentatie was super duidelijk', 'https://www.ordina.be/');
INSERT INTO CATEGORY_ASSIGNMENTS (PRESTIGE_ID, CATEGORY_ID) VALUES (1, 1);
INSERT INTO CATEGORY_ASSIGNMENTS (PRESTIGE_ID, CATEGORY_ID) VALUES (1, 4);
INSERT INTO PRESTIGES (GRANTOR_ID, RECEIVER_ID, SCORE, REASON, URL) VALUES (4, 5, 1, 'Bedankt voor de goede koffie', 'https://www.google.be/');
INSERT INTO CATEGORY_ASSIGNMENTS (PRESTIGE_ID, CATEGORY_ID) VALUES (2, 3);
INSERT INTO PRESTIGES (GRANTOR_ID, RECEIVER_ID, SCORE, REASON, URL) VALUES (1, 9, 1, 'Alles rond de workshop was geweldig, veel bijgeleerd!', 'https://www.facebook.com/');
INSERT INTO CATEGORY_ASSIGNMENTS (PRESTIGE_ID, CATEGORY_ID) VALUES (3, 2);
INSERT INTO CATEGORY_ASSIGNMENTS (PRESTIGE_ID, CATEGORY_ID) VALUES (3, 4);
INSERT INTO CATEGORY_ASSIGNMENTS (PRESTIGE_ID, CATEGORY_ID) VALUES (3, 5);
INSERT INTO PRESTIGES (GRANTOR_ID, RECEIVER_ID, SCORE, REASON, URL) VALUES (9, 7, 1, 'Heel gestructureerde email', 'https://www.ordina.be/');
INSERT INTO CATEGORY_ASSIGNMENTS (PRESTIGE_ID, CATEGORY_ID) VALUES (4, 2);

INSERT INTO PRESTIGE_LIKES (USER_ID, PRESTIGE_ID, REASON) VALUES (2, 3, 'Cuz i liek diz');
INSERT INTO PRESTIGE_LIKES (USER_ID, PRESTIGE_ID, REASON) VALUES (8, 3, 'Cuz i liek diz too');
INSERT INTO PRESTIGE_LIKES (USER_ID, PRESTIGE_ID, REASON) VALUES (7, 3, 'Cuz i liek diz three');
INSERT INTO PRESTIGE_LIKES (USER_ID, PRESTIGE_ID, REASON) VALUES (9, 3, 'Cuz i liek diz four');
INSERT INTO PRESTIGE_LIKES (USER_ID, PRESTIGE_ID, REASON) VALUES (4, 1, 'Amuzing');