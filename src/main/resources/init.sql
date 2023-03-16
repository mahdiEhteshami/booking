create table estate
(
  id                 int auto_increment
    primary key,
  city               varchar(255) null,
  country            varchar(255) null,
  county             varchar(255) null,
  details            varchar(255) null,
  district           varchar(255) null,
  latitude           double       not null,
  longtitude         double       not null,
  state              varchar(255) null,
  estateAttributes   varchar(255) null,
  meterage           float        not null,
  propertyNature     int          null,
  version            int          not null,
  estate_type        varchar(31)  not null,
  hasFence           bit          null,
  foundationMeterage float        null,
  isFloor            bit          null,
  rightOfBusiness    bit          null,
  floorNumber        int          null,
  hasYard            bit          null,
  numberOfFloors     int          null,
  unitNumber         int          null,
  unitPerFloor       int          null,
  hasVilla           bit          null
)
  engine = MyISAM;

create table possessionrequest
(
  request_type  varchar(31)  not null,
  id            int auto_increment
    primary key,
  chatEnable    bit          not null,
  description   varchar(255) null,
  phoneNumber   varchar(255) null,
  title         varchar(255) null,
  version       int          not null,
  cost          float        null,
  valuePerMeter float        null,
  deposit       float        null,
  rentFee       float        null,
  rentType      int          null,
  estate_id     int          null,
  owner_id      int          null
)
  engine = MyISAM;

create index FKaxbd4epd09wdffqba3ee5n9gl
  on possessionrequest (estate_id);

create index FKbcr06jewx5b9h18bi5ygvvqs7
  on possessionrequest (owner_id);

create table user
(
  id          int auto_increment
    primary key,
  email       varchar(255) null,
  firstname   varchar(255) null,
  lastname    varchar(255) null,
  password    varchar(255) null,
  phoneNumber varchar(255) null,
  role        varchar(255) null,
  username    varchar(255) null
)
  engine = MyISAM;

CREATE UNIQUE INDEX user_username_uindex ON user (username);
