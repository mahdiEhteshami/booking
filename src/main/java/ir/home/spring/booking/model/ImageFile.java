package ir.home.spring.booking.model;

import javax.persistence.*;

@Entity
public class ImageFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Estate estate;
    private String title;
    private int seqOrder;
    @Lob
    private byte[] file;
}
