package edu.avanzada.taller1.control;

import edu.avanzada.taller1.vista.Vista;

/**
 *
 * @author solan
 */

public class Launcher {
    public static void main(String[] args) {
        new Controlador(new Vista());  // Inicia el controlador con una nueva instancia de la Vista
    }
}