package org.example.Modelo;

/**
 * @author angelelbetico24
 */
public interface Atacante {
    int calcularDanioAtaque();
    boolean puedeAtacar();
    void ejecutarAtaque(ModeloPersonaje objetivo);
    String obtenerTipoAtaque();
}
