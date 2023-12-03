package example.hibernate.pyme.DAO;

import example.hibernate.pyme.models.Mensaje;

public class MensajeDAO extends AbstractJpaDAO<Mensaje> {

    public MensajeDAO() {
        setClazz(Mensaje.class);
    }
}
