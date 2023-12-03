package example.hibernate.pyme.services;

import example.hibernate.pyme.DAO.TecnicoDAO;
import example.hibernate.pyme.models.Tecnico;

import java.util.List;

public class TecnicoService {
    private TecnicoDAO dao = new TecnicoDAO();
    public void create(Tecnico entity) {
        dao.create(entity);
    }

    // update
    public void update(Tecnico entity) {
        dao.update(entity);
    }
    // delete
    public void delete(Tecnico entity) {
        dao.delete(entity);
    }
    // find by id

    public Tecnico findOne(int id) {
        return dao.findOne(id);
    }

    public List<Tecnico> findAll() {
        return dao.findAll();
    }

}
