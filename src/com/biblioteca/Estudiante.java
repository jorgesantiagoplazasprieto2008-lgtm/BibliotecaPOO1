package com.biblioteca;

public class Estudiante extends Usuario {
    // Atributo adicional
    private String carrera;
    // Constructor
    public Estudiante(String nombre, String identificacion, String carrera) {
        super(nombre, identificacion);
        this.carrera = carrera;
    }
    // Getter
    public String getCarrera() {
        return carrera;
    }
    // Polimorfismo: sobrescribir el método de la clase padre
    @Override
    public void prestarLibro(Libro libro) {
        System.out.println(" Estudiante " + nombre + " de " + carrera + " solicita préstamo.");
        System.out.println("✅ Los estudiantes tienen 14 días de préstamo.");
        libro.prestar();
    }
    // Sobrescribir mostrarInfo
    @Override
    public void mostrarInfo() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println(" ESTUDIANTE");
        System.out.println(" Nombre: " + nombre);
        System.out.println(" Identificación: " + identificacion);
        System.out.println(" Carrera: " + carrera);
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
}
