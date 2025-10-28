package com.biblioteca;

class Revista extends Material {
    // Atributo específico de Revista
    private int numeroEdicion;

    // Constructor
    public Revista(String id, String titulo, int numeroEdicion) {
        super(id, titulo);
        this.numeroEdicion = numeroEdicion;
    }

    // Getter específico
    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    // Sobrescribir método para mostrar información específica de Revista
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
