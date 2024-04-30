package com.bootcamp.mod3c1.demo.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.bootcamp.mod3c1.demo.models.Category;


@RestController
public class CategoryController {
    
    private List<Category> categoriesList = Arrays.asList(new Category(1, "Produção Própria"), 
                                                          new Category(2, "Nacional"), 
                                                          new Category(3, "Importado")
    );

    @GetMapping("/categories")
    public List<Category> getCategory() {
        return categoriesList;
    }

    @GetMapping("/categories/{id}")
    public ResponseEntity<Category> getProduct(@PathVariable Integer id) {

        Category category = categoriesList.stream()
                                          .filter(c -> c.getId() == id).findFirst()
                                          .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Sorry, category not found :/"));

        return ResponseEntity.ok(category);
    } 
}
