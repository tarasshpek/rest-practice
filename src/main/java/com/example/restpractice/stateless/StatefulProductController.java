package com.example.restpractice.stateless;

import com.example.restpractice.rest.Product;
import com.example.restpractice.rest.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StatefulProductController {

    @Autowired
    private ProductRepository repository;

    private List<Product> products = new ArrayList<>();

    @GetMapping
    public List<Product> products() {
        return products;
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        products.add(product);
        return repository.save(product);
    }

}
