package org.example.Modelo;

/**
 * @author angelelbetico24
 */
public class Pokemon {
    //Atributos
    protected int id;
    protected String nombre;
    protected int nivel;
    protected int hp;
    protected double ataque;
    protected double defensa;
    protected double velocidad;
    //Constructor
    public Pokemon(int id, String nombre, int nivel, int hp, double ataque, double defensa, double velocidad) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.hp = hp;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
    }
    //Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

}
