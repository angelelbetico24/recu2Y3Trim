package com.mycompany.repasorecudia03.figuras;

/**
 *
 * @author angelelbetico24
 */
abstract class FiguraBidimensional extends Figura{
    public FiguraBidimensional(String color, String nombre) {
        super(color, nombre);
    }
    void figura2d(){
        System.out.println("Es una figura 2D");
    }
    abstract double calcularPerimetro();
}
