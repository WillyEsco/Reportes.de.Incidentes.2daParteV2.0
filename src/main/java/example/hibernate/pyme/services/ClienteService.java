package example.hibernate.pyme.services;


import java.util.List;


import example.hibernate.pyme.DAO.ClienteDAO;
import example.hibernate.pyme.models.Cliente;



public class ClienteService {

	private ClienteDAO dao = new ClienteDAO();
	

    public void create(Cliente entity) {
        dao.create(entity);
    }

    // update
    public void update(Cliente entity) {
        dao.update(entity);
    }
    // delete
    public void delete(Cliente entity) {
        dao.delete(entity);
    }
    // find by id

    public Cliente findOne(int id) {
        return dao.findOne(id);
    }

      public List<Cliente> findAll() {
        return dao.findAll();
    }
	
}
