/**
 *
 * @author Santiago Ramos Narvaez    cod: 20222020164
 * @author Juan Felipe Wilches Gómez cod: 20231020137
 * @author Solanghy Catalina Ortiz   cod: 20232020325
 */
public class Controlador { 

    private Persona persona;
    private List<Persona> personas;
    private Vista ventana;

    public Controlador (){
        ventana = new Vista(this);
        ventana. leerDatos();
    }

    
}
