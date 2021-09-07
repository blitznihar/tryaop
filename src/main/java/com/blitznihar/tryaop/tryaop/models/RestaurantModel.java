package com.blitznihar.tryaop.tryaop.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "restaurant2")
public class RestaurantModel {
    private String name;
    private String cuisine;
    private String borough;
    private AddressModel address;

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", cuisine='" + getCuisine() + "'" +
            ", borough='" + getBorough() + "'" +
            ", address='" + getAddress().toString() + "'" +
            "}";
    }

    public AddressModel getAddress() {
        return this.address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }

    public RestaurantModel(String name, String cuisine, String borough, AddressModel address) {
        this.name = name;
        this.cuisine = cuisine;
        this.borough = borough;
        this.address = address;
    }



    public RestaurantModel() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine() {
        return this.cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getBorough() {
        return this.borough;
    }

    public void setBorough(String borough) {
        this.borough = borough;
    }
    
}
