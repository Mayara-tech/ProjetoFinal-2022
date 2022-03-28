package Acomodacao;

public class Chacara extends Acomodacao {
	
//  Atributos 
	
	private int numeroQuartos; 
	private int numeroBanheiros;
	private boolean cozinha; 
	private boolean saladeEstar; 
	private boolean piscina;
	private int quantidadeMaxima; 
	private String atividadeLazer; 
	private String adicionais;
	
// Criando Constructor
	
	public Chacara(String tipo, String nomeAcomodacao, double valorDiariaAcomodacao, int numeroQuartos,
			int numeroBanheiros, boolean cozinha, boolean saladeEstar, boolean piscina, int quantidadeMaxima,
			String atividadeLazer, String adicionais) {
		super(tipo, nomeAcomodacao, valorDiariaAcomodacao);
		this.numeroQuartos = numeroQuartos;
		this.numeroBanheiros = numeroBanheiros;
		this.cozinha = cozinha;
		this.saladeEstar = saladeEstar;
		this.piscina = piscina;
		this.quantidadeMaxima = quantidadeMaxima;
		this.atividadeLazer = atividadeLazer;
		this.adicionais = adicionais;
	}
	
// Criando Gets e Sets
	
	public int getNumeroQuartos() {
		return numeroQuartos;
	}
	public void setNumeroQuartos(int numeroQuartos) {
		this.numeroQuartos = numeroQuartos;
	}
	public int getNumeroBanheiros() {
		return numeroBanheiros;
	}
	public void setNumeroBanheiros(int numeroBanheiros) {
		this.numeroBanheiros = numeroBanheiros;
	}
	public boolean isCozinha() {
		return cozinha;
	}
	public void setCozinha(boolean cozinha) {
		this.cozinha = cozinha;
	}
	public boolean isSaladeEstar() {
		return saladeEstar;
	}
	public void setSaladeEstar(boolean saladeEstar) {
		this.saladeEstar = saladeEstar;
	}
	public boolean isPiscina() {
		return piscina;
	}
	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}
	public int getQuantidadeMaxima() {
		return quantidadeMaxima;
	}
	public void setQuantidadeMaxima(int quantidadeMaxima) {
		this.quantidadeMaxima = quantidadeMaxima;
	}
	public String getAtividadeLazer() {
		return atividadeLazer;
	}
	public void setAtividadeLazer(String atividadeLazer) {
		this.atividadeLazer = atividadeLazer;
	}
	public String getAdicionais() {
		return adicionais;
	}
	public void setAdicionais(String adicionais) {
		this.adicionais = adicionais;
	} 
	public void statusChacaras() {
		System.out.println("*********************************************************************************");
		System.out.println("Tipo de acomodação: " + this.getTipo());
		System.out.println("Nome: " + this.getNomeAcomodacao());
		System.out.println("Valor diária: "+ "R$" + this.getValorDiariaAcomodacao() );
		System.out.println("Numero de quartos " + this.getNumeroQuartos());
		System.out.println("Numero de banheiros: " + this.getNumeroBanheiros());
		System.out.println("Possui cozinha: " + this.isCozinha());
		System.out.println("Possui sala de estar: " + this.isSaladeEstar());
		System.out.println("Possui piscina no prédio: " + this.isPiscina());
		System.out.println("Quantidade máxima de pessoas: " + this.getQuantidadeMaxima());
		System.out.println("Atividades de lazer: " + this.getAtividadeLazer());
		System.out.println("Descrição: " + this.getAdicionais()+"\n");
	}
}
