package om.gov.taxoman;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import om.gov.taxoman.Entity.Property;

import java.util.Properties;

public class Main {
    public static void main(String[] args) {


        Property property =new Property();
        property.setName("Jeep");
        property.setDayRentalPrice(99.50);
        property.setId(11);



        EntityManagerFactory emf = Persistence.createEntityManagerFactory("manar");
        EntityManager em = emf.createEntityManager();
        em.getTransaction() .begin();


        em.persist(property);




        em.getTransaction() .commit();

        em.close();
        emf.close();
    }
}