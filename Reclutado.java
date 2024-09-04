/**
 *
 * @author Santiago Ramos Narvaez    cod: 20222020164
 * @author Juan Felipe Wilches Gómez cod: 20231020137
 * @author Solanghy Catalina Ortiz   cod: 20232020325
 */
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
