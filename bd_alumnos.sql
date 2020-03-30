create database bd_ins;
use bd_ins;
create table maestro
(
ID int (20) auto_increment  primary key,
Nombremaestro varchar (60) not null,
Grupo varchar (60) not null,
primary key (Nombremaestro)
)engine=INNODB default charset=latin1;	

