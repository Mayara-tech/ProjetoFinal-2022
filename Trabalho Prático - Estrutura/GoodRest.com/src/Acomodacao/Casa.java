package Acomodacao;

public class Casa extends Acomodacao {
	
//  Atributos 	
	
	private int numeroQuartos; 
	private int numeroBanheiros; 
	private boolean cozinha; 
	private boolean saladeEstar; 
	private boolean piscina;
	private boolean pets; 
	private String adicionais;

// Criando Constructor
	
	public Casa(String tipo, String nomeAcomodacao, double valorDiariaAcomodacao, int numeroQuartos,
			int numeroBanheiros, boolean cozinha, boolean saladeEstar, boolean piscina, boolean pets,
			String adicionais) {
		super(tipo, nomeAcomodacao, valorDiariaAcomodacao);
		this.numeroQuartos = numeroQuartos;
		this.numeroBanheiros = numeroBanheiros;
		this.cozinha = cozinha;
		this.saladeEstar = saladeEstar;
		this.piscina = piscina;
		this.pets = pets;
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
	public boolean isPets() {
		return pets;
	}
	public void setPets(boolean pets) {
		this.pets = pets;
	}
	public String getAdicionais() {
		return adicionais;
	}
	public void setAdicionais(String adicionais) {
		this.adicionais = adicionais;
	}
	public void statusCasas() {
		System.out.println("*********************************************************************************");
		System.out.println("Tipo de acomoda��o: " + this.getTipo());
		System.out.println("Nome: " + this.getNomeAcomodacao());
		System.out.println("Valor di�ria: "+ "R$" + this.getValorDiariaAcomodacao() );
		System.out.println("Numero de quartos " + this.getNumeroQuartos());
		System.out.println("Numero de banheiros: " + this.getNumeroBanheiros());
		System.out.println("Possui cozinha: " + this.isCozinha());
		System.out.println("Possui sala de estar: " + this.isSaladeEstar());
		System.out.println("Possui piscina no pr�dio: " + this.isPiscina());
		System.out.println("Aceita entrada de Pets: " + this.isPets());
		System.out.println("Descri��o: " + this.getAdicionais()+"\n");
	}
}
