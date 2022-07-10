package cinemar;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.List;
import java.util.Scanner;

import Conexion.conexion;

public class panelUsuario {
	private Scanner t= new Scanner (System.in);
	private conexion conn= new conexion ();
	
	private Statement stmt;
	private String sql;
	
	public panelUsuario () throws SQLException {
		System.out.println("-------MENU---------");
		System.out.println("1_. Crear Reserva");
		System.out.println("2_. Modificar Reserva");
		System.out.println("3_. Ver Historial");
		System.out.println("4_. Ver Reserva");
		
		
		int op=t.nextInt();
		
		
		switch (op) {
		case 1:
			crearReserva ();
			break;
		
		case 2:
			modifReserv ();
			break;

		case 3:
			verHistorial ();
			break;
		
		case 4:
			verReserva ();
			break;
					
		default:
			break;
		}
	}
	
	
	public void crearReserva() throws SQLException {
		
		System.out.println("--CREAR RESERVA--");
		int id_Cartelera=0;
		int id_Pelicula=0;
		int id_Sala=0;
		int horario=0;
		int id_Reserva=0;
		
		String sql="select id_Cartelera,Horario, Nombre, Numero from cartelera inner join pelicula \n"
				+ "using(id_Pelicula) inner join sala using(id_Sala);";
		
		
		ResultSet r=conn.devolverConsulta(sql);
		
		System.out.println("id_Cartelera |\t Hora|\t Pelicuala|\t Numero de sala|\t");
		
		while(r.next()) {
			
			System.out.print(r.getInt("id_Cartelera")+"\t");
			System.out.print(r.getString("Hora")+"\t");
			System.out.print(r.getString("Nombre")+"\t");
			System.out.print(r.getString("Numero")+"\t");
			
		}
		
		System.out.println("seleccione el id de la Cartelera elegida");
		
		id_Cartelera=t.nextInt();
		reserva u= new reserva();
		
		//agrego una reserva 
		String add="insert into reserva values (null,"+u.getFecha()+","+u.getPrecio()+","
		+u.getPelicula()+","+u.getUsuario()+","+u.getSala()+","+u.getButaca()+","
		+u.getEstado()+");";
		
		conn.EjecutarConsulta(add);
		
		System.out.println("Ingrese la cantidad de entradas que desea reservar");
		int cant=t.nextInt();

		//traigo la reserva
		r=conn.devolverConsulta("select Max(id_Reserva) as max from reserva where id_Usuario="+u.getUsuario()+";");
		id_Reserva= r.getInt("max");
		
		
		
		
		r=conn.devolverConsulta("select id_Sala from cartelera where id_Cartelera="+id_Cartelera+";");
		if(r.next()) {
		id_Sala=r.getInt("id_Sala");
		}
		
		for(int i=1;i<=cant;i++) {
		r=conn.devolverConsulta("select id_Butaca,Nombre from butaca where id_Sala="+id_Sala+" and id_Estado=1;");
		
		System.out.println(" id_Butaca|\t Fila|\t Numero|\t");
		while(r.next()) {
			System.out.print(r.getInt("id_Butaca")+"\t");
			System.out.print(r.getString("Fila"));
			System.out.print(r.getString("Numero"));
		}
		System.out.println("Ingrese el id de la butaca");
		int id_Butaca=t.nextInt();
		
		
	}
	}
	
	public void modifReserv() {
		
	}
		
	public void verHistorial() {
		
	}
	
	public void verReserva() throws SQLException {
		String sql= "select * from reserva;";
		ResultSet rs= conn.devolverConsulta(sql);
		
		System.out.println("id_Reserva\t Fecha\t Precio\t id_Pelicula"
				+ "\t id_Usuario\t id_Sala\t id_Butaca\t id_Estado");
				
		while (rs.next()) {
			System.out.println(rs.getInt("id_Reserva") +"\t"+"\t"+ rs.getInt("Fecha") +"\t"+"\t"
		+ rs.getInt("precio") +"\t"+"\t"+ rs.getInt("id_Pelicula") +"\t"+"\t"+ rs.getInt("id_Usuario")
		+"\t"+"\t"+ rs.getInt("id_Sala") +"\t"+"\t"+ rs.getInt("id_Butaca") +"\t"+"\t"+ rs.getInt("id_Estado"));
		}
	}
	
	}
