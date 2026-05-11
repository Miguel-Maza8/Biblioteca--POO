/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.biblioteca;
import ec.edu.ups.biblioteca.clases.Usuario;
import java.util.Scanner;
import java.util.ArrayList;
import ec.edu.ups.biblioteca.clases.Direccion;
import ec.edu.ups.biblioteca.clases.Bibliotecario;
import ec.edu.ups.biblioteca.clases.Autor;
import ec.edu.ups.biblioteca.clases.Libro;
import ec.edu.ups.biblioteca.clases.Prestamo;
import ec.edu.ups.biblioteca.clases.Inventario;
/**
 *
 * @author Usuario
 */
public class Biblioteca {

    public static void main(String[] args) {
       int opcion = 0 ;
       Scanner entrada = new Scanner(System.in);
       Inventario inventario = new Inventario();
       ArrayList<Usuario> usuarios = new ArrayList();
       ArrayList<Bibliotecario> bibliotecarios = new ArrayList();
       ArrayList<Autor> autores = new ArrayList();
       ArrayList<Libro> libros = new ArrayList();
       ArrayList<Prestamo> prestamos = new ArrayList();
       
        OUTER:
        while (opcion!=8) {
            System.out.println("----Biblioteca----");
            System.out.println("1.Registrar usuario ");
            System.out.println("2.Registrar bibliotecario ");
            System.out.println("3.Registrar autor ");
            System.out.println("4.Ingresar prestamo ");
            System.out.println("5.Registrar devolucion ");
            System.out.println("6.Ingresar Libro ");
            System.out.println("7.Ingresar al inventario");
            System.out.println("8.Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    {
                        System.out.println("---Registrar usuario---");
                        System.out.println("Ingrese su nombre: ");
                        String nombre = entrada.next();
                        System.out.println("Ingrese su apellido:");
                        String apellido = entrada.next();
                        System.out.println("Ingrese su cedula:");
                        String cedula = entrada.next();
                        System.out.println("Ingrese su fecha de nacimiento:");
                        String nacimiento = entrada.next();
                        System.out.println("Ingrese su telefono");
                        String telefono = entrada.next();
                        System.out.println("Ingrese su correo electronico:");
                        String correo = entrada.next();
                        System.out.println("Ingrese su ID: ");
                        String id = entrada.next();
                        System.out.println("Ingrese su direccion");
                        System.out.println("Ciudad: ");
                        String ciudad= entrada.next();
                        System.out.println("Parroquia");
                        String parroquias = entrada.next();
                        System.out.println("Calle Principal: ");
                        String calleP = entrada.next();
                        System.out.println("codigo postal: ");
                        String postal = entrada.next();
                        Usuario usuarito = new Usuario();
                        Direccion direccion = new Direccion();
                        usuarito.setNombre(nombre);
                        usuarito.setApellido(apellido);
                        usuarito.setCedula(cedula);
                        usuarito.setFechaDeNacimiento(nacimiento);
                        usuarito.setTelefono(telefono);
                        usuarito.setCorreoElectronico(correo);
                        usuarito.setCodigoid(id);
                        direccion.setCiudad(ciudad);
                        direccion.setParroquia(parroquias);
                        direccion.setCallePrincipal(calleP);
                        direccion.setCodigoPostal(postal);
                        usuarito.setDireccion(direccion);
                        usuarios.add(usuarito);
                        for(Usuario usuario : usuarios){
                            System.out.println(usuario);
                            System.out.println("Usuario registrado");
                        }    break;
                    }
                case 2:
                    {
                        System.out.println("----Registrar bibliotecario----");
                        System.out.println("Ingrese su nombre: ");
                        String nombre = entrada.next();
                        System.out.println("Ingrese su apellido:");
                        String apellido = entrada.next();
                        System.out.println("Ingrese su cedula:");
                        String cedula = entrada.next();
                        System.out.println("Ingrese su fecha de nacimiento:");
                        String nacimiento = entrada.next();
                        System.out.println("Ingrese su telefono");
                        String telefono = entrada.next();
                        System.out.println("Ingrese su correo electronico:");
                        String correo = entrada.next();
                        System.out.println("Ingrese su turno: ");
                        String turno = entrada.next();
                        System.out.println("Ingrese el numero de puesto:");
                        int puesto = entrada.nextInt();
                        System.out.println("Ingrese el sueldo:");
                        double sueldo = entrada.nextDouble();
                        Bibliotecario bibliotecario = new Bibliotecario();
                        bibliotecario.setNombre(nombre);
                        bibliotecario.setApellido(apellido);
                        bibliotecario.setCedula(cedula);
                        bibliotecario.setFechaDeNacimiento(nacimiento);
                        bibliotecario.setTelefono(telefono);
                        bibliotecario.setCorreoElectronico(correo);
                        bibliotecario.setTurno(turno);
                        bibliotecario.setPuesto(puesto);
                        bibliotecario.setSueldo(sueldo);
                        bibliotecarios.add(bibliotecario);
                        for( Bibliotecario bibliotecaritos : bibliotecarios){
                            System.out.println(bibliotecaritos);
                            System.out.println("Bibliotecario registrado");
                        }    break;
                    }
                case 3:
                    {
                        System.out.println("---Registrar autor---");
                        System.out.println("Ingrese el nombre: ");
                        String autor = entrada.next();
                        System.out.println("Ingrese la nacionalidad: ");
                        String nacionalidad = entrada.next();
                        System.out.println("Ingrese los premios:");
                        int premio = entrada.nextInt();
                        Autor autorsito = new Autor();
                        autorsito.setNombre(autor);
                        autorsito.setNacionalidad(nacionalidad);
                        autorsito.setIdiomaPrincipal(nacionalidad);
                        autorsito.setPremios(premio);
                        autores.add(autorsito);
                        for( Autor autorsitos : autores){
                            System.out.println(autorsitos);
                            System.out.println("Autor registrado");
                        }    break;
                    }
                case 4:
                    System.out.println("---Ingresar prestamo----");
                    System.out.println("Ingrese la fecha de inicio: ");
                    String inicio = entrada.next();
                    System.out.println("Ingrese la fecha de devolucion: ");
                    String devolucion = entrada.next();
                    System.out.println("Ingrese los dias de retraso:");
                    int retraso = entrada.nextInt();
                    Prestamo prestamo = new Prestamo();
                    prestamo.setFechaInicio(inicio);
                    prestamo.setDevolucion(devolucion);
                    prestamo.setDiasDeRetrado(retraso);
                    prestamo.setLibros(libros);
                    prestamos.add(prestamo);
                    for(Prestamo prestamoss : prestamos){
                        System.out.println(prestamoss);
                        System.out.println("Prestamo registrado");
                    }break;
                case 5:
                    {
                        System.out.println("---Registrar devolucion---");
                        System.out.println("Ingrese el nombre del libro prestado:");
                        String libro = entrada.next();
                        System.out.println("Ingrese los dias de retraso");
                        int dias = entrada.nextInt();
                        double multa = dias * 3 ;
                        System.out.println("Se registro la devolucion:"+ libro);
                        System.out.println("Total a pagar: "+ multa);
                        break;
                    }
                case 6:
                    {
                        if (autores.isEmpty()) {
                            System.out.println("Autor no registrado");
                            break ;
                        }
                        System.out.println("---Ingresar libro---");
                        System.out.println("Ingrese el titulo del libro:");
                        String titulo = entrada.next();
                        System.out.println("Ingrese el Genero:");
                        String genero = entrada.next();
                        System.out.println(" Ingrese el Codigo:");
                        int codigo = entrada.nextInt();
                        System.out.println("Ingrese el Paginas:");
                        int paginas = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Ingrese la Editorial:");
                        String editorial = entrada.nextLine();
                        System.out.println("Fecha de publicacion:");
                        String fechaPublicacion = entrada.nextLine();
                        Autor autor = autores.get(autores.size() - 1);
                        Libro libro = new Libro();
                        libro.setTitulo(titulo);
                        libro.setGenero(genero);
                        libro.setCodigo(codigo);
                        libro.setPaginas(paginas);
                        libro.setEditorial(editorial);
                        libro.setFechaPublicacion(fechaPublicacion);
                        libro.setAutor(autor);
                        libros.add(libro);
                        inventario.agregarLibro(libro);
                        for(Libro libross : libros){
                            System.out.println(libross);
                            System.out.println("Libro registrado");
                        }    break;
                    }
                case 7:
                    System.out.println("Revisar inventario");
                    //inventario.agregarLibro(libro);
                    System.out.println(inventario);
                    break;
                default:
                    break;
            }
        }
       
       
      
       
        
    }
}
