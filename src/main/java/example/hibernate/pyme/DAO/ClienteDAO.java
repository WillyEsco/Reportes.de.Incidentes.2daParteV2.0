package example.hibernate.pyme.DAO;

import example.hibernate.pyme.models.Cliente;


public class ClienteDAO extends AbstractJpaDAO< Cliente >{
    public ClienteDAO(){
        setClazz(Cliente.class );
    }

}
