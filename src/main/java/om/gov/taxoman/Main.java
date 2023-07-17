package om.gov.taxoman;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import om.gov.taxoman.Entity.property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("manar.png");
            byte[] buffer = new byte[1024];
            FileInputStream fileInputStream = new FileInputStream("img/jeep.jpg");
            while (fileInputStream.read(buffer) != -1) {
                fileOutputStream.write(buffer);
            }
            fileOutputStream.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        property property =new property();
        property.setName("Jeep");
        property.setDescription("Jeep Wrangler 4xe – white");
        property.setPrice(15.50);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("manar");
        EntityManager em = emf.createEntityManager();
        em.getTransaction() .begin();



        em.persist(property);
        em.getTransaction() .commit();

        em.close();
        emf.close();
    }
}