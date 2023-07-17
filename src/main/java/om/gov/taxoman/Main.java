package om.gov.taxoman;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import om.gov.taxoman.Entity.*;

import java.lang.module.FindException;
import java.time.LocalDate;
import java.util.List;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {


//        Property property =new Property();
//        property.setName("Jeep");
//        property.setDayRentalPrice(99.50);
//        Property property1 =new Property();
//        property1.setName("Jeep");
//        property1.setDayRentalPrice(80.50);
//
//
//
//        Customer customer=new Customer();
//        customer.setFullName("manar qasim alqasmi");
//        customer.setEmail("manar@gmail.com");
//        customer.setPassword("manar");
//
//        Customer customer1=new Customer();
//        customer1.setFullName("rayyan qasim alqasmi");
//        customer1.setEmail("rayyan@gmail.com");
//
//
//        PropertyOwner propertyOwner=new PropertyOwner();
//        propertyOwner.setEmail("manar@gmail.com");
//        propertyOwner.setPassword("24252");
//        propertyOwner.setPhoneNumber("98398938");
//        PropertyOwner propertyOwner1=new PropertyOwner();
//        propertyOwner1.setEmail("rayyan@gmail.com");
//        propertyOwner1.setPassword("242mmm52");
//        propertyOwner1.setPhoneNumber("9999999");


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("manar");
        EntityManager em = emf.createEntityManager();
        em.getTransaction() .begin();


//        em.persist(property);
//        em.persist(property1);
//        em.persist(customer);
//        em.persist(customer1);
//        em.persist(propertyOwner);
//        em.persist(propertyOwner1);
        Customer customer = em.find(Customer.class,1);
        Property property = em.find(Property.class,1);

        Rental rental = new Rental();
        rental.setCustomer(customer);
        rental.setProperty(property);
        rental.setStartDate(LocalDate.now());
        rental.setEndDate(LocalDate.now());
        rental.setRentingAmount(52);



       em.persist(rental);


        em.getTransaction() .commit();

        em.close();
        emf.close();
    }
}