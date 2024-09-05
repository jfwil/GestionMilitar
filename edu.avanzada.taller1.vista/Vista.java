package edu.avanzada.Taller1.vista;
import java.util.Scanner;
/**
 * Clase que gestiona la interacción con el usuario. Se encarga de recibir
 * entradas y mostrar salidas en consola.
 */
public class Vista {
    private Scanner scanner = new Scanner(System.in);

    /**
     * Muestra el menú principal y devuelve la opción seleccionada por el usuario.
     * 
     * @return La opción seleccionada.
     */
    public int mostrarMenu() {
        System.out.println("1. Insertar persona");
        System.out.println("2. Consultar persona");
        System.out.println("3. Cambiar estado militar");
        System.out.println("4. Generar reporte por estado");
        System.out.println("5. Salir");
        return scanner.nextInt();
    }

    // Métodos que solicitan datos al usuario
    public String solicitarCedula() {
        System.out.print("Ingrese cédula: ");
        return scanner.next();
    }

    public String solicitarNombre() {
        System.out.print("Ingrese nombre: ");
        return scanner.next();
    }

    public String solicitarApellido() {
        System.out.print("Ingrese apellido: ");
        return scanner.next();
    }