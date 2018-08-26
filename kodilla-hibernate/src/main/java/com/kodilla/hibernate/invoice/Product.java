package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PRODUCTS")
public class Product {
    private int id;
    private String name;
    private List<Item> items = new ArrayList<>();;

    public Product() {
    }

    public Product(final String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "PRODUCT_ID", unique = true)
    public int getId() {
        return id;
    }

    private void setId(final int id) {
        this.id = id;
    }

    @Column(name = "NAME")
    @NotNull
    public String getName() {
        return name;
    }

    private void setName(final String name) {
        this.name = name;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    public void setItems(final List<Item> items) {
        this.items = items;
    }


}
