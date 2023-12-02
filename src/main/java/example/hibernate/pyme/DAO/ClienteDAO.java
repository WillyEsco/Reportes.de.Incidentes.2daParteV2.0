package example.hibernate.pyme.DAO;

import example.hibernate.pyme.models.Cliente;
import example.hibernate.pyme.models.Rol;

import java.util.*;
import java.util.stream.Collectors;

public class ClienteDAO extends AbstractJpaDAO< Cliente >{
    public ClienteDAO(){
        setClazz(Cliente.class );
    }

}
