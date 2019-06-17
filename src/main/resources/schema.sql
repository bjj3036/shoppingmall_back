use web02shoppingmall;

drop table if exists user;
drop table if exists product;
drop table if exists company;

create table user
(
  id           bigint primary key auto_increment,
  account      varchar(100) not null unique,
  password     varchar(100) not null,
  username     varchar(30)  not null,
  phone_number varchar(30)  not null,
  zip_code     varchar(10)  not null,
  address      varchar(100) not null,
  email        varchar(50)  not null unique,
  created      datetime default current_timestamp,
  updated      datetime default current_timestamp on update current_timestamp
) engine = InnoDB
  default charset = utf8;

create table product
(
  id              bigint primary key auto_increment,
  product_name    varchar(100) not null,
  product_content varchar(255) not null,
  category        bigint       not null,
  price           int unsigned not null,
  company         bigint       not null,
  created         datetime default current_timestamp,
  updated         datetime default current_timestamp on update current_timestamp
) engine = InnoDB
  default charset = utf8mb4;

create table company
(
  id           bigint primary key auto_increment,
  company_name varchar(100) not null,
  created      datetime default current_timestamp,
  updated      datetime default current_timestamp on update current_timestamp
) engine = InnoDB
  default charset = utf8mb4;

create table category
(
  id            bigint primary key auto_increment,
  category_name varchar(100) not null
) engine = InnoDB
  default charset = utf8mb4;

create table mileage
(
  user  bigint not null,
  point int default 0
) engine = InnoDB
  default charset = utf8mb4;