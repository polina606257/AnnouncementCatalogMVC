package service;

import dao.AdDAO;
import dao.DAOFactory;
import domain.Ad;
import dto.AdDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdServiceImpl implements AdService<Ad> {

    @Autowired
    @Qualifier("mysqlAdDAO")
    private AdDAO adDAO;

    public AdServiceImpl() {
        adDAO = DAOFactory.getDAOFactory(1).getAdDAO();
    }

    @Override
    public void save(Ad ad) {
        adDAO.save(ad);
    }


    @Override
    public Ad getById(int id) {
        return adDAO.getById(id);
    }


    @Override
    public void update(Ad ad) {
        adDAO.update(ad);
    }


    @Override
    public void deleteById(int id) {
        adDAO.deleteById(id);
    }


    @Override
    public List<Ad> getByCategory(int id) {
        List<Ad> adsList = adDAO.getByCategory(id);
        return adsList;
    }


    @Override
    public List<Ad> getByCategories(List<Integer> ids) {
        List<Ad> adsList = adDAO.getByCategories(ids);
        return adsList;
    }


    @Override
    public List<AdDTO> getAll() {
        return adDAO.getAll().stream().map(AdDTO::new).collect(Collectors.toList());
    }


    @Override
    public List<Ad> getByAuthor(int id) {
        List<Ad> adsList = adDAO.getByAuthor(id);
        return adsList;
    }


    @Override
    public List<Ad> getByDate(LocalDate date) {
        List<Ad> adsList = adDAO.getByDate(date);
        return adsList;
    }


    @Override
    public List<Ad> getByKeyWord(String word) {
        List<Ad> adsList = adDAO.getByKeyWord(word);
        return adsList;
    }
}
