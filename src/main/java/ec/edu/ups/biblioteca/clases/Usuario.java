/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

/**
 *
 * @author ASUS_USER
 */
public class Usuario {
    
    private String codigoid;
    private String telefono;

    public Usuario() {
    }

    public Usuario(String codigoid, String telefono) {
        this.codigoid = codigoid;
        this.telefono = telefono;
    }

    public String getCodigoid() {
        return codigoid;
    }

    public void setCodigoid(String codigoid) {
        this.codigoid = codigoid;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
