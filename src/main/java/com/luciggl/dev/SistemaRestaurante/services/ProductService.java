package com.luciggl.dev.SistemaRestaurante.services;

import com.luciggl.dev.SistemaRestaurante.entities.ProductEntity;
import com.luciggl.dev.SistemaRestaurante.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Optional<List<ProductEntity>> getProducts(){
        return Optional.of(repository.findAll());
    }
}
