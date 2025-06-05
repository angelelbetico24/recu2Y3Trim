package org.example;

import java.time.LocalDate;

/**
 * @author angelelbetico24
 */
public class LibroDigital extends Libro {
    private String formatoArchivo; // PDF, EPUB, MOBI
    private double tamañoMB;
    private String urlDescarga;

    public LibroDigital(String titulo, String autor, String isbn, LocalDate fechaPublicacion, int numeroPaginas, String genero, String formatoArchivo, double tamañoMB, String urlDescarga) {
        super(titulo, autor, isbn, fechaPublicacion, numeroPaginas, genero);
        this.formatoArchivo = formatoArchivo;
        this.tamañoMB = tamañoMB;
        this.urlDescarga = urlDescarga;
    }

    @Override
    public String getTipoFormato() {
        return formatoArchivo;
    }

    @Override
    public int diasMaximoPrestamo() {
        return 7;
    }
// TODO: Constructor
// TODO: diasMaximoPrestamo() = 7 días
// TODO: getTipoFormato() = formatoArchivo
}

