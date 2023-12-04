package example.hibernate.pyme.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import example.hibernate.pyme.config.DBConfig;
import example.hibernate.pyme.models.Cliente;


public class Controller2 {

	public void otroMetodo(Cliente unCliente) {
		
		EntityManager em = DBConfig.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
			unCliente.setRazonSocial("Josecito International INC");
			em.persist(unCliente);
		tx.commit();
		
	}
	
}
