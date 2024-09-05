package edu.avanzada.Taller1;

public class Reservista extends Persona {
    private String libretaMilitar; 

    public Reservista(String cedula, String nombre, String apellido, String libretaMilitar) {
        super(cedula, nombre, apellido); 
        this.libretaMilitar = libretaMilitar;
    } 

    public String getLibretaMilitar() { 
        return libretaMilitar; 
    }

    public void setLibretaMilitar(String libretaMilitar) {
        this.libretaMilitar = libretaMilitar; 
    }

    @Override 
    public String toString() { 
        return super.toString() + ", Libreta Militar: " + libretaMilitar; 
    }
}