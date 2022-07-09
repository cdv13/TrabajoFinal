package cinemar;

import java.util.Scanner;

public class panelUsuario {

	public panelUsuario (usuario u) {
		System.out.println("-------MENU---------");
		System.out.println("1_.Crear Reserva");
		System.out.println("2_.Modificar Reserva");
		System.out.println("3_.Observar Reservas");
		System.out.println("4_.Ver Historial");
		
		Scanner t= new Scanner (System.in);
		int op=t.nextInt();
		
		String sql="";
	}
}
