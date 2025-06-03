package com.mycompany.repasorecudia03;

/**
 *
 * @author angelelbetico24
 */
public class EmpleadoFijo extends Empleado{
    protected double complementos;

    public EmpleadoFijo(String nombre, String dni, int salarioBase, double complementos) {
        super(nombre, dni, salarioBase);
        this.complementos = complementos;
    }

    @Override
    double calcularSalario() {
        return salarioBase + complementos;
    }
    
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + "complementos = "+complementos;
    }
}
