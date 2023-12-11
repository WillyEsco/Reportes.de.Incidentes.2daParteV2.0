package example.hibernate.pyme;

import example.hibernate.pyme.controllers.*;

 

public class App 
{
	public static void main(String[] args) {
        // limpiar consola

        System.out.print("\033[H\033[2J");
        System.out.flush();
       
        CargaInicialController cargaInicialController = new CargaInicialController();
        cargaInicialController.cargarDatosIniciales();

        System.out.println("********************************************************************************");
        System.out.println("                 FIN DE CARGA INICIAL DE DATOS DEL SISTEMA");
        System.out.println("********************************************************************************");
               
        System.out.println(" \n\n\n\n\n\n");
        
        IncidenteController incidenteController = new IncidenteController();
        incidenteController.cargarIncidente();

        }
	
}

