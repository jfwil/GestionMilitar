package edu.avanzada.Taller1;

public class Persona {
    protected String cedula;
    public String nombre;
    public String apellido;

    /**
     * Constructor para inicializar los atributos básicos de una persona.
     * 
     * @param cedula  Cédula de la persona.
     * @param nombre  Nombre de la persona.
     * @param apellido Apellido de la persona.
     */
    public Persona(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Devuelve la cédula de la persona.
     * 
     * @return La cédula.
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Representación en cadena de la persona, mostrando su nombre, apellido y cédula.
     * 
     * @return Una cadena de texto con la información básica de la persona.
     */
    @Override
    public String toString() {
        return nombre + " " + apellido + " (Cédula: " + cedula + ")";
    }
}
