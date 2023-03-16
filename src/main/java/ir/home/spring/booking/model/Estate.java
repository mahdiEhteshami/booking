package ir.home.spring.booking.model;

import ir.home.spring.booking.model.utils.EstateAttributeConverter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Estate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated
    private PropertyNature propertyNature;
    @Embedded
    private Address address;
    @Convert(converter = EstateAttributeConverter.class)
    private List<EstateAttribute> estateAttributes;
    private float meterage;
    @Version
    private int version;
}
