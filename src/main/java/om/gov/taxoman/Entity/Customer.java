package om.gov.taxoman.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CUSTOMERS")
public class Customer {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

}