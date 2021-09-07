package com.blitznihar.tryaop.tryaop.controllers;

import java.util.List;

import com.blitznihar.tryaop.tryaop.models.RestaurantModel;
import com.blitznihar.tryaop.tryaop.services.RestaurantService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController{

    @Autowired
    public RestaurantService restaurantService;

    @GetMapping("/restaurant")
    public List<RestaurantModel> getRestaurantAll() {
  
         return restaurantService.getRestaurant();
    }

    @GetMapping("/restaurant/h2")
    public List<RestaurantModel> getRestaurantAllH2() {
  
         return restaurantService.getRestaurantH2();
    }
    @PostMapping("/restaurant")
    @ResponseStatus(HttpStatus.CREATED)
    public String insertRestaurant(@RequestBody List<RestaurantModel> restaurants){


        return restaurantService.insertRestaurant(restaurants);

    }
    @PostMapping("/restaurant/h2")
    @ResponseStatus(HttpStatus.CREATED)
    public String insertRestaurantH2(@RequestBody List<RestaurantModel> restaurants){


        return restaurantService.insertRestaurantH2(restaurants);

    }
 
}
