package ir.home.spring.booking.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "fieldId")
public class Field extends Estate {
    private boolean hasFence;
}
