package Dado;
import Validacao.ValidacaoCartao;

public class FormaPagamento {
	
// Atributos
	private int numeroCartao;
	private int codigoSeguranca;
	private Boolean formaPagamento;
	
// Criando Constructor
	
	public FormaPagamento(int numeroCartao, int codigoSeguranca, Boolean formaPagamento) {
		super();
		this.numeroCartao = numeroCartao;
		this.codigoSeguranca = codigoSeguranca;
		this.formaPagamento = formaPagamento;
	}

//  Criando Gets e Sets	
	
	public int getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public int getCodigoSeguranca() {
		return codigoSeguranca;
	}
	public void setCodigoSeguranca(int codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}
	public Boolean getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(Boolean formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
}
