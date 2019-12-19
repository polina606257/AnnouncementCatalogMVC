package service;

import dao.AuthorDAO;
import dao.DAOFactory;
import domain.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements CrudService<Author> {
    @Autowired
    private AuthorDAO authorDAO;

    public AuthorServiceImpl() {
        authorDAO = DAOFactory.getDAOFactory(1).getAuthorDAO();
    }

    @Override
    public void save(Author author) {
        authorDAO.save(author);
    }


    @Override
    public void update(Author author) {
        authorDAO.update(author);
    }


    @Override
    public Author getById(int id) {
        return authorDAO.getById(id);
    }


    @Override
    public void deleteById(int id) {
        authorDAO.deleteById(id);
    }
}
