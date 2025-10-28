package com.biblioteca;

public class Usuario {
        // Atributos
        protected String nombre;
        protected String identificacion;
        // Constructor
        public Usuario(String nombre, String identificacion) {
            this.nombre = nombre;
            this.identificacion = identificacion;
        }
        // Getters
        public String getNombre() {
            return nombre;
        }
        public String getIdentificacion() {
            return identificacion;
        }
        // Método que será sobrescrito (polimorfismo)
        public void prestarLibro(Libro libro) {
            System.out.println(" Usuario " + nombre + " solicita préstamo.");
            libro.prestar();
        }
        public void prestarRevista(Revista revista) {
            System.out.println(" Usuario " + nombre + " solicita préstamo de revista.");
            revista.prestar();
        }
        public void mostrarInfo() {
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println(" USUARIO");
            System.out.println(" Nombre: " + nombre);
            System.out.println(" Identificación: " + identificacion);
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        }
    }
