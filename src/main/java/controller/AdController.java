package controller;

import domain.Ad;
import domain.Author;
import domain.Category;
import dto.AdDTO;
import dto.AuthorDTO;
import dto.CategoryDTO;
import dto.LocalDateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import service.AdService;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@RequestMapping("ad")
public class AdController {

    @Autowired
    private AdService<Ad> adService;

    @PostMapping("/save")
    public void save(@RequestBody Ad ad) {
        adService.save(ad);
    }

    @GetMapping("/get/{id}")
    public Ad get(@PathVariable int id) {
        return adService.getById(id);
    }

    @GetMapping("/get/dto/{id}")
    public AdDTO getDTO(@PathVariable int id) {
        Ad ad = adService.getById(id);
        return new AdDTO(ad);
    }

    @PutMapping("/update")
    public void update(@RequestBody Ad ad) {
        adService.update(ad);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        adService.deleteById(id);
    }

    @GetMapping("/get/by/category/{id}")
    public List<Ad> getByCategory(@PathVariable int id) {
        return adService.getByCategory(id);
    }

    @GetMapping("/get/by/categories/{ids}")
    public List<Ad> getByCategories(@PathVariable List<Integer> ids) {
        return adService.getByCategories(ids);
    }

    @GetMapping("/list")
    public List<AdDTO> getAllDTO() {
        return adService.getAll();
    }

    @GetMapping("/get/by/author/{id}")
    public List<Ad> getByAuthor(@PathVariable int id) {
        return adService.getByAuthor(id);
    }

    @PostMapping("/get/by/date")
    public List<Ad> getByDate(@RequestBody LocalDateDTO dto) {
        return adService.getByDate(dto.getDate());
    }

    @GetMapping("/get/by/key/words/{word}")
    public List<Ad> getByKeyWord(@PathVariable String word) {
        return adService.getByKeyWord(word);
    }
}
