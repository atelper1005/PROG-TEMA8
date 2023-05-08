package ejercicios_presentacion;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * POJO Festival
 * */

public class POJO_festival implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "miSecuencia")
    @SequenceGenerator(initialValue = 10, allocationSize = 10, name = "miSecuencia")
    private Integer id;
    private String nombre;
    @Transient
    private Date fecha;
    private BigDecimal recaudacion;

    @Enumerated(EnumType.STRING)
    private GeneroMusical generoMusical;

    @Embedded
    private List<Artista> artistas;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(BigDecimal recaudacion) {
        this.recaudacion = recaudacion;
    }

    @Override
    public String toString() {
        return "EventoMusical{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", recaudacion=" + recaudacion +
                ", generoMusical=" + generoMusical +
                ", artistas=" + artistas +
                '}';
    }
}

