package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3r.cm.excecao.ExplosaoException;

public class Campo {
	
	private final int linha;
	private final int coluna;
	
	private boolean aberto = false;
	private boolean minado = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
	
	boolean adicionarVizinho(Campo vizinho) {
		boolean linhaDiferente = linha != vizinho.linha;
		boolean colunaDiferente = coluna != vizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int deltaGeral = deltaColuna + deltaLinha;
		
		if(deltaGeral == 1 & !diagonal) {
			vizinhos.add(vizinho);
			return true;
		}else if (deltaGeral == 2 & diagonal) {
			vizinhos.add(vizinho);
			return true;
		}else {
			return false;
		}
	}
	
	void alternarMarcacao() {   // qdo marcar um campo ele n�o vai permitir abri-lo
		if(!aberto) {
			marcado = !marcado;
		}
	}
	boolean abrir() {
		if(!aberto && !marcado)  {
			aberto = true;
			
			if(minado) {
				throw new ExplosaoException(); // gera uma exce��o para o campo minado
		   }
			
			if(vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir()); // abrir vizinhan�a segura
			}
			
			return true;
		  }else {
			 return false;
		  }
	}
	
	boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado);
	}
	
	void minar() {  // mostrar o campo minado ap�s finaliza��o
	   minado = true;
	}
	
	public boolean isMinado() {
		return minado;
	}
	
	public boolean isMarcado() {
		return marcado;
	}
	
	void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public boolean isAberto() {
		return aberto;
	}
	
	public boolean isFechado() {
		return !isAberto();
	}
	
	public int getLinha() {
		return linha;
	}
	public int getColuna() {
		return coluna;
	}
	
	boolean objetivoAlcancado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		return desvendado || protegido;
	}
	
	long minasNaVizinhanca() {
		return vizinhos.stream().filter(v -> v.minado).count();  // mostra a quantidade de minas na vizinhan�a
	}
	
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
	}
	
	public String toString() {
		if(marcado) {
			return "x";
		} else if(aberto && minado) {
			return "*";
		} else if(aberto && minasNaVizinhanca() > 0) {
			return Long.toString(minasNaVizinhanca());
		}else if(aberto) {
			return " ";
		}else {
			return "?";
		}
			
		
	}
}
