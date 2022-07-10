package cinemar;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Conexion.conexion;

/*
 * Esta clase me permite ingresar nuevos usuarios
 */

public class registro  {
	Connection conn;
	Statement stmt;
	String sql;	
	
	public registro () {
		conexion conn=new conexion();
	}
	
	public void crearDomicilio (domicilio domicilio){
					
		try {
			stmt=conn.createStatement();
			sql= "INSERT INTO cinemar.domicilio"
					+ "(id_Dom, Calle, Altura, piso, numero, Departamento, Provincia) "
					+ "	VALUES ('','" 
					+ domicilio.getCalle()+ "','"
					+ domicilio.getAltura() + "','"
					+ domicilio.getPiso() + "','"
					+ domicilio.getNumero() + "','"
					+ domicilio.getDeparamento() + "','"
					+ domicilio.getProvincia()+ "');'";	
			
			stmt.executeUpdate(sql);
			System.out.println("domicilio registrado");	
			
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error al registrar");
		}
					
		
		
	}
	
	public void crearUsuario(usuario usuario)  {
		try {
			stmt=conn.createStatement();		
			sql= "INSERT INTO cinemar.usuario"
					+ "(Nombre, Apellido, DNI, Telefono, Email, id_Dom, Sexo, Fecha_Nacimiento, id_Rol, Usuario, Contraseña)"
					+ "	VALUES ('"
					+ usuario.getNombre() + "','"
					+ usuario.getApellido()  + "','"
					+ usuario.getDni()  + ","
					+ usuario.getTelefono() + "','"
					+ usuario.getEmail()  + "','"
					+ usuario.getId_dom().getId_Dom()  + "','"
					+ usuario.getSexo()  + "','"
					+ usuario.getFecha_nacimiento()  + "','"
					+ usuario.getId_rol().getId_rol() + "','"
					+ usuario.getUsuario() + "','"
					+ usuario.getContraseña() + "');";
			
			stmt.executeUpdate(sql);
			System.out.println("Usuario registrado");	
			
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error al registrar");
		}
					

	}

}

		