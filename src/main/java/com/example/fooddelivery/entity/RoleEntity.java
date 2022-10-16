package com.example.fooddelivery.entity;

import lombok.Data;

import javax.persistence.*;
@Table(name = "role")
@Entity
@Data
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
}
