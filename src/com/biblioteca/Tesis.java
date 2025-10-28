package com.biblioteca;

public class Tesis extends Material {
    private String autor;
    public Tesis(String id, String titulo, String autor) {
        super(id, titulo);
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }
    // Implementación del método abstracto (abstracción)
    @Override
    public double calcularMulta(int diasRetraso) {
        // Multa de $3.000 por día de retraso para tesis (material más valioso)
        return diasRetraso * 3.0;
    }
    // Implementación del método abstracto (abstracción)
    @Override
    public void mostrarInfo() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println(" TESIS");
        System.out.println(" ID: " + id);
        System.out.println(" Título: " + titulo);
        System.out.println(" Autor: " + autor);
        System.out.println(" Estado: " + (prestado ? "Prestado" : "Disponible"));
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
}

