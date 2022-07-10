package cinemar;

public class pago {
	private Integer id_Pago;
	private String tipo;
	private reserva reserva;
	private descuentos descuentos;
	
	public pago() {
		
	}

	public pago(Integer id_Pago, String tipo, reserva reserva, descuentos descuentos) {
		super();
		this.id_Pago = id_Pago;
		this.tipo = tipo;
		this.reserva = reserva;
		this.descuentos=descuentos;
	}

	

	@Override
	public String toString() {
		return "pago [id_Pago=" + id_Pago + ", tipo=" + tipo + ", reserva=" + reserva + ", descuentos=" + descuentos
				+ "]";
	}

	public Integer getId_Pago() {
		return id_Pago;
	}

	public void setId_Pago(Integer id_Pago) {
		this.id_Pago = id_Pago;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public reserva getReserva() {
		return reserva;
	}

	public void setReserva(reserva reserva) {
		this.reserva = reserva;
	}

	public descuentos getDes() {
		return descuentos;
	}

	public void setDes(descuentos descuentos) {
		this.descuentos = descuentos;
	}
	
	
}
