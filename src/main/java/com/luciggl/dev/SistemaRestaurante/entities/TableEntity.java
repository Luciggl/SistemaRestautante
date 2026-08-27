package com.luciggl.dev.SistemaRestaurante.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class TableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int tableNumber;
    boolean tax;
    @OneToMany(
            mappedBy = "table",
            cascade = CascadeType.ALL
    )
    private List<OrderEntity> orders;

    public TableEntity(int tableNumber){
        this.tableNumber = tableNumber;
    }

    public TableEntity(int tableNumber, List<OrderEntity> orders, boolean tax) {
        this.tableNumber = tableNumber;
        this.orders = orders;
        this.tax = tax;
    }

    public Long getId() {
        return id;
    }


    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public boolean isTax() {
        return tax;
    }

    public void setTax(boolean tax) {
        this.tax = tax;
    }

    public List<OrderEntity> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderEntity> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TableEntity that = (TableEntity) o;
        return tableNumber == that.tableNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tableNumber);
    }
}
