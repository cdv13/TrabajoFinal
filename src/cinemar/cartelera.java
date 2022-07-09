package cinemar;

import java.sql.Time;

public class cartelera {
	private Integer id_cart;
	private pelicula pelicula;
	private sala sala;
	private Time horario;
	
public cartelera () {
	}

public cartelera(Integer id_cart, cinemar.pelicula pelicula, cinemar.sala sala, Time horario) {
	
	this.id_cart = id_cart;
	this.pelicula = pelicula;
	this.sala = sala;
	this.horario = horario;
}

public Integer getId_cart() {
	return id_cart;
}

public void setId_cart(Integer id_cart) {
	this.id_cart = id_cart;
}

public pelicula getPelicula() {
	return pelicula;
}

public void setPelicula(pelicula pelicula) {
	this.pelicula = pelicula;
}

public sala getSala() {
	return sala;
}

public void setSala(sala sala) {
	this.sala = sala;
}

public Time getHorario() {
	return horario;
}

public void setHorario(Time horario) {
	this.horario = horario;
}


}
