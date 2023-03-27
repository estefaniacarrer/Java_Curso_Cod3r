package collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto"); // add se n�o existir ou substitiu se existir
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty()); // se est� ou n�o vazio
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebeca"));
		
		System.out.println(usuarios.get(4));
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(4, "Gui")); // retorna false -> valores incorretos
		
		for (int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for (String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for (Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + "==> ");
			System.out.println(registro.getValue());
		}
	}

}
