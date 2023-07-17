package om.gov.taxoman.Entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.Order;
import lombok.Data;

import java.util.List;

@Data
@Entity

@Table(name = "PRODUCTS")
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PRICE")
    private double price;

    @ElementCollection
    private List<String> urls;

    @ManyToMany(mappedBy = "products")
    private List<Order> orders;
}