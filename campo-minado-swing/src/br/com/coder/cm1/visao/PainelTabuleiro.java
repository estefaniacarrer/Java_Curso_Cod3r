package br.com.coder.cm1.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.coder.cm1.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {
	
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas())); // como os componentes são organizados na tela
		
		tabuleiro.paraCadaCampo(c -> add (new BotaoCampo(c)));
		tabuleiro.registrarObservador(e -> {
			
			SwingUtilities.invokeLater(() -> {   // mostrar a mensagem apenas quando finalizar o jogo
			if(e.isGanhou()) {
				JOptionPane.showMessageDialog(this, "Ganhou  :)");
			}else {
				JOptionPane.showMessageDialog(this, "Perdeu :(");			
			}
			tabuleiro.reiniciar();
		});
	});
  }

}
