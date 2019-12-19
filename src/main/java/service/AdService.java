package service;

import domain.Ad;
import dto.AdDTO;

import java.time.LocalDate;
import java.util.List;

public interface AdService<M> extends CrudService<Ad> {

    List<Ad> getByCategory(int id);

    List<Ad> getByCategories(List<Integer> ids);

    List<AdDTO> getAll();

    List<Ad> getByAuthor(int id);

    List<Ad> getByDate(LocalDate date);

    List<Ad> getByKeyWord(String word);


}
