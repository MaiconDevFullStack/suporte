package suporte.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UnidadePersistencia {
	
	private static final EntityManagerFactory em = Persistence.createEntityManagerFactory("suportePU");
	
	private UnidadePersistencia() {
		
	}
	
	public static EntityManager createEntityManager() {
    	return createEntityManager(true);
    }
	
	private static EntityManager createEntityManager(boolean controlar) {
    	
        return em.createEntityManager();
    }
	
}
