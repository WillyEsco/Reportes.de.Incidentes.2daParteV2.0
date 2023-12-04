package example.hibernate.pyme.DAO;

import example.hibernate.pyme.models.*;


public class TipoDeProblemaDAO extends AbstractJpaDAO<TipoDeProblema>{
    public TipoDeProblemaDAO(){
        setClazz(TipoDeProblema.class );
    }

}
