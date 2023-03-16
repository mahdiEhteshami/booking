package ir.home.spring.booking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@DiscriminatorValue(value = "SALE")
public class SalePossessionRequest extends PossessionRequest {
//    @EmbeddedId
//    private PossessionRequest possessionRequest;
    private float cost;
    private float valuePerMeter;
}
