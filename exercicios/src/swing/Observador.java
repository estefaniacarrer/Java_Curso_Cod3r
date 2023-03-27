package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {  

	public static void main(String[] args) {

		JFrame janela = new JFrame("Observador"); // JFrame -> uma janela

		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // fechar janela automatico sem precisar apertar em
																	// parar
		janela.setSize(400, 200); // tamanho
		janela.setLayout(new FlowLayout()); // layout do botão
		janela.setLocationRelativeTo(null); // centralizar a janela na tela

		JButton botao = new JButton("Clicar!");
		janela.add(botao);

		botao.addActionListener(e -> { // o lambda da o retorno conforme é apertado o botão
			System.out.println("Evento ocorreu!!!");
		});

		janela.setVisible(true);
	}

}
