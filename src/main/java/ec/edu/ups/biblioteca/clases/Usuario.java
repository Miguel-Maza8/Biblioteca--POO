/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ASUS_USER
 */
public class Usuario extends Persona {
    
    private String codigoid;
    private List<Prestamo> historialDePrestamo;
    private Direccion direccion;

    public Usuario() {
        this.historialDePrestamo = new ArrayList<>();
      
    }

    public Usuario(
            String nombre,
             String apellido,
             String cedula,
             String fechaDeNacimiento,
             String telefono,
             String correoElectronico,
             String codigoid, 
             Direccion direccion
          
             ) { 
                super(nombre , apellido, cedula, fechaDeNacimiento, telefono, correoElectronico);
                this.codigoid = codigoid; 
                this.historialDePrestamo = new ArrayList<>();
                this.direccion = direccion;
      }

    public String getCodigoid() {
        return codigoid;
    }

    public void setCodigoid(String codigoid) {
        this.codigoid = codigoid;
    }

    public List<Prestamo> getHistorialDePrestamo() {
        return historialDePrestamo;
    }

    public void setHistorialDePrestamo(List<Prestamo> historialDePrestamo) {
        this.historialDePrestamo = historialDePrestamo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
    
    public List<Prestamo> historialDePrestamos() {
        return historialDePrestamo;
    }
    public void modificarId(String nuevo) {
        this.codigoid = nuevo;
        System.out.println("ID de usuario modificado exitosamente a: " + this.codigoid);
    }
    public List<Prestamo> consultarPrestamo() {
        System.out.println("Historial de Préstamos para el ID: " + this.codigoid );
        if (historialDePrestamo.isEmpty()) {
            System.out.println("No hay préstamos registrados para este usuario.");
        }
        return this.historialDePrestamo;
    }


    @Override
    public String toString() {
        return super.toString()+"Usuario{" + "codigoid=" + codigoid + ", historialDePrestamo=" + historialDePrestamo + ", direccion=" + direccion + '}';
    }
    
}   
