package example.hibernate.pyme.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import example.hibernate.pyme.config.DBConfig;
import example.hibernate.pyme.models.Tecnico;

public class Controller3 {

	public void otroMetodo(Tecnico unTecnico) {
		
		EntityManager em = DBConfig.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
			unTecnico.setNombre("Nahuelito");
			em.persist(unTecnico);
		tx.commit();
		
	}
	
	
}
