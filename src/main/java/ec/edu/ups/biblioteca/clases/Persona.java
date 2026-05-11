/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;
/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private String fechaDeNacimiento;
    private String telefono;
    private String correoElectronico;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String cedula, String fechaDeNacimiento, String telefono, String correoElectronico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public void actualizarCorreo(String nuevoCorreo) {
    this.correoElectronico = nuevoCorreo;
    System.out.println("La dirección ha sido actualizada correctamente.");
}
    public void organizarLibros() {
    System.out.println("El bibliotecario " + this.nombre + " está organizando los libros por título");
    
    System.out.println("El inventario se a organizado");
}
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", fechaDeNacimiento=" + fechaDeNacimiento + ", telefono=" + telefono + ", correoElectronico=" + correoElectronico + '}';
    }
    
    
}

