package com.mycompany.repasorecudia03.figuras;

/**
 *
 * @author angelelbetico24
 */
public class Circulo extends FiguraBidimensional{
    protected double radio;

    public Circulo(String color, String nombre, double radio) {
        super(color, nombre);
        this.radio = radio;
    }

    @Override
    double calcularPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
    
}
