package mysql;

import dao.AdDAO;
import domain.Ad;
import domain.Author;
import domain.Category;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.Root;
import java.time.LocalDate;
import java.util.List;

@Repository
@Transactional
public class MysqlAdDAO implements AdDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Ad ad) {
        em.persist(ad);
    }


    @Override
    public Ad getById(int id) {
        return em.find(Ad.class, id);
    }


    @Override
    public void update(Ad ad) {
        ad = em.merge(ad);
        save(ad);
    }


    @Override
    public void deleteById(int id) {
        Query query = em.createQuery("DELETE FROM Ad a WHERE a.id =:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public List<Ad> getByCategory(int id) {
        TypedQuery<Ad> query = em.createQuery("FROM Ad a WHERE a.category.id = :id", Ad.class);
        query.setParameter("id", id);
        return query.getResultList();
    }


    @Override
    public List<Ad> getByCategories(List<Integer> ids) {
        TypedQuery<Ad> query = em.createQuery("FROM Ad a WHERE a.category.id IN :ids", Ad.class);
//        Query query = em.createQuery("FROM Ad a WHERE a.category.id IN :ids", Ad.class);
        query.setParameter("ids", ids);
        List<Ad> list = query.getResultList();
        return list;
    }


    @Override
    public List<Ad> getAll() {
        TypedQuery<Ad> query = em.createQuery("FROM Ad", Ad.class);
        return query.getResultList();
    }


    @Override
    public List<Ad> getByAuthor(int id) {
        TypedQuery<Ad> query = em.createQuery("FROM Ad a WHERE a.author.id=:id", Ad.class);
        TypedQuery<Ad> paramId = query.setParameter("id", id);
        return paramId.getResultList();
    }


    public List<Ad> getByDate(LocalDate date) {
        TypedQuery<Ad> query = em.createQuery("FROM Ad a WHERE a.date=:wildcard", Ad.class);
        TypedQuery<Ad> paramDate = query.setParameter("wildcard", date);
        return paramDate.getResultList();
    }


    @Override
    public List<Ad> getByKeyWord(String word) {
        TypedQuery<Ad> query = em.createQuery("FROM Ad a WHERE a.name LIKE :word", Ad.class);
        TypedQuery<Ad> paramWord = query.setParameter("word", '%' + word + '%');
        return paramWord.getResultList();
    }
}



