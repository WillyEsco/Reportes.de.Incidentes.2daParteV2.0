package example.hibernate.pyme.DAO;

import example.hibernate.pyme.config.DBConfig;
import example.hibernate.pyme.models.Cliente;
import example.hibernate.pyme.models.Tecnico;

import javax.persistence.EntityTransaction;

public class TecnicoDAO extends AbstractJpaDAO<Tecnico>{
    public TecnicoDAO(){ setClazz(Tecnico.class); }
}
