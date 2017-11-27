CREATE DATABASE IF NOT EXISTS ums_db DEFAULT CHARSET utf8;
USE ums_db;
create table user(
 id bigint auto_increment not null,
 username varchar(64),
 name varchar(32),
 balance decimal(10,2),
 primary key(id)
);
insert into user(username,name,balance)
values('iTeller_zc','张超',1000),
('tracy','崔西',1000),
('smile','微笑',200);