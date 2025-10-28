package com.biblioteca;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println(" ¡Bienvenido al Sistema de Biblioteca! ");
        System.out.println("===========================================");
        System.out.println();

        // Crear un libro

        System.out.println("=== REGISTRAR LIBRO ===");
        System.out.print("ID del libro: ");
        String idLibro = scanner.nextLine();
        System.out.print("Título del libro: ");
        String tituloLibro = scanner.nextLine();
        System.out.print("Autor del libro: ");
        String autorLibro = scanner.nextLine();
        System.out.print("ISBN del libro: ");
        String isbn = scanner.nextLine();

        Libro libro = new Libro(idLibro, tituloLibro, autorLibro, isbn);

        // Crear una revista
        System.out.println("\n=== REGISTRAR REVISTA ===");
        System.out.print("ID de la revista: ");
        String idRevista = scanner.nextLine();
        System.out.print("Título de la revista: ");
        String tituloRevista = scanner.nextLine();
        System.out.print("Número de edición: ");

        try {
            int numeroEdicion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            Revista revista = new Revista(idRevista, tituloRevista, numeroEdicion);

            boolean continuar = true;
            while (continuar) {
                System.out.println("\n=== MENÚ PRINCIPAL ===");
                System.out.println("1. Prestar libro");
                System.out.println("2. Devolver libro");
                System.out.println("3. Mostrar info del libro");
                System.out.println("4. Prestar revista");
                System.out.println("5. Devolver revista");
                System.out.println("6. Mostrar info de la revista");
                System.out.println("7. Salir");
                System.out.print("Seleccione una opción: ");

                try {
                    int opcion = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer

                    switch (opcion) {
                        case 1:
                            libro.prestar();
                            break;
                        case 2:
                            libro.devolver();
                            break;
                        case 3:
                            libro.mostrarInfo();
                            break;
                        case 4:
                            revista.prestar();
                            break;
                        case 5:
                            revista.devolver();
                            break;
                        case 6:
                            revista.mostrarInfo();
                            break;
                        case 7:
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
        } catch (java.util.InputMismatchException e) {
            System.out.println("❌ Error: El número de edición debe ser un valor numérico.");
        }

        scanner.close();
    }
}