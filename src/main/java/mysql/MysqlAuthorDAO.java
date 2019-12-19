package mysql;

import dao.AuthorDAO;
import domain.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

@Repository
@Transactional
public class MysqlAuthorDAO implements AuthorDAO {

    @PersistenceContext
    private EntityManager em;

    @PersistenceUnit
    private EntityManagerFactory emf;

    @Override
    public void save(Author author) {
        em.persist(author);
    }


    @Override
    public Author getById(int id) {
        return em.find(Author.class, id);
    }


    @Override
    public void update(Author author) {
        author = em.merge(author);
        save(author);
    }


    @Override
    public void deleteById(int id) {
        Query query = em.createQuery("DELETE FROM Ad a WHERE a.author.id = :id");
        query.setParameter("id", id).executeUpdate();
        Query query1 = em.createQuery("DELETE FROM Author c WHERE c.id = :id");
        query1.setParameter("id", id).executeUpdate();
    }
}

