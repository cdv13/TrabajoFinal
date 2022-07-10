package cinemar;

public class Tiposala {

	private Integer id_tiposala;
	private String tipo;
	
	public Tiposala () {
	}

	@Override
	public String toString() {
		return "Tiposala [id_tiposala=" + id_tiposala + ", tipo=" + tipo + "]";
	}

	public Tiposala(Integer id_tiposala, String tipo) {
		
		this.id_tiposala = id_tiposala;
		this.tipo = tipo;
	}

	public Integer getId_tiposala() {
		return id_tiposala;
	}

	public void setId_tiposala(Integer id_tiposala) {
		this.id_tiposala = id_tiposala;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
