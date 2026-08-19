package com.luciggl.dev.SistemaRestaurante.entities;

import com.luciggl.dev.SistemaRestaurante.enums.ProductCategory;
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
    @Column(name = "category_product", nullable = false)
    @Enumerated(EnumType.STRING)
    private ProductCategory category;

    public ProductEntity(String name, String description, BigDecimal price, String image, Boolean available, ProductCategory category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.available = available;
        this.category = category;
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

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
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
