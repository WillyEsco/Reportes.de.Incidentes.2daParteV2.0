package example.hibernate.pyme.DAO;

import example.hibernate.pyme.models.Servicio;


public class ServicioDAO extends AbstractJpaDAO< Servicio >{
    public ServicioDAO(){
        setClazz(Servicio.class );
    }

}
