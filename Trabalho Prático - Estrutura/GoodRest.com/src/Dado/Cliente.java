package Dado;
import java.util.Date;
import Validacao.ValidacaoCpf;

public class Cliente {
	
// Atributos
	private String nomeCliente;
	private int rg;
	private int cpf;
	private Date dataNascimento;
	
// Criando Constructor
	
	public Cliente(String nomeCliente, int rg, int cpf, Date dataNascimento) {
		super();
		this.nomeCliente = nomeCliente;
		this.rg = rg;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
//  Criando Gets e Sets	

	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
