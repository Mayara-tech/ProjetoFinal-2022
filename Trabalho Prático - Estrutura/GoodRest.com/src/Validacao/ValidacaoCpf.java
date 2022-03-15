package Validacao;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ValidacaoCpf {
	
	public static boolean validaCpf (String cpf) {
		
// verificador de cpf com sequencia de numeros iguais;
		
				if (cpf.equals("00000000000") ||
		            cpf.equals("11111111111") ||
		            cpf.equals("33333333333") ||
		            cpf.equals("22222222222") || 
		            cpf.equals("44444444444") ||
		            cpf.equals("55555555555") ||
		            cpf.equals("66666666666") ||
		            cpf.equals("77777777777") ||
		            cpf.equals("88888888888") || 
		            cpf.equals("99999999999") ||
		            (cpf.length() != 11))
		            return(false);
// Variaveis 
		 	char dig10;
		 	char dig11;
	        int sm;
	        int i; 
	        int r; 
	        int num; 
	        int peso;

// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
	        try {
	        	
// Calculo do 1º. Digito Verificador
	            sm = 0;
	            peso = 10;
	            for (i=0; i<9; i++) {
	            // converte o i-esimo caractere do CPF em um numero:
	            num = (int)(cpf.charAt(i) - 48);
	            sm = sm + (num * peso);
	            peso = peso - 1;
	            }

	            r = 11 - (sm % 11);
	            if ((r == 10) || (r == 11))
	                dig10 = '0';
	            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

// Calculo do 2º. Digito Verificador
	            sm = 0;
	            peso = 11;
	            for(i=0; i<10; i++) {
	            num = (int)(cpf.charAt(i) - 48);
	            sm = sm + (num * peso);
	            peso = peso - 1;
	            }

	            r = 11 - (sm % 11);
	            if ((r == 10) || (r == 11))
	                 dig11 = '0';
	            else dig11 = (char)(r + 48);

// Verifica se os digitos calculados conferem com os digitos informados.
	            
	            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10)))
	                 return(true);
	            else return(false);
	                } catch (InputMismatchException erro) {
	                return(false);
	            }
	        }

	        public static String imprimeCPF(String cpf) {
	            return(cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." +
	            cpf.substring(6, 9) + "-" + cpf.substring(9, 11));
	}
	        
	        public static void main(String[] args) {
				String cpf;
		        Scanner ler = new Scanner(System.in);
		        System.out.printf("Por favor Insira o CPF: ");
		        cpf = ler.next();

		        if (ValidacaoCpf.validaCpf(cpf) == true) {
		        System.out.printf("%s\n", ValidacaoCpf.imprimeCPF(cpf));
		        System.out.printf("\nCPF válido: ");
		        }
		        else System.out.printf("CPF inválido! Por favor verifique o CPF informado.\n");
		        }
	}


