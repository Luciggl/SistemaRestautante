package com.luciggl.dev.SistemaRestaurante.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "tb_product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product", unique = true)
    private Long id;
    @Column(name = "name_product", unique = true, nullable = false)
    private String name;
    @Column(name = "description_product", nullable = false)
    private String description;
    @Column(name = "price_product", nullable = false)
    private BigDecimal price;
    @Column(name = "img_product", unique = true, nullable = false)
    private String image;
    @Column(name = "available_product", nullable = false)
    private Boolean available;

    public ProductEntity() {
    }

    public ProductEntity(String name, String description, BigDecimal price, String image, Boolean available) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.available = available;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity product = (ProductEntity) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
