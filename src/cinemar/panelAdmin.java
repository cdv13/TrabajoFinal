package cinemar;

import java.util.Scanner;

public class panelAdmin {

	public panelAdmin(usuario u) {
		System.out.println("--------MENU---------");
		System.out.println("1_.Crear Sala");
		System.out.println("2_.Modificar Sala");
		System.out.println("3_.Eliminar Sala");
		System.out.println("4_.Modificar descuentos");
		System.out.println("5_.Ver reservas");
		
		Scanner t= new Scanner (System.in);
		int op=t.nextInt();
		
		String sql="";
	}
}
