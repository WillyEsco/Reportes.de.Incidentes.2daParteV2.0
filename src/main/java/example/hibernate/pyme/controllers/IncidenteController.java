package example.hibernate.pyme.controllers;
import example.hibernate.pyme.models.*;
import example.hibernate.pyme.services.*;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;



public class IncidenteController {
    private Incidente myIncidente;
    private IncidenteService incidenteService = new IncidenteService();


    public static void cargarIncidente() {
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
            if (unaRespuesta.equals("S")) {
                continuar = true;
            } else {
                // si la respuesta es N, se termina el ciclo
                continuar = false;
            }
        }
        // cerrar scanner
        scanner.close();



    }
    public void generarIncidente(){
        String complejidad = "";
        
        Scanner scanner = new Scanner(System.in);
        this.myIncidente = new Incidente();
        this.incidenteService = new IncidenteService();
        // ingresar datos para el generar del incidente

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
        String unaConsideracion = scanner.nextLine();
        myIncidente.setConsideracion(unaConsideracion);
        System.out.println("********************************************************************************");
        System.out.println("   Consideración del Técnico:  " + unaConsideracion );
        System.out.println("********************************************************************************\n\n\n");
 
   
        // ingresar la complejidad
        System.out.println("Ingrese la COMPLEJIDAD, Si es Alta indique 'S' ");
        String unaComplejidad = scanner.nextLine();
        if (unaComplejidad.equals("S")) {
            myIncidente.setComplejidadAlta(true);
            complejidad = "ALTA";
        } else {
            myIncidente.setComplejidadAlta(false);
            complejidad = "STANDARD";
        }
        System.out.println("********************************************************************************");
        System.out.println(" INCIDENTE de complejidad: " + complejidad + " según calificacion del técnico");
        System.out.println("********************************************************************************\n\n\n");
        myIncidente.setComplejidadAlta(Boolean.parseBoolean(unaComplejidad));

      /* // ingresar el tiempo estimado
        System.out.println("Ingrese el tiempo estimado");
        // input por consola del dato , en este caso el tiempo estimado
        LocalTime unTiempoEstimado = scanner.nextLine();
        // asignar el tiempo estimado al incidente
        myIncidente.setTiempoEstimadoSistema(Integer.parseInt(unTiempoEstimado));

        // ingresar el tiempo utilizado
        System.out.println("Ingrese el tiempo utilizado");
        // input por consola del dato , en este caso el tiempo utilizado
        String unTiempoUtilizado = scanner.nextLine();
        // asignar el tiempo utilizado al incidente
        myIncidente.setTiempoUtilizadoTecnico(Integer.parseInt(unTiempoUtilizado)); */
        
        // ingresar el estado
        System.out.println("Ingrese el estado (INICIADO, ASIGNADO, PENDIENTE, CURSADO, , DERIVADO, RESUELTO, CERRADO))");
        String unEstado = scanner.nextLine();
        myIncidente.setEstado(unEstado);
        System.out.println("\n\n\n\n\n\n\n********************************************************************************");
        System.out.println(" Registrado con el estado:  " + unEstado );
        System.out.println("********************************************************************************\n\n\n\n\n\n\n");

  /*    //  ingresar la fecha de inicio
        System.out.println("Ingrese la fecha de inicio");
        // input por consola del dato , en este caso la fecha de inicio
        String unaFechaInicio = scanner.nextLine();
        // asignar la fecha de inicio al incidente */
        myIncidente.setFechaAsignacion(LocalDateTime.now());
        myIncidente.setFechaCreacion(LocalDateTime.now());

        // ingresar la fecha de fin
     //   System.out.println("Ingrese la fecha de fin");
        // input por consola del dato , en este caso la fecha de fin
      //  String unaFechaFin = scanner.nextLine()


   /*   // ingresar el tiempo extra
        System.out.println("Ingrese el tiempo extra");
        // input por consola del dato , en este caso el tiempo extra
        String unTiempoExtra = scanner.nextLine();
        // asignar el tiempo extra al incidente */
       // myIncidente.setTiempoExtra(Integer.parseInt(unTiempoExtra));  

  
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
