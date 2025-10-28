package com.biblioteca;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println(" ¡Bienvenido al Sistema de Biblioteca! ");
        System.out.println("===========================================");
        System.out.println();

        // Solicitar datos del libro
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();

        // Crear instancia de Libro (encapsulación en acción)
        Libro libro = new Libro(titulo, autor);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== OPCIONES ===");
            System.out.println("1. Prestar libro");
            System.out.println("2. Devolver libro");
            System.out.println("3. Mostrar información");
            System.out.println("4. Salir");
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
                        System.out.println("Saliendo del sistema...");
                        continuar = false;
                        break;
                    default:
                        System.out.println(" Opción no válida.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("❌ Error: Debe ingresar un número válido.");
                scanner.nextLine(); // Limpiar buffer después del error
            }
        }

        scanner.close();
    }
}