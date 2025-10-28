package com.biblioteca;

public abstract class Material {
    // Atributos protegidos (accesibles por subclases)
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
    // Métodos concretos (implementación compartida)
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
    // Método abstracto: cada subclase debe implementarlo
    public abstract double calcularMulta(int diasRetraso);
    // Método abstracto: cada subclase define cómo mostrar su información
    public abstract void mostrarInfo();
}