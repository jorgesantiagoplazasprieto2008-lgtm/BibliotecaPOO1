package com.biblioteca;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println(" ¡Bienvenido al Sistema de Biblioteca! ");
        System.out.println("===========================================");
        System.out.println();
        System.out.println("1. Salir");
        System.out.print("Seleccione una opción: ");

        try {
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Saliendo del sistema...");
            } else {
                System.out.println("Opción no válida.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("❌ Error: Debe ingresar un número válido.");
        } finally {
            scanner.close();
        }
    }
}