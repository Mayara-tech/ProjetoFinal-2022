package ControleGeral;
import Acomodacao.*;


public class ControleAcomodacao {
	
// --------------------------------------    Criando o metodo de cadastrar Apartamento ---------------------------------------------
	public void cadastrarApartamento () {	
//Criando vetor
		
		Apartamento[]	apartamento = new Apartamento[100];	
		
//Criando dados pré cadastrados 
		
		apartamento[0] = new Apartamento(
			"Apartamento",                                  // Tipo
			"Apartamento Bela Morada",                      // Nome 
			199.90,                                         // Valor Diária
			1,                                              // Numero de quartos
			1,                                              // Numero de banheiros
			true,                                           // Possui Cozinha
			true,                                           // Possui Sala de Estar           
			true,                                           // Possui Piscina
			true,                                           // Aceita pets 
			4,                                              // Numero de estrelas
			2,                                              // Andar do Apartamento
			true,                                           // Possui serviço de Quarto
			true,                                           // Possui ar condicionado
			"Apartamento com vista para o mar");            // Descrições adicionais 
		
		apartamento [1] = new Apartamento("Apartamento","Apartamento Boa Vista",299.90,2,1,true,true,true,true,5,10,true,true,"Apartamento com Hidromassagem e vista para o mar");
		apartamento [2] = new Apartamento("Apartamento","Apartamento Boa Esperança",259.90,1,1,true,true,false,false,3,4,true,true,"Apartamento com excelente localização ");
		apartamento [3] = new Apartamento("Apartamento","Apartamento Cariri",299.90,2,1,true,true,true,true,5,10,true,true,"Apartamento amplo com vista para o mar");
		apartamento [4] = new Apartamento("Apartamento","Apartamento Dom Casmurro",89.90,1,1,true,true,false,false,2,4,false,false,"Apartamento aconchegante ");
		apartamento [5] = new Apartamento("Apartamento","Apartamento Elite",399.90,2,1,true,true,true,true,4,8,true,true,"Apartamento com vista para o mar");
		apartamento [6] = new Apartamento("Apartamento","Apartamento Facundes",99.90,1,1,true,true,false,false,3,4,false,false,"Apartamento amplo com camas extras");
		apartamento [7] = new Apartamento("Apartamento","Apartamento Gaspar Dutra",299.90,2,1,true,true,true,true,3,10,true,true,"Apartamento com ótima equipe de funcionários");
		apartamento [8] = new Apartamento("Apartamento","Apartamento Pallissander",159.00,1,1,true,true,false,false,2,1,false,true,"Apartamento com excelente localização ");
		apartamento [9] = new Apartamento("Apartamento","Apartamento L.Carvalho",699.90,3,2,true,true,true,true,5,10,true,true,"Apartamento com Hidromassagem, Suite com vista para o mar, closet espaçoso e café da manhã incluso");
	
	}
	
// Criando o metodo de cadastrar Casa
	
	public void cadastrarCasa () {
//Criando vetor
		
		Casa[] casa = new Casa[100];
	
//Criando dados pré cadastrados 
		casa[0] = new Casa(
				"Casa",                                          // Tipo
				"Casa Boa morada",                               // Nome 
				189.90,                                          // Valor Diária
				2,                                               // Numero de quartos
				1,                                               // Numero de banheiros
				true,                                            // Possui Cozinha
				true,                                            // Possui Sala de Estar           
				true,                                            // Possui Piscina
				true,                                            // Aceita pets 
				"Casa toda mobiliada Ótima para temporada");     // Descrições adicionais 
		
		casa[1] = new Casa ("Casa","Casa Amarai",189.90,2,1,true,true,true,true,"Casa toda mobiliada Ótima para temporada");
		casa[2] = new Casa ("Casa","Casa Boa Esperança",79.90,2,1,true,true,true,true,"Casa no Centro");
		casa[3] = new Casa ("Casa","Casa Tancredo",89.90,3,1,true,true,true,true,"Casa perto da Rodoviária");
		casa[4] = new Casa ("Casa","Casa Tia Delia",49.90,1,1,true,true,true,true,"Casa perto de Farmácias e Supermercados");
		casa[5] = new Casa ("Casa","Casa do Vovô",99.90,2,2,true,true,true,true,"Casa toda mobiliada Ótima para temporada");
		casa[6] = new Casa ("Casa","Casa Bom recanto",259.90,4,2,true,true,true,true,"Casa para festas de fim de ano");
		casa[7] = new Casa ("Casa","Casa Dom Xavier",119.90,2,1,true,true,true,true,"Casa em bairro badalado de restaurantes");
		casa[8] = new Casa ("Casa","Casa Eliseu Martins",59.90,1,1,true,true,true,true,"Casa com proximidade do litoral");
		casa[9] = new Casa ("Casa","Casa Recanto dos pássaros",289.90,4,3,true,true,true,true,"Casa para quem ama curtir um ambiente aconchegante");
	}
// Criando o metodo de cadastrar Chácara
	public void cadastrarChacara () {
//Criando vetor
		
		Chacara[] chacara = new Chacara[100];
		
//Criando dados pré cadastrados
		chacara[0] = new Chacara(
				"Chácara",                                                   // Tipo
				"Chácara Retiro de Paz",                                     // Nome 
				589.90,                                                      // Valor Diária
				5,                                                           // Numero de quartos
				3,                                                           // Numero de banheiros
				true,                                                        // Possui Cozinha
				true,                                                        // Possui Sala de Estar           
				true,                                                        // Possui Piscina
				10,                                                          // Quantidade máxima de pessoas
				"Quadra de vôlei e tênis de mesa",			                 // Atividades de lazer
				"Chácara toda mobiliada ótima para eventos em família");     // Descrições adicionais 
		
		chacara[1] = new Chacara ("Chácara","Chácara Retiro de Paz",389.90,5,2,true,true,true,10,"mini fazenda, quadra de futebol e mesa de sinuca","Chácara toda mobiliada ótima para eventos em família");
		chacara[2] = new Chacara ("Chácara","Chácara da vovó Amelia",179.90,3,2,true,true,true,10,"Quadra de vôlei e tênis de mesa","Chácara toda mobiliada ótima para eventos em família");
		chacara[3] = new Chacara ("Chácara","Chácara Bom Fazendeiro",689.90,5,3,true,true,true,30,"Quadra de vôlei, futebol, churrasqueira, parquinho infantil e tênis de mesa","Chácara toda mobiliada ótima para festas");
		chacara[4] = new Chacara ("Chácara","Chácara Recanto do beija-flor",159.90,3,2,true,true,true,10,"Quadra de vôlei e Quadra de futebol","Chácara toda mobiliada ótima para eventos em família");
		chacara[5] = new Chacara ("Chácara","Chácara Canto dos pássaros",99.00,2,1,true,true,true,5,"Mesa de sinuca e tênis de mesa","Chácara para descanso e lazer");
		chacara[6] = new Chacara ("Chácara","Chácara Dom Osvaldo",89.90,2,2,true,true,true,8,"churrasqueira e parquinho infantil","Chácara toda mobiliada ótima para confratenizações");
		chacara[7] = new Chacara ("Chácara","Chácara Bons amigos",259.90,4,2,true,true,true,12,"Quadra de futebol e churrasqueira","Chácara toda mobiliada ótima para eventos entre amigos");
		chacara[8] = new Chacara ("Chácara","Chácara Fernandes",189.90,3,1,true,true,true,15,"Mesa de sinuca e churrasqueira","Chácara com otima localização");
		chacara[9] = new Chacara ("Chácara","Chácara Tio Lucas",589.90,5,3,true,true,true,25,"Mini fazenda, Tirolesa, tamboagua infantil","Chácara com ambiente familiar, excelente para crianças");
	}
// Criando o metodo de cadastrar Carro
	public void cadastrarCarro ( ) {
//Criando vetor
		
		Carro[] carro = new Carro [25];		
//Criando dados pré cadastrados		
		carro[0] = new Carro(
				"Fiat Mobi",           // Modelo
				83.99,                 // Valor Diária
				true,                  // Possuí seguro
				"Popular");            // Tipo
		
		carro[1] = new Carro("Mobi Like",101.99,true,"Econômico");
		carro[2] = new Carro( "Renault Kwid",89.99,true,"Econômico");
		carro[3] = new Carro("Hb20x",115.99,true,"Compacto");
		carro[4] = new Carro("Corolla",459.99,true,"Esportivo");
	}
	
}
