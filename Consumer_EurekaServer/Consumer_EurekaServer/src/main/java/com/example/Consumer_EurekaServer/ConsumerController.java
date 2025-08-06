package com.example.Consumer_EurekaServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import restaurantConsumer.Restaurant;
import restaurantConsumer.RestaurantClient;

import java.util.List;

@RestController
public class ConsumerController {

    @Autowired
    private RestaurantClient restaurantClient;

    @GetMapping("/consumer/restaurants")
    public List<Restaurant> getAllRestaurants() {
        return restaurantClient.getRestaurants();
    }
}
