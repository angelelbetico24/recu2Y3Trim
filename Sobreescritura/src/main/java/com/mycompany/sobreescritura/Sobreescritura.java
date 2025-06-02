package com.mycompany.sobreescritura;

import java.util.ArrayList;

/**
 *
 * @author PC-03
 */
public class Sobreescritura {

    public static void main(String[] args) {
        Perro p = new Perro();
        Gato g = new Gato();
        Pajaro p1 = new Pajaro();
        ArrayList<Animal> animales = new ArrayList<Animal>();
        animales.add(p);
        animales.add(g);
        animales.add(p1);
        for(Animal animal : animales){
            animal.hacerSonido();
        }
        
        
    }
}
