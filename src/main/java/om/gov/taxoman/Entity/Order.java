package om.gov.taxoman.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "ORDERS")
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    private OrderStatus status;

    @ManyToMany
    private List<property> property;

}