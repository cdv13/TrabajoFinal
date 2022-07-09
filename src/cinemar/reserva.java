package cinemar;

import java.sql.Date;

public class reserva {

	private Integer id_res;
	private Date fecha;
	private Double precio;
	private pelicula pelicula;
	private usuario usuario;
	private sala sala;
	private butaca butaca;
	private estado estado;
	
	public reserva () {
	}

	public reserva(Integer id_res, Date fecha, Double precio, cinemar.pelicula pelicula, cinemar.usuario usuario,
			cinemar.sala sala, cinemar.butaca butaca, cinemar.estado estado) {
		
		this.id_res = id_res;
		this.fecha = fecha;
		this.precio = precio;
		this.pelicula = pelicula;
		this.usuario = usuario;
		this.sala = sala;
		this.butaca = butaca;
		this.estado = estado;
	}

	public Integer getId_res() {
		return id_res;
	}

	public void setId_res(Integer id_res) {
		this.id_res = id_res;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(usuario usuario) {
		this.usuario = usuario;
	}

	public sala getSala() {
		return sala;
	}

	public void setSala(sala sala) {
		this.sala = sala;
	}

	public butaca getButaca() {
		return butaca;
	}

	public void setButaca(butaca butaca) {
		this.butaca = butaca;
	}

	public estado getEstado() {
		return estado;
	}

	public void setEstado(estado estado) {
		this.estado = estado;
	}
	
	
}
