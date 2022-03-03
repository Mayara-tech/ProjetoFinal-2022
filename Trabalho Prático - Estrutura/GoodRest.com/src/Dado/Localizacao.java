package Dado;

public class Localizacao {
	
// Atributos
	private String pontoReferencia;

// Criando Constructor
	
	public Localizacao(String pontoReferencia) {
		super();
		this.pontoReferencia = pontoReferencia;
	}

//  Criando Gets e Sets	

	public String getPontoReferencia() {
		return pontoReferencia;
	}
	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}

}
