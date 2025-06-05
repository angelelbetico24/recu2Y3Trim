package org.example;

import java.time.LocalDate;

/**
 * @author angelelbetico24
 */
public abstract class Libro extends MaterialBiblioteca {
    protected int numeroPaginas;
    protected String genero;
    public Libro(String titulo, String autor, String isbn, LocalDate fechaPublicacion, int numeroPaginas, String genero) {
        super(titulo, autor, isbn, fechaPublicacion);
        // TODO: Implementar constructor
        // TODO: Validar que numeroPaginas > 0
        if (numeroPaginas > 0){
            this.numeroPaginas = numeroPaginas;
        }
        this.genero = genero;
    }
    @Override
    public boolean puedeSerPrestado() {
        return true; // Los libros siempre se pueden prestar
    }
    public abstract String getTipoFormato();
}
