package Acomodacao;

public class Carro {
// Atributos
	
	private String modelo;
	private double valorDiariaCarro; 
	private boolean seguro; 
	private String tipo;

// Criando Constructor

	public Carro(String modelo, double valorDiariaCarro, boolean seguro, String tipo) {
		super();
		this.modelo = modelo;
		this.valorDiariaCarro = valorDiariaCarro;
		this.seguro = seguro;
		this.tipo = tipo;
	}
	
// Criando Gets e Sets

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getValorDiariaCarro() {
		return valorDiariaCarro;
	}
	public void setValorDiariaCarro(double valorDiariaCarro) {
		this.valorDiariaCarro = valorDiariaCarro;
	}
	public boolean isSeguro() {
		return seguro;
	}
	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void statusCarros() {
		System.out.println("*********************************************************************************");
		System.out.println("Modelo:" + this.getModelo());
		System.out.println("Valor di�ria: "+ "R$" + this.getValorDiariaCarro() );
		System.out.println("Seguro de roubo e acidente: " + this.isSeguro());
		System.out.println("Tipo:" + this.getTipo());
	}
}
	