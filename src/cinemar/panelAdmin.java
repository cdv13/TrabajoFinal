package cinemar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import Conexion.conexion;

public class panelAdmin {
	Scanner t= new Scanner (System.in);
	conexion conn= new conexion ();
	Statement stmt;
	
	public panelAdmin() throws SQLException {
		System.out.println("--------MENU---------");
		System.out.println("1_. Ver listado de Salas");
		System.out.println("2_. Crear Cartelera");
		System.out.println("3_. Modificar Cartelera");
		System.out.println("3_. Eliminar Sala");
		System.out.println("5_. Modificar descuentos");
		System.out.println("6_. Ver reservas");
		
		
		int op=t.nextInt();
		
				
		switch (op) {
		case 1:
			verSala();
			break;
		
		case 2:
			crearCartelera ();
			break;

		case 3:
			modifCartelera ();
			break;
		
		case 4:
			eliminarSala ();
			break;
		
		case 5:
			modifDesc ();
		break;
		
		case 6:
			verReserva ();
		break;
		
		default:
			break;
		}
	}
	
	
	public void verSala() throws SQLException {
		String sql= "select * from sala;";
		ResultSet rs= conn.devolverConsulta(sql);
		
		System.out.println("id_Sala\t Numero\t Capacidad\t id_Tiposala");
				
		while (rs.next()) {
			System.out.println(rs.getInt("id_Sala") +"\t"+"\t"+ rs.getInt("Numero") +"\t"+"\t"+ rs.getInt("Capacidad") +"\t"+"\t"+ rs.getInt("id_Tiposala"));
		}
	}
	
	public void crearCartelera() throws SQLException {
		
		int id_Sala=0;
		int id_Pelicula=0;
		int Horario=0;
		
		System.out.println("Crear una cartelera");
		
		System.out.println("Seleccione la sala");
		
		ResultSet r=conn.devolverConsulta("select id_Sala,Numero,Capacidad,Tipo from sala inner join Tipo_sala using(id_Tiposala);");
		
		System.out.println("id_Sala|\t Numero|\t Capacidad|\t Tipo\t");
		
		while(r.next()) {
			System.out.print("\t"+ r.getInt("id_Sala"));
			System.out.print("\t"+ r.getString("Numero"));
			System.out.print("\t"+ r.getString("Capacidad"));
			System.out.print("\t"+ r.getString("Tipo"));
			System.out.println("\t"+ r.getString("\n"));
		    }
		
		System.out.println("Ingrese el id de la sala");
		id_Sala=t.nextInt();
		
		
		System.out.println("Seleccione la pelicula");
		r=conn.devolverConsulta("select * from Pelicula;");
		System.out.println("id_Pelicula|\t Nombre|\t Director|\t Duracion|\t Genero |\t Idioma");
		
		while(r.next()) {

			System.out.print(r.getInt("id_Pelicula")+"\t");
			System.out.print(r.getString("Nombre")+"\t");
			System.out.print(r.getString("Director")+"\t");
			System.out.print(r.getInt("Duracion")+"\t");
			System.out.print(r.getString("Genero")+"\t");
			System.out.print(r.getString("Idioma")+"\t");
			
		}
		System.out.println("selecciona el id de la pelicula");
		id_Pelicula=t.nextInt();
		
		System.out.println("Ingrese el horario");
		Horario=t.nextInt();
		
		String sql="insert into cartelera values (null,"+id_Pelicula+","+"'"+id_Sala+"'"+","+Horario+");";
		conn.EjecutarConsulta(sql);
		
		System.out.println("Cartelera creada con exito");		
	}
	
	public void modifCartelera() throws SQLException {
		int id_Cartelera=0;
		int idP=0;
		String sql="select id_Cartelera,Nombre,id_Sala,Horario from cartelera inner\n"
				+ "join pelicula using(id_Pelicula);";
		
		ResultSet r=conn.devolverConsulta(sql);
		System.out.println("id|\t Nombre Pelicula|t sala|\t Horario");
		
		while(r.next()) {
			
			System.out.println(r.getInt("id_Cartelera")+"\t");
			System.out.println(r.getString("Nombre")+"\t");
			System.out.println(r.getString("Horario")+"\t");
			System.out.println(r.getInt("id_Sala")+"\t");
		}
		
		System.out.println("Seleccione el id de la Cartlera a modificar");
		id_Cartelera=t.nextInt();
		
		System.out.print("Seleccione la pelicula nueva");
		
		r=conn.devolverConsulta("select * from pelicula;");
		System.out.println("id_Pelicula|\t Nombre|\t Director|\t Duracion|\t Genero |\t Idioma");
		
		while(r.next()) {
			
			System.out.print(r.getInt("id_Pelicula")+"\t");
			System.out.print(r.getString("Nombre")+"\t");
			System.out.print(r.getString("Director")+"\t");
			System.out.print(r.getInt("Duracion")+"\t");
			System.out.print(r.getString("Genero")+"\t");
			System.out.print(r.getString("Idioma")+"\t");
			
		}
		System.out.println("Ingrese el id de la nueva Pelicula");
		idP=t.nextInt();
		
		
		sql="UPDATE `cinemar`.`cartelera` SET `id_Pelicula` = "+idP +" WHERE (`id_Cartelera` = "+id_Cartelera+");";
		conn.EjecutarConsulta(sql);
		
		System.out.print("Cartelera actualizada");
		
		
	}
	
	public void eliminarSala() throws SQLException {
		int id_C=0;
		int confirm=0;
		String sql="select id_Cartelera,Nombre,id_Sala,Horario from cartelera inner\n"
				+ "join pelicula using(id_Pelicula);";
		
		ResultSet r=conn.devolverConsulta(sql);
		System.out.println("id|\t Nombre Pelicula|t sala|\t Horario");
		
		while(r.next()) {
			
			System.out.println(r.getInt("id_Cartelera")+"\t");
			System.out.println(r.getString("Nombre")+"\t");
			System.out.println(r.getString("Horario")+"\t");
			System.out.println(r.getInt("id_Sala")+"\t");
		}
		
		System.out.println("Seleccione el id de la Cartlera a modificar");
		id_C=t.nextInt();
	
		System.out.println("Esta seguro de eliminar 1-SI 0-NO");
		confirm=t.nextInt();
		
		if(confirm==1) {
			sql="delete from cartelera where id_Cartelera="+id_C+";";
			conn.EjecutarConsulta(sql);
			System.out.print("Cartelera eliminada con exito");
		}	
		
	}

	public void modifDesc() {
			
	}
	
	public void verReserva() {
		
		
	}
}
