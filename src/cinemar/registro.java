package cinemar;

import java.sql.ResultSet;
import java.util.Scanner;

import Conexion.conexion;

public class registro {

	private usuario usuario;
	private conexion conn;
	
	
	public registro () {
		
		this.usuario=usuario;
		this.conn=new conexion ();
		
		Scanner c= new Scanner (System.in);
		
		System.out.println("Ingrese los datos");
		usuario u= new usuario (getId_us, getNombre, getapellido, get dni, gettelefono, 
				getid_dom, getemail, getfecha_nacimiento, getid_Rol, getusuario, getcontraseña);
		
				
		AgregarElementos(usuario);
		
		String sql;
		sql="insert into "+ tabla + "\r\n"
			+"values \r\n";
		for( int i=0;i<elementos.size()-1;i++) {
			
			sql.concat("("+"'"+elementos.get(i)+"'"+", \r\n");
		}
		sql.concat("'"+elementos.get(elementos.size())+"'"+")\r\n");
		sql.concat(";");
		stmt.executeUpdate(sql);
		
		System.out.print("valores agregados");

	}


	
	
	
}
