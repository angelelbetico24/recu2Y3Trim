package herenciasConAbstractas;

/**
 * @author angelelbetico24
 */
public abstract class Vehiculo {
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

    public abstract void arrancar();

    public final void mostrarGarantia(){
        System.out.println("La garantia son mis dos huevazos");
    }
    


}
