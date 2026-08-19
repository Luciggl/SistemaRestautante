package com.luciggl.dev.SistemaRestaurante.repositories;

import com.luciggl.dev.SistemaRestaurante.entities.ProductEntity;
import com.luciggl.dev.SistemaRestaurante.enums.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    List<ProductEntity> findByCategory(ProductCategory category);
}
