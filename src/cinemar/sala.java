package cinemar;

public class sala {

	private Integer id_sala;
	private Integer numero;
	private Integer capacidad;
	private Tiposala tiposala;
	
	public sala () {
	}

	public sala(Integer id_sala, Integer numero, Integer capacidad, Tiposala tiposala) {
		
		this.id_sala = id_sala;
		this.numero = numero;
		this.capacidad = capacidad;
		this.tiposala = tiposala;
	}

	public Integer getId_sala() {
		return id_sala;
	}

	public void setId_sala(Integer id_sala) {
		this.id_sala = id_sala;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public Tiposala getTiposala() {
		return tiposala;
	}

	public void setTiposala(Tiposala tiposala) {
		this.tiposala = tiposala;
	}
	
	
}
