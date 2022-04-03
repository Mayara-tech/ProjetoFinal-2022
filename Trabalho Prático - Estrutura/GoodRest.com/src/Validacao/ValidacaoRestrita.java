package Validacao;
import java.util.Scanner;

public class ValidacaoRestrita {
	
// criando validação de acesso de funcionário para utilização de cadastro de acomodação
	
	public static boolean loginFuncionario(String login) {
        Scanner in = new Scanner(System.in);
// 1) Informe o seu login
        String login1 = in.nextLine();
// 2) Informe a sua senha
        String senha = in.nextLine();
        
// 3) Armazenar em variaveis o login e a senha
// 4) Verificar se o login e a senha estão corretos
// Estamos comparando uma instância (objeto) com uma string
        
        if(login1.equals("GoodRest") && senha.equals("123456789-09")){
            System.out.printf("Usuário do %s logado com sucesso.", login1);
        }else{
            System.out.println("Login ou senha inválidos!");
        }
		return false;
    }

}
