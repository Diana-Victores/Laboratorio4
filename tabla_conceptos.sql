create database PlanillaConceptos;
use Planillaconceptos;
create table concepto
(
codigo_concepto varchar(5) primary key,
nombre_concepto varchar(60),
efecto_concepto varchar(1),
estatusconcepto varchar(1)
)engine=innodb;


CREATE TABLE planillaconceptos.nominad (
  codigo_nomina INT NOT NULL,
  codigo_empleado1 VARCHAR(45) NULL,
codigo_concepto VARCHAR(45) NULL,
  valor_nominad VARCHAR(45) NULL,
  nominadcol VARCHAR(45) NULL,
 
  PRIMARY KEY (codigo_nomina));



CREATE TABLE planillaconceptos.empleado (
Codigo_empleado1 INT NOT NULL,
  Nombre_empleado VARCHAR(45) NOT NULL,
  codigo_puesto VARCHAR(45) NOT NULL,
  codigo_departamento1 VARCHAR(45) NOT NULL,
  sueldoempleado FLOAT NOT NULL,
  statusempleado VARCHAR(45) NOT NULL,
  PRIMARY KEY (Codigo_empleado1));


CREATE TABLE planillaconceptos.puesto (
  codigo_puesto INT NOT NULL,
nombre_departamento VARCHAR(45) NOT NULL,
  estatus_departamento VARCHAR(45) NOT NULL,
  PRIMARY KEY (`codigo_puesto`));



CREATE TABLE planillaconceptos.departamento (
  codigo_departamento1 INT NOT NULL,
  nombre_departamento VARCHAR(45) NOT NULL,
  estatus_departamento VARCHAR(45) NOT NULL,
  PRIMARY KEY (codigo_departamento1));


CREATE TABLE planillaconcepto.nominae (
  codigo_nomina INT NOT NULL,
  fecha_inicial DATE NOT NULL,
  fecha_final DATE NOT NULL,
  PRIMARY KEY (codigo_nomina));






	