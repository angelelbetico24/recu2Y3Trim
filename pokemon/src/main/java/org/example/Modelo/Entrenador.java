package org.example.Modelo;

/**
 * @author angelelbetico24
 */
public class Entrenador {
    //Atributos
    private String nombre;
    private String region;
    private int experiencia;
    //Constructor
    public Entrenador(String nombre, String region, int experiencia) {
        this.nombre = nombre;
        this.region = region;
        this.experiencia = experiencia;
    }
    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

}
