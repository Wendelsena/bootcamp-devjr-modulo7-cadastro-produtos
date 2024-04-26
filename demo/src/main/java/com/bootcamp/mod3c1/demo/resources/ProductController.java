package com.bootcamp.mod3c1.demo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.bootcamp.mod3c1.demo.models.Product;

import jakarta.annotation.PostConstruct;

@RestController
public class ProductController {
    
    private List<Product> productList = new ArrayList<>();

    @PostConstruct
    public void init() {
        for(int i = 1; i <= 10; i++) {
            Product product = new Product(i, "Product " + i, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", i, false, true, 453.32 * i);
            productList.add(product);
        }
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productList;
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer id) {

        Product prod = productList.stream()
                                  .filter(p -> p.getId() == id).findFirst()
                                  .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Sorry, product not found :/"));

        return ResponseEntity.ok(prod);

    }
}
