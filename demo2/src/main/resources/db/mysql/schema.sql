
CREATE TABLE `order` (
  id bigint auto_increment primary key ,
  user_id int NOT NULL comment '用户ID',
  payment int NOT NULL comment '订单总额',
  status int DEFAULT 0 NOT NULL comment '订单状态: 0-待支付,1-已支付.',
  address varchar(50) comment '配送地址',
  creator     varchar(32)                         null comment '创建人',
  modifier    varchar(32)                         null comment '修改人',
  create_time timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
  update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '修改时间',
  deleted     tinyint(2) default '0'              not null comment '是否标志'
);

CREATE INDEX order_uid ON `order` (user_id);


CREATE TABLE order_item (
  id bigint auto_increment primary key ,
  order_id int NOT NULL ,
  product_id int NOT NULL ,
  amount int NOT NULL ,
  creator     varchar(32)                         null ,
  modifier    varchar(32)                         null ,
  create_time timestamp default CURRENT_TIMESTAMP not null,
  update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP,
  deleted     tinyint(2) default '0'              not null
);

-- ALTER TABLE order_item ADD FOREIGN KEY (order_id) REFERENCES "ORDER"(id);
-- ALTER TABLE ORDER_ITEM ADD FOREIGN KEY (product_id) REFERENCES PRODUCT(id);

