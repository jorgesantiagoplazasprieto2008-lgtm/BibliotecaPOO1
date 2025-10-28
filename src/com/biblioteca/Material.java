package com.biblioteca;

public class Material {
        // Atributos comunes a todos los materiales
        protected String id;
        protected String titulo;
        protected boolean prestado;
        // Constructor
        public Material(String id, String titulo) {
            this.id = id;
            this.titulo = titulo;
            this.prestado = false;
        }
        // Getters
        public String getId() {
            return id;
        }
        public String getTitulo() {
            return titulo;
        }
        public boolean isPrestado() {
            return prestado;
        }
        // Métodos comunes
        public void prestar() {
            if (!prestado) {
                prestado = true;
                System.out.println("✅ Material '" + titulo + "' prestado.");
            } else {
                System.out.println(" Material '" + titulo + "' ya está prestado.");
            }
        }
        public void devolver() {
            if (prestado) {
                prestado = false;
                System.out.println("✅ Material '" + titulo + "' devuelto.");
            } else {
                System.out.println(" Material '" + titulo + "' no estaba prestado.");
            }
        }
        public void mostrarInfo() {
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println(" ID: " + id);
            System.out.println(" Título: " + titulo);
            System.out.println(" Estado: " + (prestado ? "Prestado" : "Disponible"));
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        }
    }
