
package example.hibernate.pyme.services;

import example.hibernate.pyme.DAO.MensajeDAO;
import example.hibernate.pyme.models.Mensaje;
import java.util.List;


public class MensajeService {
    	private MensajeDAO dao = new MensajeDAO();
	

    public void create(Mensaje entity) {
        dao.create(entity);
    }

    // update
    public void update(Mensaje entity) {
        dao.update(entity);
    }
    // delete
    public void delete(Mensaje entity) {
        dao.delete(entity);
    }
    // find by id

    public Mensaje findOne(int id) {
        return dao.findOne(id);
    }

    public List<Mensaje> findAll() {
        return dao.findAll();
    }
}
