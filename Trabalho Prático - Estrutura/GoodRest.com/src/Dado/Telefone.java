package Dado;

public class Telefone {
	
// Atributos

	private int ddd;
	private int numeroTelefone;

// Criando Constructor
	
	public Telefone(int ddd, int numeroTelefone) {
		super();
		this.ddd = ddd;
		this.numeroTelefone = numeroTelefone;
	}

//  Criando Gets e Sets	
	
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public int getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(int numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

}
