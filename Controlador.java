import java.util.ArrayList;
import java.util.List;

public class Controlador { 

    private List<Persona> personas;
    private Vista vista;

    public Controlador (){
        personas = new ArrayList<>();
        vista = new Vista(this);
        this.empezarPrograma();
    }

    public void empezarPrograma() {
        vista.mostrarMenu();
    }

    public void insertarRemiso(String cedula, String nombre, String apellido) {
        personas.add(new Remiso(cedula, nombre, apellido));-

    }

    public void insertarReservista(String cedula, String nombre, String apellido, String libretaMilitar) {
        personas.add(new Reservista(cedula, nombre, apellido, libretaMilitar));
    }

    public void insertarAplazado(String cedula, String nombre, String apellido, String fechaAplazamiento) {
        personas.add(new Aplazado(cedula, nombre, apellido, fechaAplazamiento));
    }

    public void insertarReclutado(String cedula, String nombre, String apellido, String codigoMilitar) {
        personas.add(new Reclutado(cedula, nombre, apellido, codigoMilitar)); 
    }

    public void consultarPersona(String cedula) {
        for (Persona p : personas) {
            if (p.getCedula().equals(cedula)) {
                vista.mostrarPersona(p);
                return;
            }
        }
        vista.mostrarMensaje("No se encontro ninguna persona con la cedula: " + cedula);
    }
}
