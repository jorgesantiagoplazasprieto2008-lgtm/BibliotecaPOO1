package com.biblioteca;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println(" ¡Bienvenido al Sistema de Biblioteca! ");
        System.out.println("===========================================");
        System.out.println();

        // Crear diferentes materiales (todos heredan de Material abstracto)
        System.out.println("=== REGISTRAR LIBRO ===");
        System.out.print("ID: ");
        String idLibro = scanner.nextLine();
        System.out.print("Título: ");
        String tituloLibro = scanner.nextLine();
        System.out.print("Autor: ");
        String autorLibro = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        Libro libro = new Libro(idLibro, tituloLibro, autorLibro, isbn);

        System.out.println("\n=== REGISTRAR REVISTA ===");
        System.out.print("ID: ");
        String idRevista = scanner.nextLine();
        System.out.print("Título: ");
        String tituloRevista = scanner.nextLine();
        System.out.print("Número de edición: ");

        try {
            int numeroEdicion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            Revista revista = new Revista(idRevista, tituloRevista, numeroEdicion);

            System.out.println("\n=== REGISTRAR TESIS ===");
            System.out.print("ID: ");
            String idTesis = scanner.nextLine();
            System.out.print("Título: ");
            String tituloTesis = scanner.nextLine();
            System.out.print("Autor: ");
            String autorTesis = scanner.nextLine();
            Tesis tesis = new Tesis(idTesis, tituloTesis, autorTesis);

            boolean continuar = true;
            while (continuar) {
                System.out.println("\n=== MENÚ PRINCIPAL ===");
                System.out.println("1. Prestar libro");
                System.out.println("2. Mostrar info del libro");
                System.out.println("3. Calcular multa del libro");
                System.out.println("4. Prestar revista");
                System.out.println("5. Mostrar info de la revista");
                System.out.println("6. Calcular multa de la revista");
                System.out.println("7. Prestar tesis");
                System.out.println("8. Mostrar info de la tesis");
                System.out.println("9. Calcular multa de la tesis");
                System.out.println("10. Salir");
                System.out.print("Seleccione una opción: ");

                try {
                    int opcion = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer

                    switch (opcion) {
                        case 1:
                            libro.prestar();
                            break;
                        case 2:
                            libro.mostrarInfo();
                            break;
                        case 3:
                            System.out.print("Ingrese días de retraso: ");
                            int diasLibro = scanner.nextInt();
                            scanner.nextLine();
                            System.out.printf(" Multa: $%.2f%n", libro.calcularMulta(diasLibro));
                            break;
                        case 4:
                            revista.prestar();
                            break;
                        case 5:
                            revista.mostrarInfo();
                            break;
                        case 6:
                            System.out.print("Ingrese días de retraso: ");
                            int diasRevista = scanner.nextInt();
                            scanner.nextLine();
                            System.out.printf(" Multa: $%.2f%n", revista.calcularMulta(diasRevista));
                            break;
                        case 7:
                            tesis.prestar();
                            break;
                        case 8:
                            tesis.mostrarInfo();
                            break;
                        case 9:
                            System.out.print("Ingrese días de retraso: ");
                            int diasTesis = scanner.nextInt();
                            scanner.nextLine();
                            System.out.printf(" Multa: $%.2f%n", tesis.calcularMulta(diasTesis));
                            break;
                        case 10:
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
            System.out.println("❌ Error: El número de edición debe ser numérico.");
        }

        scanner.close();
    }
}
