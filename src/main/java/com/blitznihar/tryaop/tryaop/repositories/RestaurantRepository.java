package com.blitznihar.tryaop.tryaop.repositories;

import com.blitznihar.tryaop.tryaop.models.RestaurantModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "restaurant", path = "restaurante")
public interface RestaurantRepository extends MongoRepository<RestaurantModel, String>{
}
