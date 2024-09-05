package edu.avanzada.Taller1.vista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import edu.avanzada.Taller1.control.Controlador;

public class Vista {

    private final Scanner scanner = new Scanner(System.in);
    private final Controlador controlador;

    public Vista(Controlador controlador) {
        this.controlador = controlador;
    }

    public void mostrarMenu() {
        boolean salir = false;

        while (!salir) {
            System.out.println("Menu Principal:");
            System.out.println("1. Ingresar una nueva persona");
            System.out.println("2. Consultar una persona");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
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
                    System.out.println("Opcion no valida, intente nuevamente.");
            }
        }
    }

  public int mostrarIngresoPersona() {
        System.out.println("Seleccione el tipo de persona que quiere ingresar:");
        System.out.println("1. Remiso");
        System.out.println("2. Reservista");
        System.out.println("3. Aplazado");
        System.out.println("4. Reclutado");
        System.out.println("5. Regresar al menu principal");
        System.out.print("Seleccione una opcion: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); 
        return opcion;
    }

    public List<String> pedirRemiso() {
        List<String> datosRemiso = new ArrayList<>();
        System.out.print("Ingrese la cedula del remiso: ");
        datosRemiso.add(scanner.nextLine());
        System.out.print("Ingrese el nombre del remiso: ");
        datosRemiso.add(scanner.nextLine());
        System.out.print("Ingrese el apellido del remiso: ");
        datosRemiso.add(scanner.nextLine());
        return datosRemiso;
    }

    public List<String> pedirReservista() {
        System.out.print("Ingrese la cedula del reservista: ");
        List<String> datosReservista = Arrays.asList(scanner.nextLine());
        System.out.print("Ingrese el nombre del reservista: ");
        datosReservista.add(scanner.nextLine());
        System.out.print("Ingrese el apellido del reservista: ");
        datosReservista.add(scanner.nextLine());
        System.out.print("Ingrese la libreta militar del reservista: ");
        datosReservista.add(scanner.nextLine());
        return datosReservista;
        }

    public List<String> pedirAplazado() {
        System.out.print("Ingrese la cedula del aplazado: ");
        List<String> datosAplazado = Arrays.asList(scanner.nextLine());
        System.out.print("Ingrese el nombre del aplazado: ");
        datosAplazado.add(scanner.nextLine());
        System.out.print("Ingrese el apellido del aplazado: ");
        datosAplazado.add(scanner.nextLine());
        System.out.print("Ingrese la fecha de aplazamiento: ");
        datosAplazado.add(scanner.nextLine());
        return datosAplazado;
        }

    public List<String> pedirReclutado() {
        System.out.print("Ingrese la cedula del reclutado: ");
        List<String> datosReclutado = Arrays.asList(scanner.nextLine());
        System.out.print("Ingrese el nombre del reclutado: ");
        datosReclutado.add(scanner.nextLine());
        System.out.print("Ingrese el apellido del reclutado: ");
        datosReclutado.add(scanner.nextLine());
        System.out.print("Ingrese el código militar: ");
        datosReclutado.add(scanner.nextLine());
        return datosReclutado;
        }
 
    private void consultarPersona() {
        System.out.print("Ingrese la cedula de la persona a consultar: ");
        String cedula = scanner.nextLine();
        controlador.consultarPersona(cedula);
    }

    public void mostrarPersona(Persona persona) {
        System.out.println("Persona encontrada: " + persona.toString());
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    public void cerrar() {
    scanner.close();
    }
}