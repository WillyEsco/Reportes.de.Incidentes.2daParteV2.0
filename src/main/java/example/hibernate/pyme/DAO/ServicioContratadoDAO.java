package example.hibernate.pyme.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;


import example.hibernate.pyme.models.ServicioContratado;


public class ServicioContratadoDAO extends AbstractJpaDAO< ServicioContratado > {
    public ServicioContratadoDAO(){
        setClazz(ServicioContratado.class );
    }

}
