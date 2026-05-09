/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Libro {
    
    private String titulo;
    private String genero;
    private int codigo;
    private int paginas;
    private String editorial;
    private Date fechaPublicacion;
    private Autor autor;

    public Libro() {
    }

    public Libro(String titulo, String genero, int codigo, int paginas, String editorial, Date fechaPublicacion, Autor autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.codigo = codigo;
        this.paginas = paginas;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", genero=" + genero + ", codigo=" + codigo + ", paginas=" + paginas + ", editorial=" + editorial + ", fechaPublicacion=" + fechaPublicacion + ", autor=" + autor + '}';
    }
    
    
    
    
}
