package ir.home.spring.booking.model;

import javax.persistence.PrimaryKeyJoinColumn;

@PrimaryKeyJoinColumn(name = "villaId")
public class Villa extends Estate {
    private int numberOfFloors;
}
