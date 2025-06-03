package com.mycompany.repasorecudia03;

/**
 *
 * @author angelelbetico24
 */
public abstract class Empleado {
    protected String nombre;
    protected String dni;
    protected int salarioBase;
    
    //Constructores
    public Empleado(String nombre, String dni, int salarioBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.salarioBase = salarioBase;
    }
    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }
    //Metodos para declarar en la clase:
    //Metodo abstracto
    abstract double calcularSalario();
    //Metodo que se pueda sobreescribir
    public String obtenerDetalles() {
        return "Empleado{" + "nombre=" + nombre + ", dni=" + dni;
    }
}
