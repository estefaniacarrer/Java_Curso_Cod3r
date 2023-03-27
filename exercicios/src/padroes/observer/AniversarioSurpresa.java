package padroes.observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		Namorada namorada = new Namorada();  // primeira forma
		Porteiro porteiro = new Porteiro();

		porteiro.registrarObservador(namorada);  // primeira forma

		porteiro.registrarObservador(e -> { // segunda forma
			//System.out.println("Surpresa via lambda!");
			System.out.println("Ocorreu em: " + e.getMomento());  // mostrar data e hora do ocorrido
		});
		porteiro.monitorar();
	}

}
