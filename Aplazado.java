public class Aplazado extends Persona {
    private String fechaAplazamiento; 

    //ejemplo

    public Aplazado(String cedula, String nombre, String apellido, String fechaAplazamiento) {
        super(cedula, nombre, apellido); 
        this.fechaAplazamiento = fechaAplazamiento; 
    } 

    public String getFechaAplazamiento() { 
        return fechaAplazamiento; 
    }

    public void setFechaAplazamiento(String fechaAplazamiento) { 
        this.fechaAplazamiento = fechaAplazamiento;
    }

    @Override 
    public String toString() { 
        return super.toString() + ", Fecha de Aplazamiento: " + fechaAplazamiento;
    }
}
