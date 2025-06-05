package org.example;

import java.time.LocalDate;

/**
 * @author angelelbetico24
 */
public abstract class Revista extends MaterialBiblioteca {
    protected int numeroEdicion;
    protected String periodicidad; // "mensual", "semanal", etc.

    public Revista(String titulo, String autor, String isbn, LocalDate fechaPublicacion, int numeroEdicion, String periodicidad) {
        super(titulo, autor, isbn, fechaPublicacion);
        this.numeroEdicion = numeroEdicion;
        this.periodicidad = periodicidad;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    @Override
    public int diasMaximoPrestamo() {
        return 3; // Las revistas se prestan por menos tiempo
    }
}

/*


*/