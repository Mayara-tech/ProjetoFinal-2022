package Interface;
import MenuPrincipal.*;
import ControleGeral.*;
import Validacao.ValidacaoRestrita;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.event.*;


public class InterfaceGrafica implements ActionListener  {
	
	
//---------------------------  Interface Gráfica Página principal  ------------------------------------
	
	 private static JFrame tela = new JFrame("GoodRest");
	 private static JButton acomodacao = new JButton("Acomodações");
	 private static JButton reservas = new JButton("Reservas");
	 private static JButton funcionarios = new JButton ("Funcionários");
	 private static JButton sobreNos = new JButton ("Sobre nossa empresa");
	
	 ImageIcon logomarca = new ImageIcon(getClass().getResource("logomarca.png"));
	 private JLabel goodRest= new JLabel(logomarca);
	 
	 public InterfaceGrafica () {
		  tela.setLayout(null);
		  tela.setSize(1520,2050);
		  tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  tela.setVisible(true);
		  
		  goodRest.setSize(1498,950);
		  acomodacao.setBounds(50,490,450,60);
		  acomodacao.setFont(new Font("Arial", Font.BOLD, 24));
		  reservas.setBounds(50, 570, 450, 60);
		  reservas.setFont(new Font("Arial", Font.BOLD, 24));
		  funcionarios.setBounds(50, 650, 450, 60);
		  funcionarios.setFont(new Font("Arial", Font.BOLD, 24));
		  sobreNos.setBounds(50, 730, 450, 60);
		  sobreNos.setFont(new Font("Arial", Font.BOLD, 24));
		  
		  
		  tela.add(goodRest);
		  tela.add(acomodacao);
		  tela.add(reservas);
		  tela.add(funcionarios);
		  tela.add(sobreNos);
		  
		  acomodacao.addActionListener(acom);
		  funcionarios.addActionListener(func);
		  sobreNos.addActionListener(sn);
		  
	  }
	 // -------------------------------Interface Gráfica Acomodações
	 ActionListener acom = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JFrame acomodacao = new JFrame ("Acomodações");
			JButton apartamento = new JButton ("Apartamentos");
			JButton casa = new JButton ("Casas");
			JButton chacara = new JButton("Chácaras");
			JButton retornar = new JButton ("Retornar para Menu Inicial");
			
			acomodacao.setLayout(null);
			acomodacao.setSize(1520,2050);
			acomodacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			acomodacao.setVisible(true);

			ImageIcon acomodacao1 = new ImageIcon(getClass().getResource("Acomodações.png"));
			JLabel pagAcomodacao= new JLabel(acomodacao1);
			pagAcomodacao.setSize(1498,950);
			
			apartamento.setBounds(50,490,450,60);
			apartamento.setFont(new Font("Arial", Font.BOLD, 24));
			casa.setBounds(50, 570, 450, 60);
			casa.setFont(new Font("Arial", Font.BOLD, 24));
			chacara.setBounds(50, 650, 450, 60);
			chacara.setFont(new Font("Arial", Font.BOLD, 24));
			retornar.setBounds(50, 730, 450, 60);
			retornar.setFont(new Font("Arial", Font.BOLD, 24));
			
			acomodacao.add(pagAcomodacao);
			acomodacao.add(apartamento);
			acomodacao.add(casa);
			acomodacao.add(chacara);
			acomodacao.add(retornar);
			retornar.addActionListener(mp1);
		 };
	};	
		ActionListener mp1 = new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
			 InterfaceGrafica menuPrincipal = new InterfaceGrafica();
		};
	 };
	 
	 
	//  -------------------------------- Interface Gráfica funcionários ----------------------------
	 ActionListener func = new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
		JFrame frame = new JFrame("Login Funcionário");
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
		
	 }
		public  void placeComponents(JPanel panel) {
	        Scanner in = new Scanner(System.in);
			panel.setLayout(null);

			JLabel userLabel = new JLabel("Usuário: ");
			userLabel.setBounds(50, 10, 160, 50);
			panel.add(userLabel);

			JTextField login = new JTextField(20);
			login.setBounds(100, 20, 160, 25);
			panel.add(login );

			JLabel passwordLabel = new JLabel("Senha: ");
			passwordLabel.setBounds(50, 40, 80, 50);
			panel.add(passwordLabel);

			JPasswordField senha = new JPasswordField(20);
			senha.setBounds(100, 50, 160, 25);
			panel.add(senha);

			JButton loginButton = new JButton("login");
			loginButton.setBounds(140, 100, 100, 35);
			panel.add(loginButton);
		};
	 };
	 // -------------------------------- Interface Gráfica Sobre nos -------------------------------
	ActionListener sn = new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	JFrame telaSobreNos = new JFrame ("GoodRest - Sobre nossa empresa");
	JButton retornar = new JButton ("Retornar para Menu Inicial");
		 
	telaSobreNos.setLayout(null);
	telaSobreNos.setSize(1540,2050);
	telaSobreNos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	telaSobreNos.setVisible(true); 	
	
	ImageIcon telaSobreNos1 = new ImageIcon(getClass().getResource("SobreNos.png"));
	JLabel sobreNos= new JLabel(telaSobreNos1);
	sobreNos.setSize(1500,960);
	
	retornar.setBounds(50, 650, 450, 60);
	retornar.setFont(new Font("Arial", Font.BOLD, 24));
	
	telaSobreNos.add(sobreNos);
	telaSobreNos.add(retornar);
	      
	retornar.addActionListener(mp1);
	 };
};	
	ActionListener mp = new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
		 InterfaceGrafica menuPrincipal = new InterfaceGrafica();
	 }
	 };
	public void actionPerformed(ActionEvent e) {

	}
	}
