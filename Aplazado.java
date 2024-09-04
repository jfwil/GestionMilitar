/**
 *
 * @author Santiago Ramos Narvaez    cod: 20222020164
 * @author Juan Felipe Wilches Gómez cod: 20231020137
 * @author Solanghy Catalina Ortiz   cod: 20232020325
 */
public class Aplazado extends Persona {
    private String fechaAplazamiento; 

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
