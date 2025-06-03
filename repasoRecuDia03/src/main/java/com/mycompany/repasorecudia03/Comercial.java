package com.mycompany.repasorecudia03;

/**
 *
 * @author angelelbetico24
 */
public class Comercial extends EmpleadoFijo {
    protected double ventas;
    protected double comision;

    //Constructor
    public Comercial(String nombre, String dni, int salarioBase, double complementos, double ventas, double comision) {
        super(nombre, dni, salarioBase, complementos);
        this.ventas = ventas;
        this.comision = comision;
    }
    //Getters y setters
    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    @Override
    double calcularSalario() {
        return salarioBase + complementos + (ventas * comision / 100);
    }
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + " ventas  = "+ventas + " y cobra una comision del  "+comision+"%";
    }
    
}
