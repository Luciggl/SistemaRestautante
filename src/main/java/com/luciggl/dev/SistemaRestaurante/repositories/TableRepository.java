package com.luciggl.dev.SistemaRestaurante.repositories;

import com.luciggl.dev.SistemaRestaurante.entities.TableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepository extends JpaRepository<TableEntity, Long> {
    TableEntity findTableByNumber(int number);
}
