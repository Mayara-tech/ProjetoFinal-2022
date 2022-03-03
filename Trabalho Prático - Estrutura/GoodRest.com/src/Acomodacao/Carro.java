package Acomodacao;

public class Carro {
// Atributos
	
	private String modelo;
	private double valorDiariaCarro; 
	private boolean seguro; 
	private boolean tipo;

// Criando Constructor

	public Carro(String modelo, double valorDiariaCarro, boolean seguro, boolean tipo) {
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
	public boolean isTipo() {
		return tipo;
	}
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	
	
}