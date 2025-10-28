package com.biblioteca;

public class Libro {
    // Atributos privados (encapsulación)
    private String titulo;
    private String autor;
    private boolean prestado;
    // Constructor: inicializa un libro
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    // Getters y Setters: controlan el acceso a los atributos
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("❌ Error: El título no puede estar vacío.");
        }
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        if (autor != null && !autor.trim().isEmpty()) {
            this.autor = autor;
        } else {
            System.out.println("❌ Error: El autor no puede estar vacío.");
        }
    }
    public boolean isPrestado() {
        return prestado;
    }
    // Métodos de lógica de negocio
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("✅ El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println(" El libro '" + titulo + "' ya está prestado.");
        }
    }
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("✅ El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println(" El libro '" + titulo + "' no estaba prestado.");
        }
    }
    public void mostrarInfo() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println(" Título: " + titulo);
        System.out.println(" Autor: " + autor);
        System.out.println(" Estado: " + (prestado ? "Prestado" : "Disponible"));
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
}

