package Acomodacao;

public class Apartamento extends Acomodacao {
	
//  Atributos 
	
	private int numeroQuartos;
	private int numeroBanheiros;
	private boolean cozinha;
	private boolean saladeEstar;
	private boolean piscina; 
	private boolean pets;
	private int estrelas;
	private int andar; 
	private boolean servicoQuarto;
	private boolean arCondicionado;
	private String adicionais;


// Criando Constructor
	
	public Apartamento(String tipo, String nomeAcomodacao, double valorDiariaAcomodacao, int numeroQuartos,
			int numeroBanheiros, boolean cozinha, boolean saladeEstar, boolean piscina, boolean pets, int estrelas,
			int andar, boolean servicoQuarto, boolean arCondicionado, String adicionais) {
		super(tipo, nomeAcomodacao, valorDiariaAcomodacao);
		this.numeroQuartos = numeroQuartos;
		this.numeroBanheiros = numeroBanheiros;
		this.cozinha = cozinha;
		this.saladeEstar = saladeEstar;
		this.piscina = piscina;
		this.pets = pets;
		this.estrelas = estrelas;
		this.andar = andar;
		this.servicoQuarto = servicoQuarto;
		this.arCondicionado = arCondicionado;
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
	public int getEstrelas() {
		return estrelas;
	}
	public void setEstrelas(int estrelas) {
		this.estrelas = estrelas;
	}
	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}
	public boolean isServicoQuarto() {
		return servicoQuarto;
	}
	public void setServicoQuarto(boolean servicoQuarto) {
		this.servicoQuarto = servicoQuarto;
	}
	public boolean isArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	public String getAdicionais() {
		return adicionais;
	}
	public void setAdicionais(String adicionais) {
		this.adicionais = adicionais;
	}
		public void statusApartamentos() {
			System.out.println("*********************************************************************************");
			System.out.println("Tipo de acomodação: " + this.getTipo());
			System.out.println("Nome: " + this.getNomeAcomodacao());
			System.out.println("Valor diária: "+ "R$" + this.getValorDiariaAcomodacao() );
			System.out.println("Numero de quartos " + this.getNumeroQuartos());
			System.out.println("Numero de banheiros: " + this.getNumeroBanheiros());
			System.out.println("Possui cozinha: " + this.isCozinha());
			System.out.println("Possui sala de estar: " + this.isSaladeEstar());
			System.out.println("Possui piscina no prédio: " + this.isPiscina());
			System.out.println("Aceita entrada de Pets: " + this.isPets());
			System.out.println("Possui serviço de quarto: " + this.isServicoQuarto());
			System.out.println("Possui ar condicionado: " + this.isArCondicionado());
			System.out.println("Apartamento " + this.getEstrelas() + " estrelas");
			System.out.println("Apartamento localizado no " + this.getAndar() +"º andar");
			System.out.println("Descrição: " + this.getAdicionais()+"\n");
	}
}
