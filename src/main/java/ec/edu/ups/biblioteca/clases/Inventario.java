/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author ASUS_USER
 */
public class Inventario {
    
    private int totalLibros;
    private int librosDisponibles;
    private List<Libro> libros;

    

    public Inventario() {
        this.totalLibros = 0;
        this.libros = new ArrayList<>();
        this.librosDisponibles = 0;
    }
    public void agregarLibro(Libro libro){
        this.libros.add(libro);
        this.totalLibros= this.libros.size();
        this.librosDisponibles++;
        System.out.println("Libro agregado al inventario");
    }
    public void eliminarLibro(Libro libro){
        this.libros.remove(libro);
        this.totalLibros--;
        System.out.println("Libro eliminado");
    }

    public int getTotalLibros() {
        return totalLibros;
    }

    public void setTotalLibros(int totalLibros) {
        this.totalLibros = totalLibros;
    }

    public int getLibrosDisponibles() {
        return librosDisponibles;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
    public void setLibrosDisponibles(int librosDisponibles) {
        this.librosDisponibles = librosDisponibles;
    }

    @Override
    public String toString() {
        return "Inventario{" + "totalLibros=" + totalLibros + ", librosDisponibles=" + librosDisponibles + ", libros=" + libros + '}';
    }
    
    
    
}
