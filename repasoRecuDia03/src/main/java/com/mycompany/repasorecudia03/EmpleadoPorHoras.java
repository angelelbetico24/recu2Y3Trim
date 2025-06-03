package com.mycompany.repasorecudia03;

/**
 *
 * @author angelelbetico24
 */
public class EmpleadoPorHoras extends Empleado{
    protected int horasTrabajadas;
    protected double precioHora;

    //Constructor
    public EmpleadoPorHoras(String nombre, String dni, int salarioBase, int horasTrabajadas, double precioHora) {
        super(nombre, dni, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.precioHora = precioHora;
    }

    //Getters y setters
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    @Override
    double calcularSalario() {
        return horasTrabajadas * precioHora;
    }
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + "horas trabajadas  = "+horasTrabajadas + " y cobra la hora: "+precioHora;
    }
    
}
