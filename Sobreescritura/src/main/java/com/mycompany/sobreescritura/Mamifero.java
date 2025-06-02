package com.mycompany.sobreescritura;

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

