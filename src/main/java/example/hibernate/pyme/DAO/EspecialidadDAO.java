
package example.hibernate.pyme.DAO;

import example.hibernate.pyme.models.Especialidad;

public class EspecialidadDAO extends AbstractJpaDAO<Especialidad> {

    public EspecialidadDAO() {
        setClazz(Especialidad.class);
    }
}
