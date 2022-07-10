package cinemar;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;
import Conexion.conexion;
/*
 * Con esta clase podemos acceder a la pagina y su menu inicial.
 */


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
			if(rs.getInt("id_Rol")==1) {
				System.out.println("Menu Cliente");
				panelUsuario pu=new panelUsuario();
			}else {
				System.out.println("Menu Administrador");
				panelAdmin pa= new panelAdmin();
			}
		} else {
			System.out.println("Usuario o Contraseña incorrectos");
			//poner metodo recuperar contraseña
		}
			
	
	}
}
