package org.example;

import java.time.LocalDate;

/**
 * @author angelelbetico24
 */
public class LibroFisico extends Libro {
    private String ubicacionEstanteria;
    private String estado; // "nuevo", "bueno", "deteriorado"

    public LibroFisico(String titulo, String autor, String isbn, LocalDate fechaPublicacion, int numeroPaginas, String genero, String ubicacionEstanteria, String estado) {
        super(titulo, autor, isbn, fechaPublicacion, numeroPaginas, genero);
        this.ubicacionEstanteria = ubicacionEstanteria;
        this.estado = estado;

    }

    @Override
    public String getTipoFormato() {
        return "Fisico";
    }

    @Override
    public int diasMaximoPrestamo() {
        return 14;
    }
    @Override
    public boolean puedeSerPrestado() {
        if (estado.equals("deteriorado")) {
            return false;
        } else{
            return true;
        }
    }
// TODO: Constructor
// TODO: diasMaximoPrestamo() = 14 días
// TODO: getTipoFormato() = "Físico"
// TODO: puedeSerPrestado() considera el estado
}

