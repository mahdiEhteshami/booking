CREATE TABLE user
(
  id int PRIMARY KEY AUTO_INCREMENT,
  username varchar(50),
  password varchar(500),
  role varchar(150),
  email varchar(100),
  firstname varchar(50),
  lastname varchar(50),
  phonenumber varchar(11)
);
CREATE UNIQUE INDEX user_username_uindex ON user (username);

create table Apartment (floorNumber integer not null, foundationMeterage float not null, hasYard bit not null, apartmentId integer not null, primary key (apartmentId));