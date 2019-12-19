package controller;

import domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import service.CrudService;

@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    @Qualifier("categoryServiceImpl")
    private CrudService<Category> service;

    @PostMapping("/save")
    public void save(@RequestBody Category category) {
        service.save(category);
    }

    @GetMapping("/get/{id}")
    public Category get(@PathVariable int id) {
        return service.getById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Category category) {
        service.update(category);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        service.deleteById(id);
    }
}

