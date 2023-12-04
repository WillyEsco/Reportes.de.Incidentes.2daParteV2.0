package example.hibernate.pyme.DAO;


import example.hibernate.pyme.models.ServicioContratado;


public class ServicioContratadoDAO extends AbstractJpaDAO< ServicioContratado > {
    public ServicioContratadoDAO(){
        setClazz(ServicioContratado.class );
    }

}
