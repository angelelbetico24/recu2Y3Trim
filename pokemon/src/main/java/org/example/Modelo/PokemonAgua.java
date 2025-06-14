package org.example.Modelo;

/**
 * @author angelelbetico24
 */
public class PokemonAgua extends Pokemon {
    //Atributos
    private String habilidadesNado;
    private double tiempoBajoAgua;

    public PokemonAgua(int id, String nombre, int nivel, int hp, double ataque, double defensa, double velocidad) {
        super(id, nombre, nivel, hp, ataque, defensa, velocidad);
    }

    //Constructor


    //Getters y setters
    public String getHabilidadesNado() {
        return habilidadesNado;
    }

    public void setHabilidadesNado(String habilidadesNado) {
        this.habilidadesNado = habilidadesNado;
    }

    public double getTiempoBajoAgua() {
        return tiempoBajoAgua;
    }

    public void setTiempoBajoAgua(double tiempoBajoAgua) {
        this.tiempoBajoAgua = tiempoBajoAgua;
    }

}
