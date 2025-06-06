package ejer1;

import java.util.*;

/**
 * @author angelelbetico24
 */
public class Socio {
    Scanner sc = new Scanner(System.in); //escaner
    private String idSocio;
    private String nombreSocio;
    private String direccion;
    private String telefono;
    private List<Libro> listaLibros;

    //Constructor
    public Socio(String idSocio, String nombreSocio, String direccion, String telefono) {
        this.idSocio = idSocio;
        this.nombreSocio = nombreSocio;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    //Getters y setters
    public String getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(String idSocio) {
        this.idSocio = idSocio;
    }

    public String getNombreSocio() {
        return nombreSocio;
    }

    public void setNombreSocio(String nombreSocio) {
        this.nombreSocio = nombreSocio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //Metodos
    public void prestarLibro(Libro libro) {
        System.out.println("Introduce el libro que quieres coger prestado");
        String titulo = sc.nextLine();
        if (titulo.equals(libro.getTitulo())) {
            System.out.println("Libro existente.\n Comprobando disponibilidad...");
            if (libro.disponibilidad()) {
                System.out.println("El libro "+titulo+" esta disponible");
                libro.setDisponible(false);
            }else{
                System.out.println("El libro "+titulo+" no esta disponible");

            }
        }
    }

    public void devolverLibro(Libro libro) {
        System.out.println("Introduce el libro que quieres devolver");
        String titulo = sc.nextLine();
        if (titulo.equals(libro.getTitulo())) {
            libro.setDisponible(true);
            System.out.println("Libro devuelto correctamente");
        }else{
            System.out.println("El libro "+titulo+" no existe");
        }
    }
}
