package edu.avanzada.Taller1.control;

import edu.avanzada.Taller1.Aplazado;

public class ControladorAplazado {

    public Remiso ingresar(String cedula, String nombre, String apellido) {
        return (new Aplazado(cedula, nombre, apellido, fechaAplazamiento));
    }
}