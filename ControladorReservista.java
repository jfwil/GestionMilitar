package edu.avanzada.Taller1.control;

import edu.avanzada.Taller1.Remiso;

public class ControladorReservista {

    public Remiso ingresar(String cedula, String nombre, String apellido) {
        return (new Reservista(cedula, nombre, apellido, libretaMilitar));
    }
 
}
