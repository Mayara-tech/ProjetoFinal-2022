package Dado;
import Acomodacao.*;

public class Reserva {

// Atributos
	private Boolean status;
	private int numeroReserva;

// Criando Constructor
	
	public Reserva(Boolean status, int numeroReserva) {
		super();
		this.status = status;
		this.numeroReserva = numeroReserva;
	}

//  Criando Gets e Sets	
	
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public int getNumeroReserva() {
		return numeroReserva;
	}
	public void setNumeroReserva(int numeroReserva) {
		this.numeroReserva = numeroReserva;
	}
}
