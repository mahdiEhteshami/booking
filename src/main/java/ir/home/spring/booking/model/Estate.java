package ir.home.spring.booking.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Estate {
    private Integer id;
    private Address address;
    private List<HasProperty> properties;
    private float meterage;
    private int version;
}
