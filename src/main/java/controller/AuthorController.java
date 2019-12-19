package controller;

import domain.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import service.CrudService;

@RestController
@RequestMapping("author")
public class AuthorController {
    @Autowired
    @Qualifier("authorServiceImpl")
    private CrudService<Author> service;

    @PostMapping("/save")
    public void save(@RequestBody Author author) {
        service.save(author);
    }

    @GetMapping("/get/{id}")
    public Author get(@PathVariable int id) {
        return service.getById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Author author) {
        service.update(author);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        service.deleteById(id);
    }
}
