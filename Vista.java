package edu.avanzada.Taller1.vista;

import java.util.Scanner;

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
                    System.out.println("Opcion no valida, intente nuevamente");
            }
        }
    }

    private void ingresarRemiso() {
        System.out.print("Ingrese la cedula del remiso: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese el nombre del remiso: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del remiso: ");
        String apellido = scanner.nextLine();
        controlador.insertarRemiso(cedula, nombre, apellido);
        System.out.println("Remiso ingresado");
    }

    private void ingresarReservista() {
        System.out.print("Ingrese la cedula del reservista: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese el nombre del reservista: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del reservista: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese la libreta militar del reservista: ");
        String libretaMilitar = scanner.nextLine();
        controlador.insertarReservista(cedula, nombre, apellido, libretaMilitar);
        System.out.println("Reservista ingresado");
    }

    private void ingresarAplazado() {
        System.out.print("Ingrese la cedula del aplazado: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese el nombre del aplazado: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del aplazado: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese la fecha de aplazamiento: ");
        String fechaAplazamiento = scanner.nextLine();
        controlador.insertarAplazado(cedula, nombre, apellido, fechaAplazamiento);
        System.out.println("Aplazado ingresado");
    }

    private void ingresarReclutado() {
        System.out.print("Ingrese la cedula del reclutado: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese el nombre del reclutado: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del reclutado: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese el código militar: ");
        String codigoMilitar = scanner.nextLine();
        controlador.insertarReclutado(cedula, nombre, apellido, codigoMilitar);
        System.out.println("Reclutado ingresado");
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
}