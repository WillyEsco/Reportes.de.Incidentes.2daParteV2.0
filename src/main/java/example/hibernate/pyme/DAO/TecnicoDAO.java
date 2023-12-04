package example.hibernate.pyme.DAO;

import example.hibernate.pyme.models.Tecnico;



public class TecnicoDAO extends AbstractJpaDAO<Tecnico>{
    public TecnicoDAO(){ setClazz(Tecnico.class); }
}
