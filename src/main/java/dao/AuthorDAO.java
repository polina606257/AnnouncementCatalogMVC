package dao;

import domain.Author;

public interface AuthorDAO {

    void save(Author author);

    Author getById(int id);

    void update(Author author);

    void deleteById(int id);
}

