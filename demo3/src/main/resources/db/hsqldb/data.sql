INSERT INTO "ORDER"(ID, USER_ID, PAYMENT, STATUS, ADDRESS) VALUES (1, 1, 100, 0, 'shenzhen futian');
INSERT INTO "ORDER"(ID, USER_ID, PAYMENT, STATUS, ADDRESS) VALUES (2, 1, 200, 1, 'shenzhen futian');

INSERT INTO ORDER_ITEM(ORDER_ID, PRODUCT_ID, AMOUNT) VALUES (1, 1, 1);
INSERT INTO ORDER_ITEM(ORDER_ID, PRODUCT_ID, AMOUNT) VALUES (1, 2, 1);
INSERT INTO ORDER_ITEM(ORDER_ID, PRODUCT_ID, AMOUNT) VALUES (1, 3, 2);

INSERT INTO ORDER_ITEM(ORDER_ID, PRODUCT_ID, AMOUNT) VALUES (2, 1, 2);
INSERT INTO ORDER_ITEM(ORDER_ID, PRODUCT_ID, AMOUNT) VALUES (2, 2, 3);