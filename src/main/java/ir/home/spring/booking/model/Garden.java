package ir.home.spring.booking.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "gardenId")
public class Garden extends Estate {
    private boolean hasFence;
    private boolean hasVilla;
}
