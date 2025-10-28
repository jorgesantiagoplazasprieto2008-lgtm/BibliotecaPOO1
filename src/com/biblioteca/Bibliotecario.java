package com.biblioteca;

public class Bibliotecario extends Usuario {
    // Constructor
    public Bibliotecario(String nombre, String identificacion) {
        super(nombre, identificacion);
    }
    // Método específico del bibliotecario
    public void registrarLibro(Libro libro) {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println(" Bibliotecario " + nombre + " registra el libro:");
        libro.mostrarInfo();
        System.out.println("✅ Libro registrado exitosamente en el sistema.");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
    // Método para listar todos los materiales prestados (usando abstracción y polimorfismo)
    public void listarMaterialesPrestados(Material[] materiales) {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println(" ║ MATERIALES ACTUALMENTE PRESTADOS ║");
        System.out.println(" ╚════════════════════════════════════════╝");

        boolean hayPrestados = false;

        for (Material material : materiales) {
            if (material != null && material.isPrestado()) {
                hayPrestados = true;

                // Polimorfismo: cada material muestra su información de manera diferente
                if (material instanceof Libro) {
                    Libro libro = (Libro) material;
                    System.out.println("\n LIBRO PRESTADO:");
                    System.out.println(" ID: " + libro.getId());
                    System.out.println(" Título: " + libro.getTitulo());
                    System.out.println(" Autor: " + libro.getAutor());
                    System.out.println(" ISBN: " + libro.getIsbn());
                } else if (material instanceof Revista) {
                    Revista revista = (Revista) material;
                    System.out.println("\n REVISTA PRESTADA:");
                    System.out.println(" ID: " + revista.getId());
                    System.out.println(" Título: " + revista.getTitulo());
                    System.out.println(" Edición: " + revista.getNumeroEdicion());
                } else if (material instanceof Tesis) {
                    Tesis tesis = (Tesis) material;
                    System.out.println("\n TESIS PRESTADA:");
                    System.out.println(" ID: " + tesis.getId());
                    System.out.println(" Título: " + tesis.getTitulo());
                    System.out.println(" Autor: " + tesis.getAutor());
                }
            }
        }

        if (!hayPrestados) {
            System.out.println("\n✅ No hay materiales prestados actualmente.");
        }

        System.out.println("\n════════════════════════════════════════\n");
    }
    // Sobrescribir prestarLibro (polimorfismo)
    @Override
    public void prestarLibro(Libro libro) {
        System.out.println(" Bibliotecario " + nombre + " autoriza el préstamo.");
        libro.prestar();
    }
    // Método adicional para prestar revistas
    public void prestarRevista(Revista revista) {
        System.out.println(" Bibliotecario " + nombre + " autoriza el préstamo de revista.");
        revista.prestar();
    }
    // Método adicional para prestar tesis
    public void prestarTesis(Tesis tesis) {
        System.out.println(" Bibliotecario " + nombre + " autoriza el préstamo de tesis.");
        System.out.println(" Recordatorio: Las tesis tienen una multa de $3.000 por día de retraso.");
                tesis.prestar();
    }
    // Sobrescribir mostrarInfo
    @Override
    public void mostrarInfo() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println(" BIBLIOTECARIO");
        System.out.println(" Nombre: " + nombre);
        System.out.println(" Identificación: " + identificacion);
        System.out.println(" Permisos: Administrador del sistema");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
}
