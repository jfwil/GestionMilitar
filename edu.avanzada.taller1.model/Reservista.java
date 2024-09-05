package edu.avanzada.Taller1;

/**
 *
 * @author solan
 */
/**
 * Clase que representa a una persona en estado de Reservista.
 */
public class Reservista extends Persona implements EstadoMilitar {
    private String libretaMilitar;

    /**
     * Constructor para crear un reservista.
     * 
     * @param cedula         Cédula de la persona.
     * @param nombre         Nombre de la persona.
     * @param apellido       Apellido de la persona.
     * @param libretaMilitar Número de libreta militar del reservista.
     */
    public Reservista(String cedula, String nombre, String apellido, String libretaMilitar) {
        super(cedula, nombre, apellido);
        this.libretaMilitar = libretaMilitar;
    }

    /**
     * Devuelve el estado militar del reservista.
     * 
     * @return Una cadena que indica que la persona es reservista y su número de libreta militar.
     */
    @Override
    public String obtenerEstadoMilitar() {
        return "Reservista (Libreta Militar: " + libretaMilitar + ")";
    }
}