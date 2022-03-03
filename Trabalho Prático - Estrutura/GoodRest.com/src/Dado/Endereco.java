package Dado;

public class Endereco {

// Atributos
	private String pais;
	private String estado;
	private String complemento;
	private String cidade;
	private String bairro;
	private String rua;
	private int lote;
	private int cep;

// Criando Constructor
	
	public Endereco(String pais, String estado, String complemento, String cidade, String bairro, String rua, int lote,
			int cep) {
		super();
		this.pais = pais;
		this.estado = estado;
		this.complemento = complemento;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.lote = lote;
		this.cep = cep;
	}

//  Criando Gets e Sets	
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getLote() {
		return lote;
	}
	public void setLote(int lote) {
		this.lote = lote;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}

}
