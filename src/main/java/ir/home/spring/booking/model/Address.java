package ir.home.spring.booking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
public class Address {
    private String country;
    private String state;
    private String city;
    private String county;
    private String district;
    private String details;
    private double latitude;
    private double longtitude;
}
