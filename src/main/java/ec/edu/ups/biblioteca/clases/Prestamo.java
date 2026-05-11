/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author Usuario
 */
public class Prestamo {
    
    private String fechaInicio;
    private String devolucion;
    private int diasDeRetrado;
    private List<Libro> libros;
    private double multa ;
    public Prestamo() {
        libros = new ArrayList<>();
    }

    public Prestamo(String fechaInicio, String devolucion, int diasDeRetrado, String detallePrestamo, double multa) {
        this.fechaInicio = fechaInicio;
        this.devolucion = devolucion;
        this.diasDeRetrado = diasDeRetrado;
        libros = new ArrayList<>();
        this.multa = multa;
    }
    public void agregarLibro(Libro unLibro) {
        this.libros.add(unLibro);
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(String devolucion) {
        this.devolucion = devolucion;
    }

    public int getDiasDeRetrado() {
        return diasDeRetrado;
    }

    public void setDiasDeRetrado(int diasDeRetrado) {
        this.diasDeRetrado = diasDeRetrado;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "fechaInicio=" + fechaInicio + ", devolucion=" + devolucion + ", diasDeRetrado=" + diasDeRetrado + ", libros=" + libros + ", multa=" + multa + '}';
    }
     
   
    
    
    
    
    
}
