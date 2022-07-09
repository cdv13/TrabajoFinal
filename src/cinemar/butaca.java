package cinemar;

public class butaca {

	private Integer id_butaca;
	private String fila;
	private Integer numero;
	
	public butaca () {
	}

	public butaca(Integer id_butaca, String fila, Integer numero) {
		
		this.id_butaca = id_butaca;
		this.fila = fila;
		this.numero = numero;
	}

	public Integer getId_butaca() {
		return id_butaca;
	}

	public void setId_butaca(Integer id_butaca) {
		this.id_butaca = id_butaca;
	}

	public String getFila() {
		return fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	
}
