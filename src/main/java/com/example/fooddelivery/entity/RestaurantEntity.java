package com.example.fooddelivery.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "restaurant")
public class RestaurantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne
    private AddressEntity address;
    @OneToMany(mappedBy = "restaurant")
    private Set<ItemEntity> items = new HashSet<>();
    private LocalDateTime createdTime;
}
