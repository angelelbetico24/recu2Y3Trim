package org.example;

/**
 * @author angelelbetico24
 */
public class Coche extends Vehiculo{
    private int numPuertas;

    //Constructores
    public Coche() {
        super("","",0);
    }

    public Coche(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }



    public void abrirMaletero(){
        System.out.println("Abriendo maletero. Cabezon");
    }
    
    @Override
    public void arrancar(){
        System.out.println("Arrancando con "+numPuertas+" puertas.");
    }
    @Override
    public void mostrarInfo(){
        System.out.println("Marca: "+marca+".\nModelo: "+modelo+".\nAño: "+anio+"\n Numero de puertas: "+numPuertas+".");
    }
}
