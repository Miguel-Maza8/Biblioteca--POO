/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

/**
 *
 * @author ASUS_USER
 */
public class Bibliotecario {
    private String turno;
    private int puesto;
    private double sueldo;
    private Inventario inventario;
    private String correoElectronico;
    private String telefono;

    public Bibliotecario() {
    }

    public Bibliotecario(String turno, int puesto, double sueldo, Inventario inventario, String correoElectronico, String telefono) {
        this.turno = turno;
        this.puesto = puesto;
        this.sueldo = sueldo;
        this.inventario = inventario;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Bibliotecario{" + "turno=" + turno + ", puesto=" + puesto + ", sueldo=" + sueldo + ", inventario=" + inventario + ", correoElectronico=" + correoElectronico + ", telefono=" + telefono + '}';
    }
    
    
           
       
            
    
}
