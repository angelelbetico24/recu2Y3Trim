package org.example;

/**
 * @author angelelbetico24
 */
public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }


    public void mostrarInfo(){
        System.out.println("Marca: "+marca+".\nModelo: "+modelo+".\nAño: "+anio+".");
    }

    public void arrancar(){
        System.out.println("Arrancando");
    }



}
