package com.mycompany.repasorecudia03.figuras;

/**
 *
 * @author angelelbetico24
 */
public class Triangulo extends FiguraBidimensional {
    protected double base;
    protected double altura;

    public Triangulo(String color, String nombre, double base, double altura) {
        super(color, nombre);
        this.base = base;
        this.altura = altura;
    }


    @Override
    double calcularPerimetro() {
        return 0.1;
    }

    @Override
    double calcularArea() {
        return base*altura;
    }
}
