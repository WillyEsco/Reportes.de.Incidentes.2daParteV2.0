package example.hibernate.pyme.DAO;

import example.hibernate.pyme.models.Servicio;


import java.util.*;
import java.util.stream.Collectors;

public class ServicioDAO extends AbstractJpaDAO< Servicio >{
    public ServicioDAO(){
        setClazz(Servicio.class );
    }

}
