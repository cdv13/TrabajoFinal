package cinemar;

public class domicilio {

	private Integer id_Dom;
	private String calle;
	private Integer altura;
	private Integer piso;
	private Integer numero;
	private String deparamento;
	private String provincia;
	
	public domicilio () {
	}
	
	public domicilio(Integer id, String calle, Integer altura, Integer piso, Integer numero, String deparamento,
			String provincia) {
		
		this.id_Dom = id;
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.numero = numero;
		this.deparamento = deparamento;
		this.provincia = provincia;
	}

	public Integer getId_Dom() {
		return id_Dom;
	}

	public void setId_Dom(Integer id) {
		this.id_Dom = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public Integer getPiso() {
		return piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getDeparamento() {
		return deparamento;
	}

	public void setDeparamento(String deparamento) {
		this.deparamento = deparamento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	
	
}
