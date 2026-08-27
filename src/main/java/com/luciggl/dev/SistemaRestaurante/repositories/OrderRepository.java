package com.luciggl.dev.SistemaRestaurante.repositories;

import com.luciggl.dev.SistemaRestaurante.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
