/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciasConAbstractas;

/**
 *
 * @author PC-03
 */
public class VehiculoElectrico extends Vehiculo{
    private int autonomiaKm;

    //Constructores
    public VehiculoElectrico() {
        super("", "", 2000);
    }

    public VehiculoElectrico(int autonomiaKm, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.autonomiaKm = autonomiaKm;
    }
    

    @Override
    public void arrancar() {
        
    }
    
}
