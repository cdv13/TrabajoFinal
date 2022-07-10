package test;

import java.sql.Date;
import java.sql.SQLException;

import Conexion.conexion;
import cinemar.Rol;
import cinemar.domicilio;
import cinemar.login;
import cinemar.registro;
import cinemar.usuario;


public class test {

	public static void main(String[] args) throws SQLException {
		//1 probando funcion conexion
		conexion c= new conexion ();
		
		//2 probando funcion Login
		login l= new login ();
		
		//3 Probando Registro
		
		//obtener domicilio
		/*registro r= new registro();
		
		domicilio d= new domicilio("Jujuy", 457, null, null, "Capital", "Salta");
		r.crearDomicilio(d);
		
		usuario u1= new usuario ("Luis", "Martinez", 235687, 387459862, "lllp@correo.com", d,  "Masculino", 1974-02-23, 1, "llpz", "454545");
		r.crearUsuario(u1);
		*/	
							
	}

}
