package service;

import dao.CategoryDAO;
import dao.DAOFactory;
import domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CrudService<Category>{
    @Autowired
    private CategoryDAO categoryDAO;

    public CategoryServiceImpl() {
        categoryDAO = DAOFactory.getDAOFactory(1).getCategoryDAO();
    }

    @Override
    public Category getById(int id) {
        return categoryDAO.getById(id);
    }


    @Override
    public void update(Category category) {
        categoryDAO.update(category);
    }


    @Override
    public void save(Category category) {
        categoryDAO.save(category);
    }


    @Override
    public void deleteById(int id) {
        categoryDAO.deleteById(id);
    }
}
