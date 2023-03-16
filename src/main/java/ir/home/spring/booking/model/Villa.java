package ir.home.spring.booking.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "villa")
public class Villa extends Estate {
    private int numberOfFloors;
}
