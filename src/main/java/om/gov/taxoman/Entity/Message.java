package om.gov.taxoman.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "MESSAGES")
public class Message {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "MESSAGE")
    private String message;

}