package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

//Consultando vários usuarios (lista de consulta)

public class ObterUsuarios {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa"); // são interfaces
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select u from Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		query.setMaxResults(5); // limita a quantidade de retorno 
		
		List<Usuario> usuarios = query.getResultList();
		
//		List<Usuario> usuarios = em
//				.createQuery("select u from Usuario u", Usuario.class)
//				.setMaxResults(5)
//				.getResultList();  // metodo simplificado acima
		
		for(Usuario usuario: usuarios) {
			System.out.println("ID: " + usuario.getId()
			+ " E-mail: " + usuario.getEmail());
		}
		
		em.close();
		emf.close();
		
	}

}
