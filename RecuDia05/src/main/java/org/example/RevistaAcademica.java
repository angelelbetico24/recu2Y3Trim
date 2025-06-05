package org.example;

import java.time.LocalDate;

/**
 * @author angelelbetico24
 */
public class RevistaAcademica extends Revista {
    private String areaConocimiento;
    private double factorImpacto;

    public RevistaAcademica(String titulo, String autor, String isbn, LocalDate fechaPublicacion, int numeroEdicion, String periodicidad, String areaConocimiento, double factorImpacto) {
        super(titulo, autor, isbn, fechaPublicacion, numeroEdicion, periodicidad);
        this.areaConocimiento = areaConocimiento;
        this.factorImpacto = factorImpacto;
    }

    @Override
    public boolean puedeSerPrestado() {
        // Solo si no es de los últimos 3 números
        if (numeroEdicion < getNumeroEdicion() - 3){
            return true;
        }else{
            return false;
        }
    }
}
