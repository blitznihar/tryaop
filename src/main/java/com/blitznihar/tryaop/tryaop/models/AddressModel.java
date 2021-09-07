package com.blitznihar.tryaop.tryaop.models;

public class AddressModel {
    private String street;
private String building;
private String zipcode;

    @Override
    public String toString() {
        return "{" +
            " street='" + getStreet() + "'" +
            ", building='" + getBuilding() + "'" +
            ", zipcode='" + getZipcode() + "'" +
            "}";
    }

    public AddressModel(String street, String building, String zipcode) {
        this.street = street;
        this.building = building;
        this.zipcode = zipcode;
    }

    public AddressModel() {
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return this.building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
