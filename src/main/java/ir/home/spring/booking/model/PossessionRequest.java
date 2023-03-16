package ir.home.spring.booking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(columnDefinition = "request_type")
public abstract class PossessionRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Estate estate;
    @ManyToOne
    private User owner;
    private String phoneNumber;
    private boolean chatEnable;
    private String description;
    @Version
    private int version;
}
