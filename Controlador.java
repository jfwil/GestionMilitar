/**
 *
 * @author Santiago Ramos Narvaez    cod: 20222020164
 * @author Juan Felipe Wilches Gómez cod: 20231020137
 * @author Solanghy Catalina Ortiz   cod: 20232020325
 */
public class Controlador { 

    private Persona persona;
    private List<Persona> personas;
    private Vista vista;

    public Controlador (){
        vista = new Vista(this);
        vista. leerDatos();
    }

    public void insertarRemiso(String cedula, String nombre, String apellido) {
        personas.add(new Remiso(cedula, nombre, apellido));
    }

    public void insertarReservista(String cedula, String nombre, String apellido, String libretaMilitar) {
        personas.add(new Reservista(cedula, nombre, apellido, libretaMilitar));
    }

    
}
