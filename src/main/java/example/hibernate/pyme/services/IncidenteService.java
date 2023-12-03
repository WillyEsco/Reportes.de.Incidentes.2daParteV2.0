package example.hibernate.pyme.services;


import java.util.List;


import example.hibernate.pyme.DAO.IncidenteDAO;
import example.hibernate.pyme.models.Incidente;



public class IncidenteService {

	private IncidenteDAO dao = new IncidenteDAO();
	

    public void create(Incidente entity) {
        dao.create(entity);
    }

    // update
    public void update(Incidente entity) {
        dao.update(entity);
    }
    // delete
    public void delete(Incidente entity) {
        dao.delete(entity);
    }
    // find by id

    public Incidente findOne(int id) {
        return dao.findOne(id);
    }

      public List<Incidente> findAll() {
        return dao.findAll();
    }
	
}
