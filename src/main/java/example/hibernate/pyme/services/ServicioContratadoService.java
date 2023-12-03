package example.hibernate.pyme.services;


import java.util.List;


import example.hibernate.pyme.DAO.*;
import example.hibernate.pyme.models.*;



public class ServicioContratadoService {

	private ServicioContratadoDAO dao = new ServicioContratadoDAO();
	

    public void create(ServicioContratado entity) {
        dao.create(entity);
    }

    // update
    public void update(ServicioContratado entity) {
        dao.update(entity);
    }
    // delete
    public void delete(ServicioContratado entity) {
        dao.delete(entity);
    }
    // find by id

    public  ServicioContratado findOne(int id) {
        return dao.findOne(id);
    }

      public List<ServicioContratado> findAll() {
        return dao.findAll();
    }
	
}
