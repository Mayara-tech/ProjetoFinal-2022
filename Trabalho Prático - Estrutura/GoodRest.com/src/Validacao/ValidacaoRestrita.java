package Validacao;
import java.util.Scanner;

public class ValidacaoRestrita {
	
// criando valida��o de acesso de funcion�rio para utiliza��o de cadastro de acomoda��o
	
	public static boolean loginFuncionario(String login) {
        Scanner in = new Scanner(System.in);
// 1) Informe o seu login
        
        System.out.println("login> ");
        String login1 = in.nextLine();
// 2) Informe a sua senha
        
        System.out.println("senha> ");
        String senha = in.nextLine();
        
// 3) Armazenar em variaveis o login e a senha
// 4) Verificar se o login e a senha est�o corretos
// Estamos comparando uma inst�ncia (objeto) com uma string
        
        if(login1.equals("GoodRest") && senha.equals("123456789-09")){
            System.out.printf("Usu�rio do %s logado com sucesso.", login1);
        }else{
            System.out.println("Login ou senha inv�lidos!");
        }
		return false;
    }
/*	public static void main(String[] args) {
		boolean flag = loginFuncionario (null);
	}*/

}
