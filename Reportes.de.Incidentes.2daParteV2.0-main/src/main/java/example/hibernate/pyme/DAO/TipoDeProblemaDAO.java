package example.hibernate.pyme.DAO;

import example.hibernate.pyme.models.Problema;
import example.hibernate.pyme.models.TipoDeProblema;

public class TipoDeProblemaDAO extends AbstractJpaDAO<TipoDeProblema>{
    public TipoDeProblemaDAO(){
        setClazz(TipoDeProblema.class );
    }

}