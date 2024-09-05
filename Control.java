package edu.avanzada.Taller1.control;

import edu.avanzada.Taller1.Persona;
import edu.avanzada.Taller1.vista.Vista;

import java.util.ArrayList;
import java.util.List;

public class Control { 

    private List<Persona> personas;
    private Vista vista;
    private ControladorRemiso controladorRemiso;
    private ControladorReservista controladorReservista;
    private ControladorAplazado controladorAplazado;
    private ControladorReclutado controladorReclutado;

    public Control() { 
        personas = new ArrayList<>();
        vista = new Vista(this);
        controladorRemiso = new ControladorRemiso();
        controladorReservista = new ControladorReservista();
        controladorAplazado = new ControladorAplazado();
        controladorReclutado = new ControladorReclutado();
    }
    
    public void launch() {
        this.empezarPrograma();

        while (true) {
            int opcion = vista.mostrarIngresoPersona();
            switch (opcion) {
                case 1:
                    List<String> datosRemiso = vista.pedirRemiso();
                    personas.add(controladorRemiso.ingresar(datosRemiso.get(0), datosRemiso.get(1), datosRemiso.get(2)));
                    break;
                case 2:
                    List<String> datosReservista = vista.pedirReservista();
                    personas.add(controladorReservista.ingresar(datosReservista.get(0), datosReservista.get(1), datosReservista.get(2), datosReservista.get(3)));
                    break;
                case 3:
                    List<String> datosAplazado = vista.pedirAplazado();
                    personas.add(controladorAplazado.ingresar(datosAplazado.get(0), datosAplazado.get(1), datosAplazado.get(2), datosAplazado.get(3)));
                    break;
                case 4:
                    List<String> datosReclutado = vista.pedirReclutado();
                    personas.add(controladorReclutado.ingresar(datosReclutado.get(0), datosReclutado.get(1), datosReclutado.get(2), datosReclutado.get(3)));
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
        }
    }

    public void empezarPrograma() {
        vista.mostrarMenu();
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
