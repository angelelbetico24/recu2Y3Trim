package org.Animales;

/**
 *
 * @author PC-03
 */
public class Animal {
    protected String nombre;
    protected String raza;
    protected int edad;
    
    //Se ejecuta primero si en el main no ingresas todos los parametros
    public Animal(){
        
    }
    //Se ejecuta primero si en el main  ingresas todos los parametros
    public Animal(String nombre, String raza, int edad) {
        super(); //Esto hay que ponerlo siempre arriba
        this.raza = raza;
        this.edad = edad;
    }
    
}
