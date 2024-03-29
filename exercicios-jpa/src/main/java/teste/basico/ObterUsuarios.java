package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		//1 forma: 
		/*String jpql = "SELECT u FROM Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		query.setMaxResults(5);
		
		List<Usuario> usuarios = query.getResultList();
		
		for(Usuario usuario: usuarios ) {
			System.out.println(usuario.getNome());
		}*/
		
		
		//2 forma
		
		List<Usuario> usuarios =em.createQuery("SELECT u FROM Usuario u", Usuario.class)
				.setMaxResults(5)
				.getResultList();
		
		for(Usuario usuario: usuarios ) {
			System.out.println(usuario.getNome());
		}
		
		
		em.close();
		emf.close();
	}
}
