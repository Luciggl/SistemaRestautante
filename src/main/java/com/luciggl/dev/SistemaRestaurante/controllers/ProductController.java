package com.luciggl.dev.SistemaRestaurante.controllers;

import com.luciggl.dev.SistemaRestaurante.entities.ProductEntity;
import com.luciggl.dev.SistemaRestaurante.enums.ProductCategory;
import com.luciggl.dev.SistemaRestaurante.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("/create")
    public HttpStatus createProduct(@RequestBody ProductEntity product){
        return service.createProduct(product);
    }

    @GetMapping("/all")
    public Optional<List<ProductEntity>> getAllProduct(){
        return service.getProducts();
    }

    @GetMapping("/id/{id}")
    public Optional<ProductEntity> getProductById(@PathVariable Long id){
        return service.getProductById(id);
    }

    @GetMapping("/category/{category}")
    public List<ProductEntity> getProductByCategory(@PathVariable ProductCategory category){
        return service.getProductByCategory(category);
    }
}
