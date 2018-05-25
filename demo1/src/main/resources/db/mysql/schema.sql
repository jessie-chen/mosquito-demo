create table user
(
  id          bigint auto_increment
    primary key,
  name        varchar(50)                         not null,
  password    varchar(128)                        not null,
  salt        varchar(128)                        not null,
  mobile      varchar(20)                         null,
  creator     varchar(32)                         null ,
  modifier    varchar(32)                         null ,
  create_time timestamp default CURRENT_TIMESTAMP not null,
  update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP,
  deleted     tinyint(2) default '0'              not null
);

