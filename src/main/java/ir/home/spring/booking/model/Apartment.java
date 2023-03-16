package ir.home.spring.booking.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "apartment")
public class Apartment extends Estate {
    private int numberOfFloors;
    private int floorNumber;
    private int unitNumber;
    private int unitPerFloor;
    private boolean hasYard;
    private float foundationMeterage;
}
