package dao;

import domain.Category;

public interface CategoryDAO {

    void save(Category category);

    Category getById(int id);

    void update(Category category);

    void deleteById(int id);
}

