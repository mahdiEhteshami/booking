package ir.home.spring.booking.model;

import javax.persistence.PrimaryKeyJoinColumn;

@PrimaryKeyJoinColumn(name = "storeRoomId")
public class StoreRoom extends Estate {
    private int floorNumber;
}
