package dao;

import domain.Ad;
import java.time.LocalDate;
import java.util.List;

public interface AdDAO {

    void save(Ad ad);

    Ad getById(int id);

    void update(Ad ad);

    void deleteById(int id);

    List<Ad> getByCategory(int id);

    List<Ad> getByCategories(List<Integer> ids);

    List<Ad> getAll();

    List<Ad> getByAuthor(int id);

    List<Ad> getByDate(LocalDate date);

    List<Ad> getByKeyWord(String word);
}