package example.hibernate.pyme.controllers;

import example.hibernate.pyme.models.Cliente;
import example.hibernate.pyme.models.Incidente;
import example.hibernate.pyme.services.ClienteService;
import example.hibernate.pyme.services.IncidenteService;


public class Controller1 {

	public void unMetodo(Cliente unCliente) {
		
		ClienteService clienteService = new ClienteService();
		
		unCliente.setRazonSocial("Josécito");
		
		clienteService.create(unCliente);

		IncidenteService incidenteService = new IncidenteService();
		
		incidenteService.create(new Incidente());
				
	}
	
	
}
