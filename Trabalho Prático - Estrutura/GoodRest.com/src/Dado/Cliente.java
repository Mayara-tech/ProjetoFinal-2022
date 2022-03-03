package Dado;
import java.util.Date;
import java.util.Scanner;
import Validacao.ValidacaoCpf;

public class Cliente {
	
	
// Atributos
	private String nomeCliente;
	private int rg;
	private String cpf;
	private Date dataNascimento;
	
// Criando Constructor
	
	public Cliente(String nomeCliente, int rg, String cpf, Date dataNascimento) {
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;		
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

  }


