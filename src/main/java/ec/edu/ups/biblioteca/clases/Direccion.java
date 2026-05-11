/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

/**
 *
 * @author Usuario
 */
public class Direccion {
    private String ciudad;
    private String parroquia;
    private String callePrincipal;
    private String codigoPostal;

    public Direccion() {
    }

    public Direccion(String ciudad, String parroquia, String callePrincipal, String codigoPostal) {
        this.ciudad = ciudad;
        this.parroquia = parroquia;
        this.callePrincipal = callePrincipal;
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    public void actualizarCodigoPostal(String ncodigo) {
        this.codigoPostal = ncodigo;
        System.out.println("Código postal actualizado a: " + this.codigoPostal);
    }
    @Override
    public String toString() {
        return "Direccion{" + "ciudad=" + ciudad + ", parroquia=" + parroquia + ", callePrincipal=" + callePrincipal + ", codigoPostal=" + codigoPostal + '}';
    }
    
    
}
