package com.biblioteca;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("╔═══════════════════════════════════════════╗");
        System.out.println("║ ║");
        System.out.println("║ SISTEMA DE GESTIÓN DE BIBLIOTECA ║");
        System.out.println("║ Proyecto Integrador POO ║");
        System.out.println("║ ║");
        System.out.println("╚═══════════════════════════════════════════╝");
        System.out.println();

        // Registrar usuarios
        System.out.println("=== REGISTRAR USUARIO GENERAL ===");
        System.out.print("Nombre: ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("Identificación: ");
        String idUsuario = scanner.nextLine();
        Usuario usuario = new Usuario(nombreUsuario, idUsuario);

        System.out.println("\n=== REGISTRAR BIBLIOTECARIO ===");
        System.out.print("Nombre: ");
        String nombreBibliotecario = scanner.nextLine();
        System.out.print("Identificación: ");
        String idBibliotecario = scanner.nextLine();
        Bibliotecario bibliotecario = new Bibliotecario(nombreBibliotecario, idBibliotecario);

        System.out.println("\n=== REGISTRAR ESTUDIANTE ===");
        System.out.print("Nombre: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.print("Identificación: ");
        String idEstudiante = scanner.nextLine();
        System.out.print("Carrera: ");
        String carrera = scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombreEstudiante, idEstudiante, carrera);
        // Arreglo polimórfico para almacenar diferentes tipos de materiales
        Material[] materiales = new Material[3];

        // Registrar libro
        System.out.println("\n=== REGISTRAR LIBRO ===");
        System.out.print("ID del libro: ");
        String idLibro = scanner.nextLine();
        System.out.print("Título: ");
        String tituloLibro = scanner.nextLine();
        System.out.print("Autor: ");
        String autorLibro = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        materiales[0] = new Libro(idLibro, tituloLibro, autorLibro, isbn);

        // Registrar revista
        System.out.println("\n=== REGISTRAR REVISTA ===");
        System.out.print("ID de la revista: ");
        String idRevista = scanner.nextLine();
        System.out.print("Título: ");
        String tituloRevista = scanner.nextLine();
        System.out.print("Número de edición: ");

        try {
            int numeroEdicion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            materiales[1] = new Revista(idRevista, tituloRevista, numeroEdicion);

            // Registrar tesis
            System.out.println("\n=== REGISTRAR TESIS ===");
            System.out.print("ID de la tesis: ");
            String idTesis = scanner.nextLine();
            System.out.print("Título: ");
            String tituloTesis = scanner.nextLine();
            System.out.print("Autor: ");
            String autorTesis = scanner.nextLine();
            materiales[2] = new Tesis(idTesis, tituloTesis, autorTesis);

            boolean salir = false;
            while (!salir) {

                System.out.println("\n╔═══════════════════════════════════════════╗");
                System.out.println("║ MENÚ PRINCIPAL ║");
                System.out.println("╚═══════════════════════════════════════════╝");
                System.out.println("1. Prestar libro (Usuario)");
                System.out.println("2. Prestar libro (Bibliotecario)");
                System.out.println("3. Prestar libro (Estudiante)");
                System.out.println("4. Registrar libro (Bibliotecario)");
                System.out.println("5. Mostrar información del libro");
                System.out.println("6. Prestar revista (Usuario)");
                System.out.println("7. Prestar revista (Bibliotecario)");
                System.out.println("8. Mostrar información de la revista");
                System.out.println("9. Prestar tesis (Usuario)");
                System.out.println("10. Prestar tesis (Bibliotecario)");
                System.out.println("11. Mostrar información de la tesis");
                System.out.println("12. Calcular multa del libro");
                System.out.println("13. Calcular multa de la revista");
                System.out.println("14. Calcular multa de la tesis");
                System.out.println("15. Listar materiales prestados");
                System.out.println("16. Salir");

                System.out.println("════════════════════════════════════════════");
                System.out.print("Seleccione una opción: ");

                try {
                    int opcion = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer

                    switch (opcion) {
                        case 1:
                            usuario.prestarLibro((Libro) materiales[0]);
                            break;
                        case 2:
                            bibliotecario.prestarLibro((Libro) materiales[0]);
                            break;
                        case 3:
                            estudiante.prestarLibro((Libro) materiales[0]);
                            break;
                        case 4:
                            bibliotecario.registrarLibro((Libro) materiales[0]);
                            break;
                        case 5:
                            materiales[0].mostrarInfo();
                            break;
                        case 6:
                            usuario.prestarRevista((Revista) materiales[1]);
                            break;
                        case 7:
                            bibliotecario.prestarRevista((Revista) materiales[1]);
                            break;
                        case 8:
                            materiales[1].mostrarInfo();
                            break;
                        case 9:
                            usuario.prestarTesis((Tesis) materiales[2]);
                            break;
                        case 10:
                            bibliotecario.prestarTesis((Tesis) materiales[2]);
                            break;
                        case 11:
                            materiales[2].mostrarInfo();
                            break;
                        case 12:
                            System.out.print("Ingrese los días de retraso: ");
                            int diasLibro = scanner.nextInt();
                            scanner.nextLine();
                            System.out.printf(" Multa del libro: $%.2f%n",
                                    materiales[0].calcularMulta(diasLibro));
                            break;
                        case 13:
                            System.out.print("Ingrese los días de retraso: ");
                            int diasRevista = scanner.nextInt();
                            scanner.nextLine();
                            System.out.printf(" Multa de la revista: $%.2f%n",
                                    materiales[1].calcularMulta(diasRevista));
                            break;
                        case 14:
                            System.out.print("Ingrese los días de retraso: ");
                            int diasTesis = scanner.nextInt();
                            scanner.nextLine();
                            System.out.printf(" Multa de la tesis: $%.2f%n",
                                    materiales[2].calcularMulta(diasTesis));
                            break;
                        case 15:
                            bibliotecario.listarMaterialesPrestados(materiales);
                            break;
                        case 16:

                            System.out.println("\n╔═══════════════════════════════════════════╗");
                            System.out.println("║ Gracias por usar el sistema ║");
                            System.out.println("║ ¡Hasta pronto! ║");
                            System.out.println("╚═══════════════════════════════════════════╝");
                            salir = true;
                            break;
                        default:
                            System.out.println(" Opción no válida. Intente nuevamente.");
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("❌ Error: Debe ingresar un número válido.");
                    scanner.nextLine(); // Limpiar buffer después del error
                }
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("❌ Error: El número de edición debe ser un valor numérico.");
        }

        scanner.close();
    }
}
