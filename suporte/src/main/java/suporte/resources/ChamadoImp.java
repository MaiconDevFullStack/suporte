package suporte.resources;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import suporte.model.Chamado;
import suporte.utility.UnidadePersistencia;



public class ChamadoImp {
	
	//////////////////////////////////
	//INSERIR
	/////////////////////////////////
	
	public void inserir(Chamado chamado)throws Exception{
		EntityManager em = UnidadePersistencia.createEntityManager();
		
		try {
			
			em.getTransaction().begin();
			em.persist(chamado);
			em.getTransaction().commit();
		
		} catch (Exception e) {
		
			e.printStackTrace();
			em.close();
		
		} finally {
			if(em.isOpen()) {
				em.close();
			}
		}
	}
	
	
	//////////////////////////////////
	//CONSULTAR TODOS
	/////////////////////////////////
	
	
	public List<Chamado> consultarTodos() {
	EntityManager em = UnidadePersistencia.createEntityManager();
		try {
	
			
	
			Query q = em.createQuery(" SELECT a "
							   		 + " FROM Chamado a	", Chamado.class);
	
			List<Chamado> lista = q.getResultList();
	
			if(lista.isEmpty()) {
				System.out.println("Nenhum Registro encontrado");
			}
	
			return lista;
			
	
		} catch (NoResultException e) {
	
			e.printStackTrace();
			em.close();
	
		} finally {
			if(em.isOpen()) {
				em.close();
			}
		}
		return null;
	}
	
}