package edu.avanzada.taller1;

/**
 *
 * @author solan
 */
import java.util.ArrayList;
import java.util.List;
import edu.avanzada.taller1.modelo.Aplazado;
import edu.avanzada.taller1.modelo.EstadoMilitar;
import edu.avanzada.taller1.modelo.Persona;
import edu.avanzada.taller1.modelo.Reclutado;
import edu.avanzada.taller1.modelo.Remiso;
import edu.avanzada.taller1.modelo.Reservista;
import edu.avanzada.taller1.vista.Vista;

/**
 * Clase Controlador que maneja la lógica de la aplicación. 
 * Es responsable de interactuar con la vista y realizar las operaciones sobre los datos.
 */
public class Controlador {
    private Vista vista;  // Instancia de la vista para la interacción con el usuario
    private List<Persona> personas;  // Lista que almacena a las personas registradas

    /**
     * Constructor del Controlador.
     * Inicializa la vista y la lista de personas, y arranca el ciclo principal de la aplicación.
     * 
     * @param vista Instancia de la vista para la interacción con el usuario.
     */
    public Controlador(Vista vista) {
        this.vista = vista;
        this.personas = new ArrayList<>();
        iniciar();
    }

    /**
     * Método que inicia el ciclo principal de la aplicación.
     * Muestra el menú y maneja las opciones seleccionadas por el usuario.
     */
    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            int opcion = vista.mostrarMenu();  // Muestra el menú y obtiene la opción del usuario
            switch (opcion) {
                case 1:
                    insertarPersona();  // Llama al método para insertar una persona
                    break;
                case 2:
                    consultarPersona();  // Llama al método para consultar una persona
                    break;
                case 3:
                    cambiarEstadoMilitar();  // Llama al método para cambiar el estado militar de una persona
                    break;
                case 4:
                    generarReporte();  // Llama al método para generar un reporte por estado militar
                    break;
                case 5:
                    continuar = false;  // Sale del ciclo si el usuario elige la opción de salir
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida.");  // Muestra un mensaje si la opción no es válida
            }
        }
    }

    /**
     * Método para insertar una persona en la lista.
     * Solicita al usuario los datos de la persona y la agrega a la lista si no existe.
     */

  // Método privado que inserta una nueva persona en el sistema
private void insertarPersona() {
    // Solicita la cédula de la persona a insertar desde la vista
    String cedula = vista.solicitarCedula();
    
    // Verifica si ya existe una persona con esa cédula
    if (buscarPersona(cedula) != null) {
        // Si ya existe, muestra un mensaje y termina la ejecución del método
        vista.mostrarMensaje("La persona ya existe.");
        return;
    }

    // Solicita el nombre, apellido y estado militar de la persona desde la vista
    String nombre = vista.solicitarNombre();
    String apellido = vista.solicitarApellido();
    String estado = vista.solicitarEstado();

    // Inicializa la variable para la nueva persona a insertar
    Persona nuevaPersona = null;

    // Utiliza un switch para determinar el tipo de persona a crear según el estado militar
    switch (estado.toLowerCase()) {
        // Si el estado es "reservista", solicita la libreta militar y crea una instancia de Reservista
        case "reservista":
            String libretaMilitar = vista.solicitarLibretaMilitar();
            nuevaPersona = new Reservista(cedula, nombre, apellido, libretaMilitar);
            break;

        // Si el estado es "reclutado", solicita el código de reclutamiento y crea una instancia de Reclutado
        case "reclutado":
            String codigoReclutamiento = vista.solicitarCodigoReclutamiento();
            nuevaPersona = new Reclutado(cedula, nombre, apellido, codigoReclutamiento);
            break;

        // Si el estado es "remiso", crea una instancia de Remiso sin información adicional
        case "remiso":
            nuevaPersona = new Remiso(cedula, nombre, apellido);
            break;

        // Si el estado es "aplazado", solicita la fecha de aplazamiento y crea una instancia de Aplazado
        case "aplazado":
            String fechaAplazamiento = vista.solicitarFechaAplazamiento();
            nuevaPersona = new Aplazado(cedula, nombre, apellido, fechaAplazamiento);
            break;

        // Si el estado militar ingresado no es válido, muestra un mensaje y termina el método
        default:
            vista.mostrarMensaje("Estado militar no válido.");
            return;
    }

    // Agrega la nueva persona a la lista de personas
    personas.add(nuevaPersona);
    
    // Muestra un mensaje indicando que la persona fue insertada exitosamente
    vista.mostrarMensaje("Persona insertada exitosamente.");
}

// Método privado que consulta la información de una persona por su cédula
private void consultarPersona() {
    // Solicita la cédula de la persona desde la vista
    String cedula = vista.solicitarCedula();
    
    // Busca a la persona en la lista de personas y la castea como EstadoMilitar
    EstadoMilitar persona = (EstadoMilitar) buscarPersona(cedula);
    
    // Si la persona existe, muestra su estado militar
    if (persona != null) {
        vista.mostrarMensaje("Datos de la persona: " + persona.obtenerEstadoMilitar());
    } else {
        // Si no existe, muestra un mensaje de que la persona no fue encontrada
        vista.mostrarMensaje("La persona no existe.");
    }
}

// Método privado que permite cambiar el estado militar de una persona
    private void cambiarEstadoMilitar() {
    // Solicita la cédula de la persona cuyo estado militar será cambiado
         String cedula = vista.solicitarCedula();
    // Busca a la persona por su cédula
         Persona persona = buscarPersona(cedula);
    // Si la persona no existe, muestra un mensaje y termina el método
    if (persona == null) {
        vista.mostrarMensaje("La persona no existe.");
        return;
    }

    // Solicita el nuevo estado militar desde la vista
    String nuevoEstado = vista.solicitarEstado();
    
    // Inicializa la variable para la nueva persona con el estado cambiado
    Persona nuevaPersona = null;

    // Utiliza un switch para definir la nueva persona según el nuevo estado militar
    switch (nuevoEstado.toLowerCase()) {
        // Si el nuevo estado es "reservista" y la persona no es remiso ni aplazado, permite el cambio
        case "reservista":
            if (persona instanceof Remiso || persona instanceof Aplazado) {
                vista.mostrarMensaje("Cambio de estado no permitido.");
                return;
            }
            String libretaMilitar = vista.solicitarLibretaMilitar();
            nuevaPersona = new Reservista(cedula, persona.nombre, persona.apellido, libretaMilitar);
            break;

        // Si el nuevo estado es "reclutado", solicita el código de reclutamiento y realiza el cambio
        case "reclutado":
            String codigoReclutamiento = vista.solicitarCodigoReclutamiento();
            nuevaPersona = new Reclutado(cedula, persona.nombre, persona.apellido, codigoReclutamiento);
            break;

        // Si el nuevo estado es "remiso", simplemente cambia a remiso
        case "remiso":
            nuevaPersona = new Remiso(cedula, persona.nombre, persona.apellido);
            break;

        // Si el nuevo estado es "aplazado", solicita la fecha de aplazamiento y realiza el cambio
        case "aplazado":
            String fechaAplazamiento = vista.solicitarFechaAplazamiento();
            nuevaPersona = new Aplazado(cedula, persona.nombre, persona.apellido, fechaAplazamiento);
            break;

        // Si el estado no es válido, muestra un mensaje y termina el método
        default:
            vista.mostrarMensaje("Estado militar no válido.");
            return;
    }

    // Elimina la persona anterior de la lista y agrega la nueva con el estado cambiado
    personas.remove(persona);
    personas.add(nuevaPersona);
    
    // Muestra un mensaje indicando que el cambio fue exitoso
    vista.mostrarMensaje("Estado militar cambiado exitosamente.");
}

// Método privado que genera un reporte de personas según su estado militar
private void generarReporte() {
    // Solicita el estado militar para filtrar desde la vista
    String estado = vista.solicitarEstado();
    
    // Muestra un mensaje indicando que se van a listar las personas con ese estado
    vista.mostrarMensaje("Personas con estado " + estado + ":");
    
    // Itera sobre la lista de personas para buscar las que coincidan con el estado
    for (Persona persona : personas) {
        // Verifica si el estado militar de la persona coincide con el estado solicitado
        if (((EstadoMilitar) persona).obtenerEstadoMilitar().toLowerCase().contains(estado.toLowerCase())) {
            // Muestra la información de la persona que coincide con el estado
            vista.mostrarMensaje(persona.toString());
        }
    }
}

// Método privado que busca una persona en la lista por su cédula
private Persona buscarPersona(String cedula) {
    // Itera sobre la lista de personas
    for (Persona persona : personas) {
        // Si encuentra una persona con la cédula dada, la devuelve
        if (persona.getCedula().equals(cedula)) {
            return persona;
        }
    }
    
    // Si no encuentra a la persona, devuelve null
    return null;
}
}
