package example.hibernate.pyme.services;

import example.hibernate.pyme.DAO.TipoDeProblemaDAO;
import example.hibernate.pyme.models.TipoDeProblema;

import java.util.List;

public class TipoDeProblemaService {
    private TipoDeProblemaDAO dao = new TipoDeProblemaDAO();


    public void create(TipoDeProblema entity) {
        dao.create(entity);
    }

    // update
    public void update(TipoDeProblema entity) {
        dao.update(entity);
    }
    // delete
    public void delete(TipoDeProblema entity) {
        dao.delete(entity);
    }
    // find by id

    public TipoDeProblema findOne(int id) {
        return dao.findOne(id);
    }

    public List<TipoDeProblema> findAll() {
        return dao.findAll();
    }
}
