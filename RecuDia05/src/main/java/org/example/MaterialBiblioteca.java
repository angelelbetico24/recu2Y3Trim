package org.example;

import java.time.LocalDate;

/**
 * @author angelelbetico24
 */
public abstract class MaterialBiblioteca {
    protected String titulo;
    protected String autor;
    protected String isbn;
    protected LocalDate fechaPublicacion;
    protected boolean prestado;

    public MaterialBiblioteca(String titulo, String autor, String isbn, LocalDate fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.fechaPublicacion = fechaPublicacion;
        this.prestado = false;
    }

    public abstract boolean puedeSerPrestado();

    public abstract int diasMaximoPrestamo();

    public void prestar() {
        if (puedeSerPrestado() && !prestado) {
            prestado = true;
            System.out.println(titulo + " ha sido prestado");
        } else {
            System.out.println("No se puede prestar " + titulo);
        }
    }

    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println(titulo + " ha sido devuelto");
        }
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

}