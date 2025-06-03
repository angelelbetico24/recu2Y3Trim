package org.example;

/**
 * @author angelelbetico24
 */
public class Motocicleta extends Vehiculo{
    private boolean tieneSideCar;

    //Constructor
    public Motocicleta() {
        super("","",0);
    }
    public Motocicleta(String marca, String modelo, int anio, boolean tieneSideCar) {
        super(marca, modelo, anio);
        this.tieneSideCar = tieneSideCar;
    }
    public void hacerCaballito(){
        System.out.println("Haciendo caballito. Te has reventao la cabeza");
    }

    @Override
    public void arrancar(){
        System.out.println("Arrancando con "+(tieneSideCar?"Sidecar":"No sidecar")+".");
    }
    @Override
    public void mostrarInfo(){
        System.out.println("Marca: "+marca+".\nModelo: "+modelo+".\nAño: "+anio+"\n Tiene sidecar: "+tieneSideCar+".");
    }
}
