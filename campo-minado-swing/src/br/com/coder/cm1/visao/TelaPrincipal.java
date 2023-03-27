package br.com.coder.cm1.visao;

import javax.swing.JFrame;

import br.com.coder.cm1.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame{
	
	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 30);
		add(new PainelTabuleiro(tabuleiro));
		
		setTitle("Campo Minado");
		setSize(690, 438);
		setLocationRelativeTo(null);  // centralizar a tela
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);  // parar a operação após fechamento
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}

}
