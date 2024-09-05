package edu.avanzada.Taller1;

/**
 *
 * @author solan
 */
/**
 * Clase que representa a una persona en estado de Reclutado.
 */
public class Reclutado extends Persona implements EstadoMilitar {
    private String codigoReclutamiento;

    /**
     * Constructor para crear un reclutado.
     * 
     * @param cedula              Cédula de la persona.
     * @param nombre              Nombre de la persona.
     * @param apellido            Apellido de la persona.
     * @param codigoReclutamiento Código de reclutamiento asignado.
     */
    public Reclutado(String cedula, String nombre, String apellido, String codigoReclutamiento) {
        super(cedula, nombre, apellido);
        this.codigoReclutamiento = codigoReclutamiento;
    }

    /**
     * Devuelve el estado militar del reclutado.
     * 
     * @return Una cadena que indica que la persona es reclutada y su código de reclutamiento.
     */
    @Override
    public String obtenerEstadoMilitar() {
        return "Reclutado (Código de Reclutamiento: " + codigoReclutamiento + ")";
    }
}


