package ir.home.spring.booking.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "garden")
public class Garden extends Estate {
    private boolean hasFence;
    private boolean hasVilla;
}
