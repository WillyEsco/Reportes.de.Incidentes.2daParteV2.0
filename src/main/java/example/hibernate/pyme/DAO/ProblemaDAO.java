package example.hibernate.pyme.DAO;

import example.hibernate.pyme.models.Problema;

public class ProblemaDAO extends AbstractJpaDAO<Problema>{
    public ProblemaDAO(){
        setClazz(Problema.class );
    }
}
