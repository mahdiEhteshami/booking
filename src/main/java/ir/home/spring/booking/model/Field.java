package ir.home.spring.booking.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "field")
public class Field extends Estate {
    private boolean hasFence;
}
