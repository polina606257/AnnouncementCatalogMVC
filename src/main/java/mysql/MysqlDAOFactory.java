package mysql;

import dao.AdDAO;
import dao.AuthorDAO;
import dao.CategoryDAO;
import dao.DAOFactory;

public class MysqlDAOFactory extends DAOFactory {

    @Override
    public CategoryDAO getCategoryDAO() {
        return new MysqlCategoryDAO();
    }

    @Override
    public AdDAO getAdDAO() {
        return new MysqlAdDAO();
    }

    @Override
    public AuthorDAO getAuthorDAO() {
        return new MysqlAuthorDAO();
    }
}
