package edu.avanzada.Taller1;

/**
 *
 * @author solan
 */
/**
 * Clase que representa a una persona en estado de Aplazado.
 * Extiende de Remiso ya que es un estado derivado de Remiso.
 */
public class Aplazado extends Remiso {
    private String fechaAplazamiento;

    /**
     * Constructor para crear un aplazado.
     * 
     * @param cedula            Cédula de la persona.
     * @param nombre            Nombre de la persona.
     * @param apellido          Apellido de la persona.
     * @param fechaAplazamiento Fecha de aplazamiento de la situación militar.
     */
    public Aplazado(String cedula, String nombre, String apellido, String fechaAplazamiento) {
        super(cedula, nombre, apellido);
        this.fechaAplazamiento = fechaAplazamiento;
    }

    /**
     * Devuelve el estado militar del aplazado.
     * 
     * @return Una cadena que indica que la persona es aplazado y su fecha de aplazamiento.
     */
    @Override
    public String obtenerEstadoMilitar() {
        return "Aplazado (Fecha de Aplazamiento: " + fechaAplazamiento + ")";
    }
}
