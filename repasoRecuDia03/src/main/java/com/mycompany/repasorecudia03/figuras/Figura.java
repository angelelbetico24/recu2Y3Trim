package com.mycompany.repasorecudia03.figuras;

/**
 *
 * @author angelelbetico24
 */
abstract class Figura {
    protected String color;
    protected String nombre;

    //Constructor
    public Figura(String color, String nombre) {
        this.color = color;
        this.nombre = nombre;
    }

    //Getters y setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    abstract double calcularArea();
    void mostrarInfo(){
        System.out.println("Color: "+color+".\n Nombre: "+nombre+".\n");
    }
    
    
}
