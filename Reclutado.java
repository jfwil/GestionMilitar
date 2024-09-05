package edu.avanzada.Taller1;

public class Reclutado extends Persona { 
    private String codigoMilitar; 

    public Reclutado(String cedula, String nombre, String apellido, String codigoMilitar) {
        super(cedula, nombre, apellido);
        this.codigoMilitar = codigoMilitar;
    } 

    public String getCodigoMilitar() { 
        return codigoMilitar; 
    }

    public void setCodigoMilitar(String codigoMilitar) { 
        this.codigoMilitar = codigoMilitar; 
    } 

    @Override 
    public String toString() { 
        return super.toString() + ", Codigo Militar: " + codigoMilitar; 
    }
}

