/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.Animales;

/**
 *
 * @author PC-03
 */
public class Mamifero {
    private String tipoPelo;

    //Se ejecuta primero si en el main no ingresas todos los parametros
    public Mamifero() {
        System.out.println("Constructor sin parametros");
    }
    
    //Se ejecuta primero si en el main ingresas todos los parametros
    public Mamifero(String tipoPelo) {
        this.tipoPelo = tipoPelo;
        System.out.println("Constructor con parametros");
    }
    
}
