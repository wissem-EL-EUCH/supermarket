-- password in plaintext: "password"
INSERT INTO USER (user_id, password, email, username, name, last_name, active)
VALUES
  (1, '$2a$06$OAPObzhRdRXBCbk7Hj/ot.jY3zPwR8n7/mfLtKIgTzdJa4.6TwsIm', 'user@mail.com', 'user', 'Name', 'Surname',
   1);
-- password in plaintext: "password"
INSERT INTO USER (user_id, password, email, username, name, last_name, active)
VALUES
  (2, '$2a$06$OAPObzhRdRXBCbk7Hj/ot.jY3zPwR8n7/mfLtKIgTzdJa4.6TwsIm', 'simpleuser@gmail.com', 'simple', 'User', 'simple', 1);


INSERT INTO ROLE (role_id, role)
VALUES (1, 'ROLE_ADMIN');
INSERT INTO ROLE (role_id, role)
VALUES (2, 'ROLE_USER');

INSERT INTO USER_ROLE (user_id, role_id)
VALUES (1, 1);
INSERT INTO USER_ROLE (user_id, role_id)
VALUES (1, 2);
INSERT INTO USER_ROLE (user_id, role_id)
VALUES (2, 2);


INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('Apple', 'Red Apple', 100, 0.20);
INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('Orange', 'Delicious Orange', 150, 0.50);
INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('Watermelon', 'Juicy Watermelon', 120, 0.80);
INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('Melon', 'Juicy melon', 120, 0.60);
INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('lemon', 'yellow lemon', 120, 0.30);