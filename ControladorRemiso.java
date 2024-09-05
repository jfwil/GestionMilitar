package edu.avanzada.Taller1.control;

import edu.avanzada.Taller1.Remiso;

public class ControladorRemiso {

    public Remiso ingresar(String cedula, String nombre, String apellido) {
        return (new Remiso(cedula, nombre, apellido));
    }
}
