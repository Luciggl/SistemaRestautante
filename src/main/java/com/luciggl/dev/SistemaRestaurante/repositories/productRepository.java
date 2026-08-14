package com.luciggl.dev.SistemaRestaurante.repositories;

import com.luciggl.dev.SistemaRestaurante.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository<ProductEntity, Long> {
}
