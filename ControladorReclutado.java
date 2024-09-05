package edu.avanzada.Taller1.control;

import edu.avanzada.Taller1.Remiso;

public class ControladorReclutado {

    public Remiso ingresar(String cedula, String nombre, String apellido) {
        return (new Reclutado(cedula, nombre, apellido, codigoMilitar));
    }
}