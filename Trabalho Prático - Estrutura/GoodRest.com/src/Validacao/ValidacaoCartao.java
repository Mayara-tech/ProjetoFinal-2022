package Validacao;
import java.util.Scanner;

public class ValidacaoCartao {
	
//  A valida��o de n�meros de cart�o de cr�dito normalmente � feita pelo algoritmo de Luhn:
//  Retire o �ltimo d�gito do n�mero. Ele � o verificador;
//  Escreva os n�meros na ordem inversa;
//  Multiplique os d�gitos das casas �mpares por 2 e subtraia 9 de todos os resultados maiores que 9;
//  Some todos os n�meros;
//  O d�gito verificador (aquele do passo 1) � o n�mero que voc� precisa somar a todos os outros n�meros somados pra obter um m�dulo 10.
	
	public static int somaDigitos(int numero) {
		if( numero < 9 ) {
			return numero;
		} else {
			return numero%10 + 1;
		}
	}
		
	public static boolean checkValidade(String numeroCartao) { 
		
		int somaPar=0;
		int somaImpar=0;
		int aux=0;
		
		//PARES
		for( int j=numeroCartao.length()-2; j>=0; j=j-2) {
			aux = Integer.parseInt(numeroCartao.charAt(j) + "");
			somaPar = somaPar + somaDigitos(aux*2);
		}
		
		//IMPARES
		for( int i=numeroCartao.length()-1; i>=0; i=i-2) {
			aux = Integer.parseInt(numeroCartao.charAt(i) + "");
			somaImpar = somaImpar + aux;			
		}
		
		if( (somaPar+somaImpar)%10 == 0 ) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static String checkBandeiraCartao (String numero1IdEmissor, 
			String numero2IdEmissor) {
		if (numero2IdEmissor.equals("37")) {
			return "AMERICAN EXPRESS";
		} else if (numero2IdEmissor.equals("35")) {
			return "JCB";
		} else if (numero1IdEmissor.equals("4")) {
			return "VISA";
		} else if (numero1IdEmissor.equals("5")) {
			return "MASTER";
		} else if (numero1IdEmissor.equals("6")) {
			return "DISCOVER";
		} else {
			return "Bandeira n�o identificada";
		}
	}
/*	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		String bandeiraCartao = "";
		
		System.out.println("Informe o n�mero do cart�o:");
		String numeroCartao = tcd.next();
		
		if( numeroCartao.length() >= 13 && numeroCartao.length() <= 16  ) {
			
			boolean flag = checkValidade(numeroCartao);
			
			if( flag ) {
				System.out.println("Cart�o V�lido");
				bandeiraCartao = checkBandeiraCartao(numeroCartao.substring(0,1), 
						numeroCartao.substring(0,2));
				System.out.println("Bandeira " + bandeiraCartao);
			} else {
				System.out.println("Cart�o Inv�lido");
			} 
			
		} else {
			System.out.println("N�mero de cart�o inv�lido");
		} 
		
	}*/
}
