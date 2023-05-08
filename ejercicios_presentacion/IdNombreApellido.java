package ejercicios_presentacion;

import javax.persistence.Embeddable;

@Embeddable
public class IdNombreApellido {
    private String nombre;
    private String apellido;
}