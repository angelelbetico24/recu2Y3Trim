package org.example.Modelo;

/**
 * @author angelelbetico24
 */
public interface Magico {
    boolean lanzarHechizo(String hechizo, ModeloPersonaje objetivo);
    void regenerarMana(int cantidad);
}
