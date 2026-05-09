/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

/**
 *
 * @author Usuario
 */
public class Autor {
    
private String nacionalidad;
private String idiomaPrincipal;
private int premios;

    public Autor() {
    }
    public Autor(String nacionalidad, String idiomaPrincipal, int premios) {
        this.nacionalidad = nacionalidad;
        this.idiomaPrincipal = idiomaPrincipal;
        this.premios = premios;
        
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getIdiomaPrincipal() {
        return idiomaPrincipal;
    }

    public void setIdiomaPrincipal(String idiomaPrincipal) {
        this.idiomaPrincipal = idiomaPrincipal;
    }

    public int getPremios() {
        return premios;
    }

    public void setPremios(int premios) {
        this.premios = premios;
    }

    @Override
    public String toString() {
        return "Autor{" + "nacionalidad=" + nacionalidad + ", idiomaPrincipal=" + idiomaPrincipal + ", premios=" + premios + '}';
    }
    
    

  
    
    
            
}
