package com.example.fooddelivery.entity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private UserEntity user;
    @Column(name = "detail_address")
    private String detailAddress;
    private String wards;
    private String district;
    private String city;
    private String national;
}
