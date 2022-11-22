package com.example.fooddelivery.repository;

import com.example.fooddelivery.entity.RestaurantEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Long> {
    List<RestaurantEntity> findAllByOrderByCreatedTime(Pageable pageable);
//    List<RestaurantEntity> findByCreatedTimeOrderByCreatedTimeDesc(Pageable pageable);
}
