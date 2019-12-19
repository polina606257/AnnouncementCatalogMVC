package mysql;

import dao.CategoryDAO;
import domain.Category;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;


@Repository
@Transactional
public class MysqlCategoryDAO implements CategoryDAO {

    @PersistenceContext
    private EntityManager em;

    @PersistenceUnit
    private EntityManagerFactory emf;

    @Override
    public void save(Category category) {
            em.persist(category);
        }


    @Override
    public Category getById(int id) {
        return em.find(Category.class, id);
    }


    @Override
    public void update(Category category) {
        category = em.merge(category);
        save(category);
    }


    @Override
    public void deleteById(int id) {
        Query query = em.createQuery("DELETE FROM Ad a WHERE a.category.id = :id");
        query.setParameter("id", id).executeUpdate();
        Query query1 = em.createQuery("DELETE FROM Category c WHERE c.id = :id");
        query1.setParameter("id", id).executeUpdate();
    }
}

