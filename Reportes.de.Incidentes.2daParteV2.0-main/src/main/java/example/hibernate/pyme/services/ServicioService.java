package example.hibernate.pyme.services;
import java.util.List;
import example.hibernate.pyme.DAO.ServicioDAO;
import example.hibernate.pyme.models.Servicio;


public class ServicioService {

	private ServicioDAO dao = new ServicioDAO();
	

    public void create(Servicio entity) {
        dao.create(entity);
    }

    // update
    public void update(Servicio entity) {
        dao.update(entity);
    }
    // delete
    public void delete(Servicio entity) {
        dao.delete(entity);
    }
    // find by id

    public Servicio findOne(int id) {
        return dao.findOne(id);
    }

      public List<Servicio> findAll() {
        return dao.findAll();
    }
	
}
