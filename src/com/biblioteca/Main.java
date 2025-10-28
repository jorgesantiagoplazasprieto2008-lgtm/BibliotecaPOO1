package com.biblioteca;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println(" ¡Bienvenido al Sistema de Biblioteca! ");
        System.out.println("===========================================");
        System.out.println();

        // Crear usuarios (polimorfismo)
        System.out.println("=== REGISTRAR USUARIO GENERAL ===");
        System.out.print("Nombre: ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("Identificación: ");
        String idUsuario = scanner.nextLine();
        Usuario usuario = new Usuario(nombreUsuario, idUsuario);

        System.out.println("\n=== REGISTRAR ESTUDIANTE ===");
        System.out.print("Nombre: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.print("Identificación: ");
        String idEstudiante = scanner.nextLine();
        System.out.print("Carrera: ");
        String carrera = scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombreEstudiante, idEstudiante, carrera);

        // Crear un libro
        System.out.println("\n=== REGISTRAR LIBRO ===");
        System.out.print("ID del libro: ");
        String idLibro = scanner.nextLine();
        System.out.print("Título: ");
        String tituloLibro = scanner.nextLine();
        System.out.print("Autor: ");
        String autorLibro = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        Libro libro = new Libro(idLibro, tituloLibro, autorLibro, isbn);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Usuario general presta libro");
            System.out.println("2. Estudiante presta libro");
            System.out.println("3. Mostrar info del usuario general");
            System.out.println("4. Mostrar info del estudiante");
            System.out.println("5. Mostrar info del libro");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer

                switch (opcion) {
                    case 1:
                        // Polimorfismo: usa el método de Usuario
                        usuario.prestarLibro(libro);
                        break;
                    case 2:
                        // Polimorfismo: usa el método sobrescrito de Estudiante
                        estudiante.prestarLibro(libro);
                        break;
                    case 3:
                        usuario.mostrarInfo();
                        break;
                    case 4:
                        // Polimorfismo: usa el método sobrescrito de Estudiante
                        estudiante.mostrarInfo();
                        break;
                    case 5:
                        libro.mostrarInfo();
                        break;
                    case 6:
                        System.out.println("Saliendo del sistema...");
                        continuar = false;
                        break;
                    default:
                        System.out.println(" Opción no válida.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("❌ Error: Debe ingresar un número válido.");
                scanner.nextLine(); // Limpiar buffer
            }
        }
        scanner.close();
    }
}
