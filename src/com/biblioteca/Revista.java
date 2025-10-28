package com.biblioteca;

public class Revista extends Material {
    private int numeroEdicion;
    public Revista(String id, String titulo, int numeroEdicion) {
        super(id, titulo);
        this.numeroEdicion = numeroEdicion;
    }
    public int getNumeroEdicion() {
        return numeroEdicion;
    }
    // Implementación del método abstracto (abstracción)
    @Override
    public double calcularMulta(int diasRetraso) {
        // Multa de $1.500 por día de retraso para revistas
        return diasRetraso * 1.5;
    }
    // Implementación del método abstracto (abstracción)
    @Override
    public void mostrarInfo() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println(" REVISTA");
        System.out.println(" ID: " + id);
        System.out.println(" Título: " + titulo);
        System.out.println(" Edición: " + numeroEdicion);
        System.out.println(" Estado: " + (prestado ? "Prestado" : "Disponible"));
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
}

