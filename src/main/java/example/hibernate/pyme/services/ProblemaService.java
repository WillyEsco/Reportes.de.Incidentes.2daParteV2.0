package example.hibernate.pyme.services;

import example.hibernate.pyme.DAO.ProblemaDAO;
import example.hibernate.pyme.models.Problema;


import java.util.List;

public class ProblemaService {
    private ProblemaDAO dao = new ProblemaDAO();


    public void create(Problema entity) {
        dao.create(entity);
    }

    // update
    public void update(Problema entity) {
        dao.update(entity);
    }
    // delete
    public void delete(Problema entity) {
        dao.delete(entity);
    }
    // find by id

    public Problema findOne(int id) {
        return dao.findOne(id);
    }

    public List<Problema> findAll() {
        return dao.findAll();
    }
}
