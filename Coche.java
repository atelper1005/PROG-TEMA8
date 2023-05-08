import javax.persistence.*;
import java.io.Serializable;

/**
 * POJO Coche
 * */
@Entity(name = "coche")
public class Coche implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "coche", initialValue = 50, allocationSize = 10)
    private Integer referencia;
    private String Marca;
    private String Color;

    public Coche() {

    }

    @Embedded
    private Fabricante fabricante;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

}
