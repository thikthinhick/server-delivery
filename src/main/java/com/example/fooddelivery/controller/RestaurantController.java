package com.example.fooddelivery.controller;

import com.example.fooddelivery.entity.RestaurantEntity;
import com.example.fooddelivery.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/restaurant")
public class RestaurantController {

    @Autowired private RestaurantService restaurantService;

    @GetMapping("/newest")
    public ResponseEntity<List<RestaurantEntity>> getNewestRestaurants(
            @RequestParam Integer limit,
            @RequestParam Integer page) {
        Pageable pageable = PageRequest.of(page, limit);
        return ResponseEntity.ok(restaurantService.newestRestaurants(pageable));
    }
}
