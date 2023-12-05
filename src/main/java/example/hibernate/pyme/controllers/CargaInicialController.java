package example.hibernate.pyme.controllers;
import java.time.LocalDateTime;

import example.hibernate.pyme.models.*;
import example.hibernate.pyme.services.*;
import example.hibernate.pyme.controllers.*;
import java.util.Date;
public class CargaInicialController {
    public void cargarDatosIniciales() {
        // limpiar consola
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("********************************************************************************");
        System.out.println("         CARGA INICIAL DEL LOTE DE DATOS DE LAS TABLAS DEL SISTEMA");
        System.out.println("********************************************************************************"); 
        System.out.println("            ...el proceso se iniciara en breves instantes... ");

        // creo un servicio
		Servicio unServicio = new Servicio("Internet 5G","Descripcion de 5G");
		ServicioService servicioService = new ServicioService();
		servicioService.create(unServicio);
		
		Servicio otroServicio = servicioService.findOne(1); 
		System.out.println("********************************************************************************"); 
		System.out.println("     " + otroServicio.toString());
	    System.out.println("********************************************************************************"); 

	//creo un cliente
	
		Cliente unCliente = new Cliente("Costco", 123456789, "info@costco.com");
		ClienteService clienteService = new ClienteService();
        
        try{
		clienteService.create(unCliente);
            }catch(Exception e){
            System.out.println("----No se pudo crear el cliente----");
            }
        try{
		Cliente otroCliente = clienteService.findOne(1); 
		System.out.println("********************************************************************************"); 
		System.out.println("     " + otroCliente.toString());
		System.out.println("********************************************************************************"); 
            }catch(Exception e){
                System.out.println("----No se encontró el cliente----");
            }


		//creo un servicio contratado
		ServicioContratado unServicioContratado =  new ServicioContratado(unCliente, new Date(), new Date(), 10, unServicio);
		ServicioContratadoService servicioContratadoService = new ServicioContratadoService();
        try{
            servicioContratadoService.create(unServicioContratado);
        }
        catch(Exception e){
            System.out.println("----No se pudo crear el servicio contratado----");
        }

        try {
		ServicioContratado otroServicioContratado = servicioContratadoService.findOne(1);
		System.out.println("********************************************************************************");
		System.out.println("     " + otroServicioContratado.toString());
		System.out.println("********************************************************************************");
        }
        catch(Exception e){
            System.out.println("----No se encontró el servicio contratado----");
        }

        //creo una especialidad
                
        Especialidad unaEspecialidad = new Especialidad("especialista en redes", "mantiene y repara redes");
        EspecialidadService especialidadService = new EspecialidadService();
        try {
            especialidadService.create(unaEspecialidad);
        }
        catch(Exception e){
            System.out.println("----No se pudo crear la especialidad----");
        }
        try {
            Especialidad otraEspecialidad = especialidadService.findOne(1);
            System.out.println("********************************************************************************");
            System.out.println("     " + otraEspecialidad.toString());
            System.out.println("********************************************************************************");
        }
        catch(Exception e){
            System.out.println("----No se encontró la especialidad----");
        }

        //Creo un técnico
        Tecnico unTecnico = new Tecnico("Gerardo","Martinez","Whatsapp");
        TecnicoService tecnicoService = new TecnicoService();
        try {
            tecnicoService.create(unTecnico);
        }
        catch(Exception e){
            System.out.println("----No se pudo crear el técnico----");
        }
        try{
            Tecnico otroTecnico = tecnicoService.findOne(1);
            System.out.println("********************************************************************************");
            System.out.println("     " + otroTecnico.toString());
            System.out.println("********************************************************************************");
        }catch(Exception e){
                System.out.println("----No se encontró el técnico----");
            }

        //Creo un Problema
        Problema unProblema = new Problema("problema para conectar con la pagina","cuando me quiero conectar con la pagina me tira error 404",5);
        ProblemaService problemaService = new ProblemaService();
        try {
            problemaService.create(unProblema);
        }
        catch(Exception e){
            System.out.println("----No se pudo crear el problema----");
        }
        try{
            Problema otroProblema = problemaService.findOne(1);
            System.out.println("********************************************************************************");
            System.out.println("     " + otroProblema.toString());
            System.out.println("********************************************************************************");
        }catch(Exception e){
            System.out.println("----No se encontró el problema----");
        }
                
        //Creo un Tipo de Problema
        TipoDeProblema unTipodeProblema = new TipoDeProblema("Problema de conexión","se refiere a todos los problemas relacionados con la conexión a la página");
        TipoDeProblemaService tipoDeProblemaService = new TipoDeProblemaService();
        try {
            tipoDeProblemaService.create(unTipodeProblema);
        }
        catch(Exception e){
            System.out.println("----No se pudo crear el tipo de problema----");
        }
        try{
                TipoDeProblema otroTipoDeProblema = tipoDeProblemaService.findOne(1);
                System.out.println("********************************************************************************");
                System.out.println("     " + otroTipoDeProblema.toString());
                System.out.println("********************************************************************************");
            }catch(Exception e){
                System.out.println("----No se encontró el tipo de problema----");
            }
            
        //creo un mensaje
            Mensaje unMensaje = new Mensaje("mensaje 1", "este es el cuerpo del mensaje 1", LocalDateTime.now(), Boolean.TRUE, unTecnico);
            MensajeService mensajeService  = new MensajeService();
            try {
                mensajeService.create(unMensaje);
                            try {
                                    Mensaje otroMensaje = mensajeService.findOne(1);
                                    System.out.println("********************************************************************************");
                                    System.out.println("     " + otroMensaje.toString());
                                    System.out.println("********************************************************************************");
                                }
                            catch(Exception e){
                                   System.out.println("----No se encontró el mensaje----");
                                }
                }
                catch(Exception e){
                System.out.println("----No se pudo crear el mensaje----");
                }
}
}
