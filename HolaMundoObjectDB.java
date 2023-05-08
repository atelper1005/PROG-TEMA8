import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.sql.Date;

public class HolaMundoObjectDB {

    private Date fecha1;

    @Temporal(TemporalType.DATE)
    private java.util.Date fecha2;

    enum TipoFruta {PERA, MANZANA}

    @Enumerated(EnumType.STRING)
    private TipoFruta tipoFruta;

    public static void main(String[] args) {
        TipoFruta tf;
    }
}
