package Ejercicio81;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity (name = "Ordenador")
@Embeddable
public class Ordenadores implements Serializable {
    @Id
    @SequenceGenerator(name = "idPcs", initialValue = 10, allocationSize = 10)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "idPcs")
    private Integer id;
    private String ip;
    private String numSerie;
    private BigInteger memoria;
    private BigInteger discoDuro;
    private String cpu;
    private Timestamp fechaCompra;

    public Ordenadores() {
    }

    public Ordenadores(String ip, String numSerie, BigInteger memoria, BigInteger discoDuro, String cpu, Timestamp fechaCompra) {
        this.ip = ip;
        this.numSerie = numSerie;
        this.memoria = memoria;
        this.discoDuro = discoDuro;
        this.cpu = cpu;
        this.fechaCompra = fechaCompra;
    }
}