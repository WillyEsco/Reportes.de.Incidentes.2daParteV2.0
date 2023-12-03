package example.hibernate.pyme;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import example.hibernate.pyme.config.DBConfig;
/* import example.hibernate.pyme.models.Direccion;
import example.hibernate.pyme.models.Empleado; */
import example.hibernate.pyme.models.*;

import example.hibernate.pyme.services.*;

public class App 
{
        public static void main(String[] args) {
/*                 EmpleadoService empleadoService = new EmpleadoService();
                DireccionService direccionService = new DireccionService(); */


    
                //creo una especialidad
                Especialidad unaEspecialidad = new Especialidad("especialista en redes", "mantiene y repara redes");
                EspecialidadService especialidadService = new EspecialidadService();
                especialidadService.create(unaEspecialidad);
                Especialidad otraEspecialidad = especialidadService.findOne(1);
                System.out.println("********************************************************************************");
                System.out.println("     " + otraEspecialidad.toString());
                System.out.println("********************************************************************************");

                //Creo un técnico
                Tecnico unTecnico = new Tecnico("Gerardo","Martinez","Whatsapp");
                TecnicoService tecnicoService = new TecnicoService();
                tecnicoService.create(unTecnico);
                try{
                        Tecnico otroTecnico = tecnicoService.findOne(11);
                        System.out.println("********************************************************************************");
                        System.out.println("     " + otroTecnico.toString());
                        System.out.println("********************************************************************************");
                }catch(Exception e){
                        System.out.println("No se encontró el técnico");
                }

                //Creo un Problema
                Problema unProblema = new Problema("problema para conectar con la pagina","cuando me quiero conectar con la pagina me tira error 404",5);
                ProblemaService problemaService = new ProblemaService();
                problemaService.create(unProblema);
                try{
                        Problema otroProblema = problemaService.findOne(1);
                        System.out.println("********************************************************************************");
                        System.out.println("     " + otroProblema.toString());
                        System.out.println("********************************************************************************");
                }catch(Exception e){
                        System.out.println("No se encontró el problema");
                }
                //Creo un Tipo de Problema
                TipoDeProblema unTipodeProblema = new TipoDeProblema("Problema de conexión","se refiere a todos los problemas relacionados con la conexión a la página");
                TipoDeProblemaService tipoDeProblemaService = new TipoDeProblemaService();
                tipoDeProblemaService.create(unTipodeProblema);
                try{
                        TipoDeProblema otroTipoDeProblema = tipoDeProblemaService.findOne(1);
                        System.out.println("********************************************************************************");
                        System.out.println("     " + otroTipoDeProblema.toString());
                        System.out.println("********************************************************************************");
                }catch(Exception e){
                        System.out.println("No se encontró el tipo de problema");
                }



 

        }




}
