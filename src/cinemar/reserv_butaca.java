package cinemar;

public class reserv_butaca {
	private reserva reserva;
	private butaca butaca;
public reserv_butaca() {
	
}
public reserv_butaca(reserva reserva, butaca butaca) {
	super();
	this.reserva = reserva;
	this.butaca = butaca;
}
@Override
public String toString() {
	return "reserv_butaca [reserva=" + reserva + ", butaca=" + butaca + "]";
}
public reserva getReserva() {
	return reserva;
}
public void setReserva(reserva reserva) {
	this.reserva = reserva;
}
public butaca getButaca() {
	return butaca;
}
public void setButaca(butaca butaca) {
	this.butaca = butaca;
}


}

