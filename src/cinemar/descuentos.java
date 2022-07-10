package cinemar;

public class descuentos {
	private Integer id_desc;
	private Double tipo;
	
	public descuentos () {
		
	}

	public descuentos(Integer id_desc, Double tipo) {
		
		this.id_desc = id_desc;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "descuentos [id_desc=" + id_desc + ", tipo=" + tipo + "]";
	}

	public Integer getId_desc() {
		return id_desc;
	}

	public void setId_desc(Integer id_desc) {
		this.id_desc = id_desc;
	}

	public Double getTipo() {
		return tipo;
	}

	public void setTipo(Double tipo) {
		this.tipo = tipo;
	}
	
	
}
