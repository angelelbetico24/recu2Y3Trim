package com.mycompany.repasorecudia03.figuras;

/**
 *
 * @author angelelbetico24
 */
public class Rectangulo extends FiguraBidimensional{
    protected double ancho;
    protected double alto;

    public Rectangulo(String color, String nombre, double ancho, double alto) {
        super(color, nombre);
        this.ancho = ancho;
        this.alto = alto;
    }

    //Getters y setters
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    
    @Override
    double calcularPerimetro() {
        return 0.2;
    }

    @Override
    double calcularArea() {
        return ancho*alto;
    }
    
}
