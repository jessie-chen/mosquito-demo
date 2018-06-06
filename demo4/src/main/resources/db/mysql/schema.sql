create table user
(
  id          bigint auto_increment               primary key,
  name        varchar(50)                         not null,
  password    varchar(128)                        not null,
  salt        varchar(128)                        not null,
  mobile      varchar(20)                         null
);

