package ir.home.spring.booking.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "apartmentId")
public class Apartment extends Estate {
    private int floorNumber;
    private boolean hasYard;
    private float foundationMeterage;
}
