DROP DATABASE IF EXISTS GYMOLYMPUS; 
CREATE DATABASE GYMOLYMPUS;
#SHOW DATABASES;
USE GYMOLYMPUS;
#SHOW TABLES;

CREATE TABLE Usuarios(
    Usuario         varchar(20)      NOT NULL   PRIMARY KEY,
    password    varchar(32)      NOT NULL,
    Rol             char(2)          NOT NULL
);

INSERT INTO Usuarios(Usuario, password, Rol)
VALUES
('admin', MD5('12345'), '00'),
('empleado',     MD5('12345'), '01');



CREATE TABLE CLIENTE(
ID_CLIENTE                 	INT(8) AUTO_INCREMENT NOT NULL,  
NOMBRE                      VARCHAR(30)         NOT NULL,
APELLIDO_PA                 VARCHAR(20)         NOT NULL,
APELLIDO_MA                 VARCHAR(20)         NOT NULL,
TELEFONO                    VARCHAR(10)            NULL,
DIRECCION                   VARCHAR(50)         NULL,
MONTO                       FLOAT(6,2)          NOT NULL,
FECHA_DE_INGRESO          DATE                NULL,
TIPOC						VARCHAR (2)			NOT NULL,
PRIMARY KEY (ID_CLIENTE));
#CREATE OR REPLACE VIEW CLIENTES AS SELECT * FROM CLIENTE;

CREATE TABLE ASISTENCIA(
ID_ASISTENCIA INT ZEROFILL AUTO_INCREMENT NOT NULL PRIMARY KEY,
ID_CLIENTE INT(8) NOT NULL,
FECHA_ASISTENCIA DATE NOT NULL,
ASISTENCIA BOOLEAN NOT NULL,
FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTE (ID_CLIENTE));


CREATE TABLE LOCKER( 
ID_LOCKER               INT(4)   	NOT NULL,
ID_CLIENTE              INT(4)     	NOT NULL,
FECHA_DE_INICIO         DATE        NOT NULL,
FECHA_FINAL             CHAR(10)    NOT NULL,
MONTO                   FLOAT(6,2)  NOT NULL,
PRIMARY KEY (ID_LOCKER),
FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTE (ID_CLIENTE));

#CREATE OR REPLACE VIEW RENTALOCKERS AS SELECT * FROM LOCKER;
#ALTER TABLE LOCKERS  ADD FOREIGN KEY (ID_LOCKER) REFERENCES CLIENTE (ID_CLIENTE);

CREATE TABLE MEMBRECIA(
ID_MEMBRECIA        INT(5)  AUTO_INCREMENT NOT NULL,
ID_CLIENTE      	INT(4) 		 NOT NULL,
TIPOC           VARCHAR(2)      NULL,
FECHA_INICIAL   DATE            NULL,
FECHA_FINAL     DATE            NULL,
TIPO_DE_MEMBRECIA    VARCHAR(10)     NULL,
MONTO           FLOAT     NOT NULL,
PRIMARY KEY (ID_MEMBRECIA));

ALTER TABLE MEMBRECIA ADD FOREIGN KEY (ID_CLIENTE)
REFERENCES CLIENTE (ID_CLIENTE);

CREATE TABLE PAGOS(
ID_PAGO FLOAT NOT NULL AUTO_INCREMENT,
ID_CLIENTE INT(4) 		 NOT NULL,
ID_MEMBRECIA INT(6)      NOT NULL,
MONTO FLOAT NULL,
FECHA DATE NOT NULL,

PRIMARY KEY (ID_PAGO));
ALTER TABLE PAGOS ADD FOREIGN KEY (ID_CLIENTE)
REFERENCES CLIENTE (ID_CLIENTE);

ALTER TABLE PAGOS ADD FOREIGN KEY (ID_MEMBRECIA)
REFERENCES MEMBRECIA (ID_MEMBRECIA);


INSERT INTO PAGOS(ID_PAGO, ID_CLIENTE, ID_MEMBRECIA, MONTO, FECHA)
VALUES (ID_PAGO,'1','1',200,CURDATE());
#INSERT INTO USUARIO(USUARIOID,PASSWORD,NIVEL)
#VALUES('ADMIN','12345','ADMINISTRADOR');
/*
INSERT INTO USUARIOS (ID_USUARIOS,NOMBRE,APELLIDO_PA,APELLIDO_MA,TELEFONO,DIRECCION,CARGO)
VALUES (01,'LINOSA EDUARDO','GONZALEZ','MARTINEZ',7751026961,'FRACCIONAMIENTO DEL BILLAR','ADMINISTRADOR'),
(02,'LINO EDUARDOSS','GONZALEZ','MARTINEZ',7751026961,'FRACCIONAMIENTO DEL BILLAR','ADMINISTRADOR'),
(03,'LINASA EDUARDO','GONZALEZ','MARTINEZ',7751026961,'FRACCIONAMIENTO DEL BILLAR','ADMINISTRADOR'),
(04,'LINOSI EDUARDO','GONZALEZ','MARTINEZ',7751026961,'FRACCIONAMIENTO DEL BILLAR','RECEPCIONISTA'),
(05,'LUISA','PERALTA','VERA',7751084312,'CALLE ALAMEDA COL.ROJO GOMEZ','RECEPCIONISTA');
*/
INSERT INTO CLIENTE(ID_CLIENTE, NOMBRE, APELLIDO_PA, APELLIDO_MA, DIRECCION,TELEFONO, MONTO, FECHA_DE_INGRESO,TIPOC)
VALUES (ID_CLIENTE,'AARON','CORREA','PEREZ',NULL,7751121020,180,CURDATE(),'E'),
(ID_CLIENTE,'DULCE MARIA',' MORENO',' GARCIA',NULL,7751121021,200,CURDATE(),'CN'),
(ID_CLIENTE,'GUSTAVO','VERA',' OLVERA',NULL,7751131020,180,CURDATE(),'CN'),
(ID_CLIENTE,'DAVID OCTAVIO','PERALTA','HDEZ',NULL,7751421020,180,CURDATE(),'CN'),
(ID_CLIENTE,'ALAN','LOPEZ','MUÑOS',NULL,7751521632,200,CURDATE(),'CN'), 
(ID_CLIENTE,'VIANEY','CORTEZ','MARQUEZ',NULL,7751521632,200,CURDATE(),'CN'), 
(ID_CLIENTE,'CINDY','CASTRO','MENDEZ',NULL,7751521632,200,CURDATE(),'CN'), 
(ID_CLIENTE,'ARTURO','SANCHEZ','LOPEZ',NULL,7751521632,200,CURDATE(),'CN'), 
(ID_CLIENTE,'ROBERTO','CISNEROS','CRUZ',NULL,7751521632,200,CURDATE(),'CN'), 
(ID_CLIENTE,'CAMILA','CAZAREZ','MARTINEZ',NULL,7751521632,200,CURDATE(),'CN'), 
(ID_CLIENTE,'ALFREDO','SALINAS','RAMIREZ',NULL,7751521632,200,CURDATE(),'CN'), 
(ID_CLIENTE,'Briceyda','Angeles','Perez',NULL,771152846,200,CURDATE(),'E');


 INSERT INTO LOCKER (ID_LOCKER,ID_CLIENTE,FECHA_DE_INICIO,FECHA_FINAL,MONTO)
 VALUES (1,'01',CURDATE(),'2017/09/16','100'),
 (2,'02',CURDATE(),'2017/09/16','100'),
 (3,'03',CURDATE(),'2017/09/16','100'),
 (4,'04',CURDATE(),'2017/09/16','100'),
 (5,'05',CURDATE(),'2017/09/16','100'),
 (6,'06',CURDATE(),'2017/09/16','100'),
 (7,'07',CURDATE(),'2017/09/16','100'),
 (8,'08',CURDATE(),'2017/09/16','100'),
 (9,'09',CURDATE(),'2017/09/16','100'),
 (10,'10',CURDATE(),'2017/09/16','100'),
 (11,'11',CURDATE(),'2017/09/16','100'),
 (12,'12',CURDATE(),'2017/09/16','100');

 
 INSERT INTO MEMBRECIA(ID_MEMBRECIA,ID_CLIENTE,TIPOC, FECHA_INICIAL,FECHA_FINAL,TIPO_DE_MEMBRECIA,MONTO)
 VALUES
 (ID_MEMBRECIA,1,'CN',CURDATE(),'2017/08/13','MENSUAL','200'),
 (ID_MEMBRECIA,2,'E',CURDATE(),'2017/08/13','MENSUAL','30'),
 (ID_MEMBRECIA,3,'CN',CURDATE(),'2017/09/13','VISITA','30'),
 (ID_MEMBRECIA,4,'CN',CURDATE(),'2017/08/02','VISITA','20'),
 (ID_MEMBRECIA,5,'E',CURDATE(),'2017/08/02','MENSUAL','180'),
 (ID_MEMBRECIA,6,'CN',CURDATE(),'2017/08/13','MENSUAL','200'),
 (ID_MEMBRECIA,7,'E',CURDATE(),'2017/08/13','MENSUAL','200'),
 (ID_MEMBRECIA,8,'CN',CURDATE(),'2017/09/13','VISITA','30'),
 (ID_MEMBRECIA,9,'CN',CURDATE(),'2017/08/02','VISITA','20'),
 (ID_MEMBRECIA,10,'CN',CURDATE(),'2017/09/13','VISITA','30'),
 (ID_MEMBRECIA,11,'CN',CURDATE(),'2017/08/02','VISITA','20'),
 (ID_MEMBRECIA,12,'E',CURDATE(),'2017/08/02','MENSUAL','180');
 
 INSERT INTO ASISTENCIA VALUES 
(ID_ASISTENCIA, 1, '2017/08/16',true),
(ID_ASISTENCIA, 1, '2017/08/15',true),
(ID_ASISTENCIA, 1, '2017/08/14',true),
(ID_ASISTENCIA, 1, '2017/08/13',true),
(ID_ASISTENCIA, 1, '2017/08/12',true),
(ID_ASISTENCIA, 1, '2017/08/11',true);
/*

 SELECT concat(CLIENTE.NOMBRE,' ',CLIENTE.APELLIDO_PA) AS NOMBRE_CLIENTE,membrecia.TIPOC, membrecia.FECHA_INICIAL,membrecia.FECHA_FINAL,membrecia.TIPO_DE_MEMBRECIA,membrecia.MONTO
 FROM MEMBRECIA INNER JOIN CLIENTE ON MEMBRECIA.ID_CLIENTE = CLIENTE.ID_CLIENTE;
 
 
 

CREATE OR REPLACE VIEW `Vista1` AS        
SELECT CLIENTE.ID_CLIENTE,CLIENTE.NOMBRE,CLIENTE.APELLIDO_PA,CLIENTE.APELLIDO_MA
FROM CLIENTE;

CREATE OR REPLACE VIEW `Vista3` AS        
SELECT MEMBRECIA.ID_MEMBRECIA,MEMBRECIA.ID_CLIENTE,MEMBRECIA.TIPOC,FECHA_INICIAL,MEMBRECIA.TIPO_DE_MEMBRECIA
FROM MEMBRECIA
WHERE TIPO_DE_MEMBRECIA LIKE '%CN%';

CREATE OR REPLACE VIEW `Vista4` AS
SELECT CLIENTE.ID_CLIENTE,CLIENTE.NOMBRE,CLIENTE.APELLIDO_PA,CLIENTE.APELLIDO_MA
FROM CLIENTE
WHERE ID_CLIENTE LIKE '%A%' ORDER BY ID_CLIENTE desc;

use gymolympus;
select * from usuario;

describe usuario;
drop procedure if exists agregar_usuariod;
delimiter //

create procedure agregar_usuariod(in usuario varchar(10), passwordd varchar(50), niveld varchar(15))
begin 
insert into usuario(USUARIOID, PASSWORD, NIVEL) VALUES(usuario, passwordd, niveld);
end
//


call agregar_usuariod(12,2468,'Instructor');

use gymolympus;
select * from usuario;

describe usuarios;
delimiter //
create procedure agregar_usuariop(in nombren varchar(30), in apellidop varchar(20), in apellidom varchar(20))
begin
insert into usuarios(NOMBRE, APELLIDO_PA, APELLIDO_MA) VALUES(nombren, apellidop, apellidom);
end
//

call agregar_usuariop('gabriela','garcia','perez')



use gymolympus;
select * from membrecia;

describe membrecia;
drop procedure if exists agregar_membreciap;
delimiter //
create procedure agregar_membreciap(in idcli int(4), tipocli varchar(2), in fecha_ini date, in fecha_fin date, tipom varchar(10), monto float(6,2))
begin
insert into membrecia(ID_CLIENTE, TIPOC, FECHA_INICIAL, FECHA_FINAL, TIPO_DE_MEMBRECIA, MONTO) VALUES(idcli, tipocli, fecha_ini, fecha_fin, tipom, monto);
end
//

call agregar_membreciap(4, 'E','2017-05-10','2017-06-10','MENSUAL',200);

use gymolympus;
select * from locker;

describe locker;
drop procedure if exists agregar_locker;
delimiter //
create procedure agregar_locker(in idlock int(4), idcli int(4), fecha_ini date, in fecha_fin date, in montos float(6,2))
begin
insert into locker(ID_LOCKER, ID_CLIENTE, FECHA_DE_INICIO, FECHA_FINAL, MONTO) VALUES(idlock, idcli, fecha_ini, fecha_fin, montos);
end
//


call agregar_locker(6,6,'2017-03-10','2017-04-10',180);

use gymolympus;
select * from cliente;

describe cliente;
delimiter //
create procedure agregar_clientep(in nombren varchar(30), in apellidop varchar(20), in apellidom varchar(20), montos float(6,2), tipocli varchar(2))
begin
insert into cliente(NOMBRE, APELLIDO_PA, APELLIDO_MA, MONTO, TIPOC) VALUES(nombren, apellidop, apellidom, montos, tipocli);
end
//
delimiter ;
 SHOW CREATE PROCEDURE agregar_clientep;

call agregar_clientep('Briceyda',' Angeles','Perez',180,'E');

 show procedure status like 'agregar_clientep';
Use GYMOLYMPUS;
CREATE TABLE Respaldo_usuarios(
ID_USUARIOS                     CHAR(5)         NOT NULL,
NOMBRE                          VARCHAR(30)     NOT NULL,
APELLIDO_PA                     VARCHAR (20)    NOT NULL,
APELLIDO_MA                     VARCHAR (20)    NOT NULL,
TELEFONO                        CHAR(10)        NULL,
DIRECCION                       VARCHAR(50)     NULL,
CARGO                           VARCHAR(20)     NULL,
PRIMARY KEY (ID_USUARIOS));

delimiter //
CREATE TRIGGER  Respaldo_usuarios
AFTER INSERT
ON usuarios FOR EACH ROW
BEGIN
INSERT INTO USUARIOS 
VALUES((ID_USUARIOS,NOMBRE,APELLIDO_PA,APELLIDO_MA,TELEFONO,DIRECCION,CARGO));
END
//
DELIMITER ;


CREATE TABLE Respaldo_CLIENTES(
ID_CLIENTE                 	INT(8) AUTO_INCREMENT NOT NULL,  
NOMBRE                      VARCHAR(30)         NOT NULL,
APELLIDO_PA                 VARCHAR(20)         NOT NULL,
APELLIDO_MA                 VARCHAR(20)         NOT NULL,
TELEFONO                    VARCHAR(10)            NULL,
DIRECCION                   VARCHAR(50)         NULL,
MONTO                       FLOAT(6,2)          NOT NULL,
FECHA_DE_INGRESO          DATE                NULL,
TIPOC						VARCHAR (2)			NOT NULL,
PRIMARY KEY (ID_CLIENTE));


	

delimiter //
CREATE TRIGGER  Respaldo_CLIENTES
AFTER INSERT
ON CLIENTE FOR EACH ROW
BEGIN
INSERT INTO CLIENTE
VALUES();
END
//
DELIMITER ;

use GYMOLYMPUS;
ALTER TABLE MEMBRECIA ADD INDEX (ID_CLIENTE);

delimiter //
 */