package ir.home.spring.booking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@DiscriminatorValue(value = "RENT")
public class RentPossessionRequest extends PossessionRequest {
//    @EmbeddedId
//    private PossessionRequest possessionRequest;
    @Enumerated
    private RentType rentType;
    private float deposit;
    private float rentFee;
}
