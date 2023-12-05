package example.hibernate.pyme.controllers;
import example.hibernate.pyme.models.*;
import example.hibernate.pyme.services.*;

import java.util.Scanner;
import java.time.*;


public class IncidenteController {
    private Incidente myIncidente;
    private IncidenteService incidenteService = new IncidenteService();


    public void cargarIncidente() {
// realizatr un ciclo para pedir repetitiva mente los datos de los incidentes
        // inicializar el scanner
        System.out.println("********************************************************************************");
        System.out.println("         SISTEMA DE GENERACION DE REPORTES DE INCIDENTES");
        System.out.println("********************************************************************************");
         
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        // ciclo repetitivo para pedir los datos de los incidentes
        System.out.println("Presione una tecla para continuar...\n\n\n\n\n");
        scanner.nextLine();

        while (continuar) {
            // llamar al metodo cargar incidente 
            IncidenteController incidenteController = new IncidenteController();
            incidenteController.generarIncidente();

            // preguntar si se desea continuar
            System.out.println("Desea continuar? (S/N)");
            // input por consola del dato , en este caso la respuesta        
            String unaRespuesta = scanner.nextLine();
            // si la respuesta es S, se continua con el ciclo
            if (unaRespuesta.toUpperCase().equals("S")) {
                continuar = true;
            } else {
                // si la respuesta es N, se termina el ciclo
                continuar = false;
            }
        }
        // cerrar scanner
        scanner.close();

    }
    public  void generarIncidente(){
        Boolean complejidad = false;
        
        Scanner scanner = new Scanner(System.in);
        this.myIncidente = new Incidente();
        this.incidenteService = new IncidenteService();

        // ingresar la descripcion del cliente
        System.out.println("Ingrese la DESCRIPCION del cliente");
        String unaDescripcion = scanner.nextLine();
        myIncidente.setDescripcionCliente(unaDescripcion);
        System.out.println("********************************************************************************");
        System.out.println("   Descripción del cliente:  " + unaDescripcion );
        System.out.println("********************************************************************************\n\n\n");

        // ingresar el cliente, pedir por consola el id del cliente
        System.out.println("Ingrese el ID del CLIENTE:");
        scanner = new Scanner(System.in);
        int unClienteID = scanner.nextInt();
        ClienteService clienteService = new ClienteService();
        Cliente unCliente = clienteService.findOne(unClienteID);
        System.out.println("********************************************************************************");
        System.out.println(" Cliente ID " + unCliente.getId() + " " + unCliente.getRazonSocial());
        System.out.println("********************************************************************************\n\n\n");
        myIncidente.setCliente(unCliente);

        // ingresar el servicio, pedir por consola el id del servicio
        System.out.println("Ingrese el ID del SERVICIO");
        int unServicioID = scanner.nextInt();
        ServicioService servicioService = new ServicioService();
        Servicio unServicio = servicioService.findOne(unServicioID);
        System.out.println("********************************************************************************");
        System.out.println(" Servicio ID " + unServicio.getId() + " " + unServicio.getNombre());
        System.out.println("********************************************************************************\n\n\n");
        myIncidente.setServicio(unServicio);

        // ingresar el problema, pedir por consola el id del problema
        System.out.println("Ingrese el ID del PROBLEMA");
        int unProblemaID = scanner.nextInt();
        ProblemaService problemaService = new ProblemaService();
        Problema unProblema = problemaService.findOne(unProblemaID);
        System.out.println("********************************************************************************");
        System.out.println(" Problema ID " + unProblema.getIdProblema() + " " + unProblema.getDescripcion());
        System.out.println("********************************************************************************\n\n\n");
        myIncidente.setProblema(unProblema);


         // ingresar el tecnico
        System.out.println("Ingrese el ID del TECNICO");
        int unTecnicoID = scanner.nextInt();
        TecnicoService tecnicoService = new TecnicoService();
        Tecnico unTecnico = tecnicoService.findOne(unTecnicoID);
        System.out.println("********************************************************************************");
        System.out.println("   Tecnico ID " + unTecnico.getIdTecnico() + " Nombre: " + unTecnico.getNombre());
        System.out.println("********************************************************************************\n\n\n");
        myIncidente.setTecnico(unTecnico);
 
        // ingresar la consideracion
        System.out.println("Ingrese la CONSIDERACION:");
        scanner = new Scanner(System.in);
        String unaConsideracion = scanner.nextLine();
        myIncidente.setConsideracion(unaConsideracion);
        System.out.println("********************************************************************************");
        System.out.println("   Consideración del Técnico:  " + unaConsideracion );
        System.out.println("********************************************************************************\n\n\n");
 
   
        // ingresar la complejidad
        System.out.println("Ingrese la COMPLEJIDAD, Si es Alta indique 'S' ");
        scanner = new Scanner(System.in);
        String unaComplejidad = scanner.nextLine();
        if (unaComplejidad.toUpperCase().equals("S")) {
            myIncidente.setComplejidadAlta(true);
            complejidad = true;
        } else {
            myIncidente.setComplejidadAlta(false);
            complejidad = false;
        }
        System.out.println("********************************************************************************");
        System.out.println(" INCIDENTE de complejidad: " + complejidad + " según calificacion del técnico");
        System.out.println("********************************************************************************\n\n\n");
        myIncidente.setComplejidadAlta(complejidad);
        
        // ingresar el estado
        System.out.println("Ingrese el estado (INICIADO, ASIGNADO, PENDIENTE, CURSADO, , DERIVADO, RESUELTO, CERRADO))");
        String unEstado = scanner.nextLine();
        myIncidente.setEstado(unEstado);
        System.out.println("\n\n\n\n\n\n\n********************************************************************************");
        System.out.println(" Registrado con el estado:  " + unEstado );
        System.out.println("********************************************************************************\n\n\n\n\n\n\n");

        myIncidente.setFechaAsignacion(LocalDateTime.now());
        myIncidente.setFechaCreacion(LocalDateTime.now());
  
        try{
            incidenteService.create(myIncidente);
		    System.out.println("********************************************************************************");
		    System.out.println("       INCIDENTE GENERADO CON EXITO "  );
		    System.out.println("********************************************************************************\n\n\n");
        }
        catch(Exception e){
            System.out.println("----No se pudo crear el INCIDENTE----");
        }
    
    }


}
