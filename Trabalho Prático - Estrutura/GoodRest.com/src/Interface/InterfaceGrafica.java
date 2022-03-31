package Interface;
import MenuPrincipal.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.swing.event.*;

public class InterfaceGrafica implements ActionListener { 
	
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
		  
		  sobreNos.addActionListener(sn);
	  }
	 
	
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
	      
	retornar.addActionListener(mp);
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
