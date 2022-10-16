package com.example.fooddelivery.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "order_delivery")
@Data
@Entity
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private AddressEntity address;
    private Long price;
    private Long count;
    private Long discount;
    @Column(columnDefinition = "TEXT")
    private String note;
    @ManyToOne
    private UserEntity user;
    private LocalDateTime creationTime;
    private LocalDateTime completionTime;
    @OneToOne
    private StatusEntity status;
}
