package com.fral.uo.data.core.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String zone;

    @Column(nullable = false)
    private String city;

    private String country;

    protected Address() {

    }

    public Address(String street, String zone, String city, String country) {
        this.street = street;
        this.zone = zone;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", zone='" + zone + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
