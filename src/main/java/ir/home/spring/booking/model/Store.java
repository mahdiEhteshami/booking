package ir.home.spring.booking.model;

import javax.persistence.PrimaryKeyJoinColumn;

@PrimaryKeyJoinColumn(name = "storeId")
public class Store extends Estate {
    private float foundationMeterage;
    private boolean isFloor;
    private boolean rightOfBusiness;
}
