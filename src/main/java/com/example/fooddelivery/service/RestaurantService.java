package com.example.fooddelivery.service;

import com.example.fooddelivery.entity.RestaurantEntity;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface RestaurantService {
    List<RestaurantEntity> newestRestaurants(Pageable pageable);
}
