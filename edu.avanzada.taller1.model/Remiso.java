package edu.avanzada.Taller1;

/**
 *
 * @author solan
 */
/**
 * Clase que representa a una persona en estado de Remiso.
 */
public class Remiso extends Persona implements EstadoMilitar {

    /**
     * Constructor para crear un remiso.
     * 
     * @param cedula   Cédula de la persona.
     * @param nombre   Nombre de la persona.
     * @param apellido Apellido de la persona.
     */
    public Remiso(String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
    }

    /**
     * Devuelve el estado militar del remiso.
     * 
     * @return Una cadena que indica que la persona es remiso.
     */
    @Override
    public String obtenerEstadoMilitar() {
        return "Remiso";
    }
}