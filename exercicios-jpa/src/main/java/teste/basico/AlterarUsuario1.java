package teste.basico;

//Alterando informações do usuario

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		usuario.setNome("Leonardo");
		usuario.setEmail("leonardo@lanche.com.br");
		
		em.merge(usuario);  //update
		
		//System.out.println(usuario.getEmail()); // consultar
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
