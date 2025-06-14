package org.example.Modelo;

/**
 * @author angelelbetico24
 */
public class Paladin extends Guerrero implements Magico{
    //Atributos
    private int fe;
    private int manaMax;
    private int manaActual;

    //Contructor
    public Paladin(String id, String nombre, int nivel, int vidaMax, int vidaActual, int fuerza, int armadura, String arma, int fe, int manaMax, int manaActual) {
        super(id, nombre, nivel, vidaMax, vidaActual, fuerza, armadura, arma);
        this.fe = fe;
        this.manaMax = 50;
        this.manaActual = 50;
    }
    //Getters y setters
    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public int getManaMax() {
        return manaMax;
    }

    public void setManaMax(int manaMax) {
        this.manaMax = manaMax;
    }

    public void setManaActual(int manaActual) {
        this.manaActual = manaActual;
    }

    public int getManaActual() {
        return manaActual;
    }

    @Override
    public boolean lanzarHechizo(String hechizo, ModeloPersonaje objetivo) {
        System.out.println("Lanzando Hechizo....");
        return true;
    }

    @Override
    public void regenerarMana(int cantidad) {

    }
    @Override
    public int calcularDanioAtaque() {
        return (fuerza+fe) * 2;
    }
}
