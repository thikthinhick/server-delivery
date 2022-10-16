package com.example.fooddelivery.repository;

import com.example.fooddelivery.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Long, ItemEntity> {
}