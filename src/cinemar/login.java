package cinemar;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;
import Conexion.conexion;



public class login {
	private String usuario;
	private String contraseña;
	private conexion conn;
	
	public login() throws SQLException {
		System.out.println("Ingrese Nombre de Usuario");
		Scanner teclado = new Scanner(System.in);
		this.usuario = teclado.nextLine();

		System.out.println("Ingrese Contraseña");
		Scanner teclado1 = new Scanner(System.in);
		this.contraseña = teclado1.nextLine();
		
		this.conn=new conexion ();
		String sql = "select * from usuario as u where u.usuario= " + "'" + usuario + "'" + " and u.Contraseña= " + "'"
				+ contraseña + "'" + " ;";
		ResultSet rs = conn.devolverConsulta(sql);

		if (rs.next()) {
			System.out.println("BIENVENIDO");
		} else {
			System.out.println("Usuario o Contraseña incorrectos");
		}
			
		
		
		/*
		 //Statement stmt =null;
		//Connection conn=null;
		try {
			stmt=conn.createStatement();
			String sql;
			sql="select * from usuario as u where u.usuario= "+ "'" + usuario +"'"+ "and u.Contraseña= " + "'"+ contraseña + "'"+ ";";
			stmt.executeUpdate(sql);
			stmt.close();
			
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("BIENVENIDO");
			}
			*/			
				
	}
}
