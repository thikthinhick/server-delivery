package com.example.fooddelivery.repository;

import com.example.fooddelivery.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Long, OrderEntity> {
}