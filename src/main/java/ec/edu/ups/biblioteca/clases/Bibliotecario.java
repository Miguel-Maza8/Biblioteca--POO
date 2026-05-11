/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

import java.time.LocalDate;

/**
 *
 * @author ASUS_USER
 */
public class Bibliotecario extends Persona {
    private String turno;
    private int puesto;
    private double sueldo;
    private Inventario inventario;
    public Bibliotecario() {
    }

    public Bibliotecario(
             String nombre,
             String apellido,
             String cedula,
             String fechaDeNacimiento,
             String telefono,
             String correoElectronico,
             String turno,
             int puesto,
             double sueldo,
             Inventario inventario
      ) {  
        super(nombre , apellido, cedula, fechaDeNacimiento, telefono, correoElectronico);
        this.puesto = puesto;
        this.sueldo= sueldo;
        this.turno= turno;
        this.inventario = inventario; 
    }
    
    
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
    
    @Override
    public String toString() {
        return super.toString()+
                "Bibliotecario{" + 
                "turno=" + turno +
                ", puesto=" + puesto + 
                ", sueldo=" + sueldo + '}';
    }
    
}
   
           
       
            
    

