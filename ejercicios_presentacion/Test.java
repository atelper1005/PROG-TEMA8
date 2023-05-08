package ejercicios_presentacion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class Test {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("evento.odb");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        POJO_festival db = new POJO_festival();
        Timestamp ts = Timestamp.valueOf("2023-01-01 00:00:00");
        System.out.println(ts);

        POJO_festival e = new POJO_festival();
        e.setRecaudacion(new BigDecimal(654654654.21354687436654879584));

        em.find(POJO_festival.class, 12);

        em.persist(db);

        em.getTransaction().commit();

        em.close();
        emf.close();

        System.out.println("Festival: " + db.getFecha());

    }
}
