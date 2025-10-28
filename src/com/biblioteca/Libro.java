package com.biblioteca;

public class Libro extends Material {
    private String autor;
    private String isbn;
    public Libro(String id, String titulo, String autor, String isbn) {
        super(id, titulo);
        this.autor = autor;
        this.isbn = isbn;
    }
    public String getAutor() {
        return autor;
    }
    public String getIsbn() {
        return isbn;
    }
    // Implementación del método abstracto (abstracción)
    @Override
    public double calcularMulta(int diasRetraso) {
        // Multa de $2.000 por día de retraso para libros
        return diasRetraso * 2.0;
    }
    // Implementación del método abstracto (abstracción)
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

