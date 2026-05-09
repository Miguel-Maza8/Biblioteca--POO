/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

/**
 *
 * @author ASUS_USER
 */
public class Inventario {
    
    private int totalLibros;
    private int libros;
    private int librosDisponibles;

    public Inventario() {
    }

    public Inventario(int totalLibros, int libro, int librosDisponibles) {
        this.totalLibros = totalLibros;
        this.libros = libro;
        this.librosDisponibles = librosDisponibles;
    }

    public int getTotalLibros() {
        return totalLibros;
    }

    public void setTotalLibros(int totalLibros) {
        this.totalLibros = totalLibros;
    }

    public int getLibro() {
        return libros;
    }

    public void setLibro(int libro) {
        this.libros = libro;
    }

    public int getLibrosDisponibles() {
        return librosDisponibles;
    }

    public void setLibrosDisponibles(int librosDisponibles) {
        this.librosDisponibles = librosDisponibles;
    }
    
    
    
}
