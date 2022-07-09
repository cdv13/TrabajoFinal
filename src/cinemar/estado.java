package cinemar;

public class estado {

	private Integer id_estado;
	private String estado;
	
	public estado () {
	}

	public estado(Integer id_estado, String estado) {
		
		this.id_estado = id_estado;
		this.estado = estado;
	}

	public Integer getId_estado() {
		return id_estado;
	}

	public void setId_estado(Integer id_estado) {
		this.id_estado = id_estado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
