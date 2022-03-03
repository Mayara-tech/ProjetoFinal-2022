package Dado;

import java.util.Date;

public class Data {
	
//Atributos 
	
	private Date dataEntrada;
	private Date dataSaida;

// Criando Constructor
	
	public Data(Date dataEntrada, Date dataSaida) {
		super();
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}

//  Criando Gets e Sets	
	
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
}
