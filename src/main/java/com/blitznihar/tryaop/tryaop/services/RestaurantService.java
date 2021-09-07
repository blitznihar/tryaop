package com.blitznihar.tryaop.tryaop.services;

import java.util.List;


import com.blitznihar.tryaop.tryaop.models.RestaurantModel;
import com.blitznihar.tryaop.tryaop.repositories.RestaurantRepository;
import com.blitznihar.tryaop.tryaop.repositories.RestaurantRepositoryH2;

import org.springframework.beans.factory.annotation.Autowired;
/*
import com.blitznihar.tryaop.tryaop.models.AddressModel;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
*/
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
    @Autowired
    private RestaurantRepository restaurantsRepository;

    @Autowired
    private RestaurantRepositoryH2 restaurantsRepositoryH2;


    public List<RestaurantModel> getRestaurant() {
        /*
        RestaurantModel restaurantFilter = new RestaurantModel();
        restaurantFilter.setBorough("Manhattan");
        restaurantFilter.setCuisine("American");
        AddressModel addressFilter = new AddressModel();
        addressFilter.setStreet("Broadway");
        restaurantFilter.setAddress(addressFilter);
        Example<RestaurantModel> example = Example.of(restaurantFilter);
        Order order = new Sort.Order(Direction.ASC, "name");
        Sort sort = Sort.by(order);
        Pageable pageable = PageRequest.of(0, 5, sort);
        Page<RestaurantModel> restaurants =  restaurantsRepository.findAll(example, pageable);  
        return restaurants.toList();
        */
       return restaurantsRepository.findAll();
    }

    public String insertRestaurant(List<RestaurantModel> restaurants){

       List<RestaurantModel> restaurantsUpdated = restaurantsRepository.saveAll(restaurants);
       StringBuilder response = new StringBuilder();
       for (RestaurantModel restaurant : restaurantsUpdated) {
           response.append(restaurant.toString());
       }
        return response.toString();
    }

    public String insertRestaurantH2(List<RestaurantModel> restaurants){

        restaurantsRepositoryH2.insertRestaurant(restaurants);
        StringBuilder response = new StringBuilder();
        for (RestaurantModel restaurant : restaurants) {
            response.append(restaurant.toString());
        }
         return response.toString();
     }

    public List<RestaurantModel> getRestaurantH2() {
        return restaurantsRepositoryH2.findAll();
    }  
}
