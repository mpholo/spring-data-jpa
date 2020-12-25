create table person(
 id  integer not null,
 name varchar(355) not null,
 location varchar(255),
 birth_date timestamp,
 primary key(id)
 );

 insert into person(id,name,location,birth_date) values(10001,'Mpholo ','Kempton Park',sysdate());
 insert into person(id,name,location,birth_date) values(10002,'Kenalemang ','Centurion',sysdate());
 insert into person(id,name,location,birth_date) values(10003,'Boitumelo ','Stilfontein',sysdate());