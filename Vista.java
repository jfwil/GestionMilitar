package edu.avanzada.Taller1.vista;

/**
 *
 * @author Santiago Ramos Narvaez    cod: 20222020164
 * @author Juan Felipe Wilches Gómez cod: 20231020137
 * @author Solanghy Catalina Ortiz   cod: 20232020325
 */

import edu.avanzada.Taller1.Aplazado;
import edu.avanzada.Taller1.Persona;
import edu.avanzada.Taller1.Reclutado;
import edu.avanzada.Taller1.Remiso;
import edu.avanzada.Taller1.Reservista;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vista {

    private final Scanner scanner = new Scanner(System.in);
    private final List<Persona> personas = new ArrayList<>();

    public void mostrarMenu() {
        boolean salir = false;
        
        while (!salir) {
            System.out.println("Menu Principal:");
            System.out.println("1. Ingresar una nueva persona");
            System.out.println("2. Consultar una persona");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    mostrarIngresoPersona();
                    break;
                case 2:
                    consultarPersona();
                    break;
                case 3:
                    salir = true;
                    System.out.println("Adios ^_^");
                    break;
                default:
                    System.out.println("Opcion no válida, intente nuevamente.");
            }
        }
    }

    private void mostrarIngresoPersona() {
        boolean regresar = false;
        
        while (!regresar) {
            System.out.println("Seleccione el tipo de persona que quiere ingresar:");
            System.out.println("1. Remiso");
            System.out.println("2. Reservista");
            System.out.println("3. Aplazado");
            System.out.println("4. Reclutado");
            System.out.println("5. Regresar al menu principal");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                    ingresarRemiso();
                    break;
                case 2:
                    ingresarReservista();
                    break;
                case 3:
                    ingresarAplazado();
                    break;
                case 4:
                    ingresarReclutado();
                    break;
                case 5:
                    regresar = true;
                    break;
                default:
                    System.out.println("Opcion no valida, intente nuevamente.");
            }
        }
    }

    private void ingresarRemiso() {
        System.out.println("Ingrese la cedula del remiso:");
        String cedula = scanner.nextLine();
        System.out.println("Ingrese el nombre del remiso:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del remiso:");
        String apellido = scanner.nextLine();
        personas.add(new Remiso(cedula, nombre, apellido));
        System.out.println("Remiso ingresado exitosamente.");
    }

    private void ingresarReservista() {
        System.out.println("Ingrese la cedula del reservista:");
        String cedula = scanner.nextLine();
        System.out.println("Ingrese el nombre del reservista:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del reservista:");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese la libreta militar del reservista:");
        String libretaMilitar = scanner.nextLine();
        personas.add(new Reservista(cedula, nombre, apellido, libretaMilitar));
        System.out.println("Reservista ingresado exitosamente.");
    }

    private void ingresarAplazado() {
        System.out.println("Ingrese la cedula del aplazado:");
        String cedula = scanner.nextLine();
        System.out.println("Ingrese el nombre del aplazado:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del aplazado:");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese la fecha de aplazamiento:");
        String fechaAplazamiento = scanner.nextLine();
        personas.add(new Aplazado(cedula, nombre, apellido, fechaAplazamiento));
        System.out.println("Aplazado ingresado exitosamente.");
    }

    private void ingresarReclutado() {
        System.out.println("Ingrese la cedula del reclutado:");
        String cedula = scanner.nextLine();
        System.out.println("Ingrese el nombre del reclutado:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del reclutado:");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese el código militar:");
        String codigoMilitar = scanner.nextLine();
        personas.add(new Reclutado(cedula, nombre, apellido, codigoMilitar));
        System.out.println("Reclutado ingresado exitosamente.");
    }

    private void consultarPersona() {
        String cedula = scanner.nextLine();
    
    boolean personaSi = false;

    for (Persona persona : personas) {
        if (persona.getCedula().equals(cedula)) {
            System.out.println("Persona encontrada:" + persona);
            personaSi = true;
            break;
            }
        }

    if (!personaSi) {
        System.out.println("No se encontro ninguna persona con numero de cedula: " + cedula);
        }
    }
}