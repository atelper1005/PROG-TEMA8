import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
    public static void main(String[] args) {
        //Abrir conexión
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        //Operaciones
        Coche f1 = new Coche();
        f1.setColor("Rojo");

        Coche f2 = new Coche();
        f2.setColor("Verde");

        em.persist(f1);
        em.persist(f2);

        //Finalizar la transacción: Salvar la información
        em.getTransaction().commit();

        //Cerrar conexión
        em.close();
        emf.close();
    }
}
