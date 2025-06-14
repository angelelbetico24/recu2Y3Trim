package org.example.Modelo;

/**
 * @author angelelbetico24
 */
public class PokemonElectrico extends Pokemon {
    //Atributos
    private double voltaje;
    private double capacidadCarga;

    //Constructor
    public PokemonElectrico(int id, String nombre, int nivel, int hp, double ataque, double defensa, double velocidad, double resistenciaCalor) {
        super(id, nombre, nivel, hp, ataque, defensa, velocidad);
        this.id = id;
        this.nombre = nombre;
    }
    //Getters y setters
    public double getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

}
