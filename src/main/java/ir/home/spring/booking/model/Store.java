package ir.home.spring.booking.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "store")
public class Store extends Estate {
    private float foundationMeterage;
    private boolean isFloor;
    private boolean rightOfBusiness;
}
