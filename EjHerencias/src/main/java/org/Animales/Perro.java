package org.Animales;

/**
 *
 * @author PC-03
 */
public class Perro extends Animal{
    String raza;
    
    
    //Se ejecuta primero si en el main no ingresas parametros
    public Perro() {
    }
    //Se ejecuta primero si en el main ingresas todos los parametros
    public Perro(String nombre, String raza, int edad) {
        super(nombre, raza, edad);
    }
    //Se ejecuta primero si en el main ingresas el parametro nombre
    public Perro(String nombre){
        this.nombre = nombre;
    }
}
