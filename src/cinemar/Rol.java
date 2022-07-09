package cinemar;

public class Rol {
	private Integer id_rol;
	private String tipo;
	
	public Rol () {
	}

	public Rol(Integer id_rol, String tipo) {
		this.id_rol = id_rol;
		this.tipo = tipo;
	}

	public Integer getId_rol() {
		return id_rol;
	}

	public void setId_rol(Integer id_rol) {
		this.id_rol = id_rol;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
