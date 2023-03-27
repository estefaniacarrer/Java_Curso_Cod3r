package br.com.cod3r.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {
	
	public Calculadora() {
		
		organizarLayout();
		
		setSize(300, 420);
		//setUndecorated(true);  // tirar a barra do windows X - 
		setDefaultCloseOperation(EXIT_ON_CLOSE);  // fechar a tela atual
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void organizarLayout() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(330, 110));  // display e teclado
		add(display, BorderLayout.NORTH);             // add -> heran�a
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);

	}
	public static void main(String[] args) {
		new Calculadora();
	}
	
}
