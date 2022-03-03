package MenuPrincipal;
import Interface.*;
import Validacao.ValidacaoCpf;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.event.*;


public class MenuInicial {

// testando Validador de cpf 
		 public static void main(String[] args) {
		 String cpf;
	        Scanner ler = new Scanner(System.in);
	        System.out.printf("Por favor Insira o CPF: ");
	        cpf = ler.next();
	        System.out.printf("\nCPF válido: ");
	        if (ValidacaoCpf.validaCpf(cpf) == true)
	           System.out.printf("%s\n", ValidacaoCpf.imprimeCPF(cpf));
	        else System.out.printf("Erro!!! Por favor verifique o CPF informado.\n");
	        }
}
