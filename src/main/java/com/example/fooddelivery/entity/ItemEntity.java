package com.example.fooddelivery.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "item")
@Data
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    private Long price;
    private String status;
    @Column(columnDefinition = "TEXT")
    private String ingredients;
    @OneToMany(mappedBy = "item")
    private Set<OrderItemEntity> orderItems= new HashSet<>();
    @ManyToMany
    @JoinTable(name = "item_category",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    @JsonIgnoreProperties("menuItems")
    private Set<CategoryEntity> category = new HashSet<>();
    @ManyToOne
    private RestaurantEntity restaurant;
}
