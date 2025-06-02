/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sobreescritura;

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
    public void hacerSonido(){
        System.out.println("guau");
    }
}

