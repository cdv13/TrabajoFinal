use cinemar;

CREATE TABLE Domicilio (
  id_Dom INT NOT NULL AUTO_INCREMENT,
  Calle varchar (100),
  Altura int (5),
  Piso int (10),
  Numero int (10),
  Departamento varchar (50),
  Provincia varchar (50),
  PRIMARY KEY (id_Dom)
);

CREATE TABLE Tipo_sala  (
  id_Tiposala INT NOT NULL AUTO_INCREMENT ,
  Tipo varchar (10),
  PRIMARY KEY (id_Tiposala)
);

CREATE TABLE Sala  (
  id_Sala INT NOT NULL AUTO_INCREMENT ,
  Numero int (5),
  Capacidad int (5),
  id_Tiposala INT NOT NULL,
  PRIMARY KEY (id_Sala),
  FOREIGN KEY (id_Tiposala) REFERENCES Tipo_Sala (id_Tiposala)
);

CREATE TABLE Pelicula (
  id_Pelicula INT NOT NULL AUTO_INCREMENT,
  Nombre varchar (50),
  Director varchar (50),
  Duracion time,
  Genero varchar (20),
  Idioma varchar (20),
  id_Sala INT NOT NULL,
  PRIMARY KEY (id_Pelicula),
  FOREIGN KEY (id_Sala) REFERENCES Sala (id_Sala)
);

CREATE TABLE Descuentos (
  id_Desc INT NOT NULL AUTO_INCREMENT ,
  Tipo float,
  PRIMARY KEY (id_Desc)
);

CREATE TABLE Rol (
  id_Rol INT NOT NULL AUTO_INCREMENT ,
  Tipo varchar (10),
  PRIMARY KEY (id_Rol)
);

CREATE TABLE Usuario (
  id_Usuario INT NOT NULL AUTO_INCREMENT ,
  Nombre varchar (10),
  Apellido varchar (10),
  DNI int (8),
  Telefono int (10),
  id_Dom INT NOT NULL,
  Email varchar (50),
  Sexo varchar (10),
  Fecha_Nacimiento date,
  id_Rol INT NOT NULL,
  Usuario varchar (8),
  Contraseña varchar (8),
  PRIMARY KEY (id_Usuario),
  FOREIGN KEY (id_Dom) REFERENCES Domicilio (id_Dom),
  FOREIGN KEY (id_Rol) REFERENCES Rol (id_Rol)
);

CREATE TABLE Butaca (
  id_Butaca INT NOT NULL AUTO_INCREMENT,
  Numeracion varchar (5),
  PRIMARY KEY (id_Butaca)
  );
  
CREATE TABLE Estado (
  id_Estado INT NOT NULL AUTO_INCREMENT ,
  Estado varchar (10),
  PRIMARY KEY (id_Estado)
);

CREATE TABLE Cartelera (
  id_Cartelera INT NOT NULL AUTO_INCREMENT ,
  id_Pelicula INT NOT NULL,
  id_Sala INT NOT NULL,
  Horario time,
  PRIMARY KEY (id_Cartelera),
  FOREIGN KEY (id_Pelicula) REFERENCES Pelicula (id_Pelicula),
  FOREIGN KEY (id_Sala) REFERENCES Sala (id_Sala)
);

CREATE TABLE Reserva (
  id_Reserva INT NOT NULL AUTO_INCREMENT ,
  Fecha date,
  precio float,
  id_Pelicula INT NOT NULL,
  id_Usuario INT NOT NULL,
  id_Sala INT NOT NULL,
  id_Butaca INT NOT NULL,
  id_Estado INT NOT NULL,
  PRIMARY KEY (id_Reserva),
  FOREIGN KEY (id_Pelicula) REFERENCES Pelicula (id_Pelicula),
  FOREIGN KEY (id_Usuario) REFERENCES Usuario (id_Usuario),
  FOREIGN KEY (id_Sala) REFERENCES Sala (id_Sala),
  FOREIGN KEY (id_Butaca) REFERENCES Butaca (id_Butaca),
  FOREIGN KEY (id_Estado) REFERENCES Estado (id_Estado)
);

CREATE TABLE Reserv_Butaca (
  id_Reserva INT NOT NULL,
  id_Butaca INT NOT NULL,
  FOREIGN KEY (id_Reserva) REFERENCES Reserva (id_Reserva),
  FOREIGN KEY (id_Butaca) REFERENCES Butaca (id_Butaca)
);

CREATE TABLE Pago (
  id_Pago INT NOT NULL AUTO_INCREMENT ,
  tipo varchar (50),
  id_Reserva INT NOT NULL,
  id_Desc INT NOT NULL,
  PRIMARY KEY (id_Pago),
  FOREIGN KEY (id_Desc) REFERENCES Descuentos (id_Desc),
  FOREIGN KEY (id_Reserva) REFERENCES Reserva (id_Reserva)
);

CREATE TABLE Cartelera  (
  id_Cartelera INT NOT NULL AUTO_INCREMENT ,
  Horario time,
  id_Pelicula INT NOT NULL,
  id_Sala INT NOT NULL,
  PRIMARY KEY (id_Cartelera),
  FOREIGN KEY (id_Pelicula) REFERENCES Pelicula (id_Pelicula),
  FOREIGN KEY (id_Sala) REFERENCES Sala (id_Sala)
);


/* Login
Tengo que realizar un consulta, capturar el usuario y contraseña y 
comparar con los almacenados en la BD, si son iguales ingresaria al sistema; 
si son diferentes arrojaria un error*/
select * from usuario as u where u.Email= 'lo que ingreso' and u.Contraseña= 'lo capturado';

/* Recuperar contraseña
Se modificaria el valor siempre y cuando corresponda al usuario 
 */
UPDATE usuario set Contraseña="nueva contraseña" where Email="lo que capturo";

/*traer todos los datos de usuaro, incluido los datos foraneos
*/
select * from usuario as u inner join domicilio as d using (id_Dom);

/*Regsitro

*/


/*Paneles de Usuario y Administrador
Consultas a realizar
*/

select * from sala;
insert into cartelera values ();
UPDATE cartelera set id_Pelicula="nueva", id_Sala="nueva", Horario= "nuevo" where id_Cartelera="actual";


select id_Sala, Numero, Capacidad, Tipo from Sala 
inner join tipo_sala using(id_Tiposala);

insert into cartelera values (null,"+idP+","+"'"+Horario+"'"+","+idSala+");

select * from reserva as r 
inner join pelicula.Nombre as p using (id_Pelicula) 
inner join usuario.Nombre as u using (id_Usuario) 
inner join sala.numero as s using (id_Sala) 
inner join  butaca.numero as b using (id_Butaca) 
inner join estado.estado as e using (id_Estado);

SELECT  * FROM reserva AS rs
INNER JOIN pelicula AS p ON rs.id_Pelicula = p.id_Pelicula
INNER JOIN usuario AS u ON rs.id_Usuario = u.id_Usuario
INNER JOIN sala AS s ON rs.id_Sala = s.id_Sala
INNER JOIN butaca AS b ON rs.id_Butaca = b.id_Butaca
INNER JOIN estado AS e ON rs.id_Estado = e.id_Estado;

UPDATE Cinemar.butaca SET id_Estado= "reservado" WHERE (id_Butaca = id_Butaca);

select id_Sala,Numero,Capacidad,Tipo from sala inner join Tipo_sala using(id_Tiposala);

select id_Cartelera, Horario, Nombre, Numero from cartelera 
inner join pelicula using(id_Pelicula)
inner join Sala using(id_Sala);