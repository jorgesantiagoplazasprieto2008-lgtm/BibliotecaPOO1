package com.biblioteca;

public class Libro extends Material {
    // Atributos específicos de Libro
    private String autor;
    private String isbn;
    // Constructor: llama al constructor de la clase padre con super()
    public Libro(String id, String titulo, String autor, String isbn) {
        super(id, titulo); // Inicializa atributos de Material
        this.autor = autor;
        this.isbn = isbn;
    }
    // Getters específicos
    public String getAutor() {
        return autor;
    }
    public String getIsbn() {
        return isbn;
    }
    // Sobrescribir método para mostrar información específica de Libro
    @Override
    public void mostrarInfo() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println(" LIBRO");
        System.out.println(" ID: " + id);
        System.out.println(" Título: " + titulo);
        System.out.println(" Autor: " + autor);
        System.out.println(" ISBN: " + isbn);
        System.out.println(" Estado: " + (prestado ? "Prestado" : "Disponible"));
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
}

