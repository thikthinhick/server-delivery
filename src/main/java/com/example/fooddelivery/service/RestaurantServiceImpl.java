package com.example.fooddelivery.service;

import com.example.fooddelivery.entity.RestaurantEntity;
import com.example.fooddelivery.repository.RestaurantRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    private final RestaurantRepository restaurantRepository;

    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public List<RestaurantEntity> newestRestaurants(Pageable pageable) {
        return restaurantRepository.findAllByOrderByCreatedTime(pageable);
    }
}
