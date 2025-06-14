package org.example.Modelo;

/**
 * @author angelelbetico24
 */
public class PokemonFuego extends Pokemon {
    //Atributos
    private double temperaturaCorporal;
    private double resistenciaCalor;

    //Constructor
    public PokemonFuego(int id, String nombre, int nivel, int hp, double ataque, double defensa, double velocidad) {
        super(id, nombre, nivel, hp, ataque, defensa, velocidad);
    }
    //Getters y setters
    public double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(double temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public double getResistenciaCalor() {
        return resistenciaCalor;
    }

    public void setResistenciaCalor(double resistenciaCalor) {
        this.resistenciaCalor = resistenciaCalor;
    }
}
