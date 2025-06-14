package org.example.Modelo;

/**
 * @author angelelbetico24
 */
public abstract class ModeloPersonaje {
    //Atributos
    protected String id;
    protected String nombre;
    protected int nivel;
    protected int vidaMax;
    protected int vidaActual;

    //Constructor
    public ModeloPersonaje(String id, String nombre, int nivel, int vidaMax, int vidaActual) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.vidaMax = vidaMax;
        this.vidaActual = vidaMax;
    }
    //Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }
    //Metodos
    public abstract int calcularExperienciaDrop();
    public final boolean estaVivo(){
        return vidaActual > 0;
    }
    public void recibirDanio(int danio){
        if (vidaActual-danio > 0){
            vidaActual -= danio;
        }else{
            System.out.println("La vida a llegado a 0");
        }
    }
}
