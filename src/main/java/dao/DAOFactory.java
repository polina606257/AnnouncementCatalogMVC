package dao;

import mysql.MysqlDAOFactory;

public abstract class DAOFactory {
    public static final int MYSQL = 1;

    public abstract CategoryDAO getCategoryDAO();
    public abstract AdDAO getAdDAO();
    public abstract AuthorDAO getAuthorDAO();

    public static DAOFactory getDAOFactory(int id) {
        switch (id) {
            case MYSQL:
                return new MysqlDAOFactory();
            default:
                return null;
        }
    }
}
