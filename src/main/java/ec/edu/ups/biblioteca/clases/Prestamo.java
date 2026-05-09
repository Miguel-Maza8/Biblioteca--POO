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
public class Prestamo {
    
    private Date fechaInicio;
    private Date devolucion;
    private int diasDeRetrado;
    private String detallePrestamo;

    public Prestamo() {
    }

    public Prestamo(Date fechaInicio, Date devolucion, int diasDeRetrado, String detallePrestamo) {
        this.fechaInicio = fechaInicio;
        this.devolucion = devolucion;
        this.diasDeRetrado = diasDeRetrado;
        this.detallePrestamo = detallePrestamo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Date devolucion) {
        this.devolucion = devolucion;
    }

    public int getDiasDeRetrado() {
        return diasDeRetrado;
    }

    public void setDiasDeRetrado(int diasDeRetrado) {
        this.diasDeRetrado = diasDeRetrado;
    }

    public String getDetallePrestamo() {
        return detallePrestamo;
    }

    public void setDetallePrestamo(String detallePrestamo) {
        this.detallePrestamo = detallePrestamo;
    }
    
    
    
    
    
}
