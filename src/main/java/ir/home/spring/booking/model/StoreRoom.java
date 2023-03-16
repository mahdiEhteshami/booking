package ir.home.spring.booking.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "store_room")
public class StoreRoom extends Estate {
    private int floorNumber;
}
