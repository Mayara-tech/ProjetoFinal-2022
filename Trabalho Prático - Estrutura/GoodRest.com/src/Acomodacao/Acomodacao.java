package Acomodacao;

public abstract class Acomodacao {

//  Atributos 
	
	private String tipo;
	private String nomeAcomodacao;
	private double valorDiariaAcomodacao;
	
// Criando Constructor	
	
public Acomodacao(String tipo, String nomeAcomodacao, double valorDiariaAcomodacao) {
		super();
		this.tipo = tipo;
		this.nomeAcomodacao = nomeAcomodacao;
		this.valorDiariaAcomodacao = valorDiariaAcomodacao;
	}
//  Criando Gets e Sets	

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNomeAcomodacao() {
		return nomeAcomodacao;
	}
	public void setNomeAcomodacao(String nomeAcomodacao) {
		this.nomeAcomodacao = nomeAcomodacao;
	}
	public double getValorDiariaAcomodacao() {
		return valorDiariaAcomodacao;
	}
	public void setValorDiariaAcomodacao(double valorDiariaAcomodacao) {
		this.valorDiariaAcomodacao = valorDiariaAcomodacao;
	}
	
	 
}
