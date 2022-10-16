package com.example.fooddelivery.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "status")
@Entity
@Data
public class StatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
}
