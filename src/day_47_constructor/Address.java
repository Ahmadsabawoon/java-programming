package day_47_constructor;

import java.security.PrivilegedExceptionAction;

public class Address {

   private String street;
    private String city;
    private String state;
    private String zipcode;
    private String country = "USA";

    // constructor = special method and no return type and same name as class name
    public Address() {
        System.out.println("Address constructor");
        street = "123 unknown st";
        city = "unknown";
        state = "unknown";
        zipcode ="0000";
    }

    public String toString() {
        return street +", " + city +", " + state + " " + zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
