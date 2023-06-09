package ir.home.spring.booking.model;

import ir.home.spring.booking.model.utils.EstateAttributeConverter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "estate_type")
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
    @OneToMany(mappedBy = "estate")
    private List<ImageFile> images;
    @Version
    private int version;
}
