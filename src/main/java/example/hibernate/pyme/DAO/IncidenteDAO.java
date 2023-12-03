package example.hibernate.pyme.DAO;

import example.hibernate.pyme.models.Incidente;


public class IncidenteDAO extends AbstractJpaDAO< Incidente >{
    public IncidenteDAO(){
        setClazz(Incidente.class );
    }

}
