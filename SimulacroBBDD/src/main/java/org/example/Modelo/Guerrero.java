package org.example.Modelo;

/**
 * @author angelelbetico24
 */
public class Guerrero extends ModeloPersonaje implements Atacante{
    //Atributos
    protected int fuerza;
    protected int armadura;
    protected String arma;

    public Guerrero(String id, String nombre, int nivel, int vidaMax, int vidaActual, int fuerza, int armadura, String arma) {
        super(id, nombre, nivel, vidaMax, vidaActual);
        this.fuerza = fuerza;
        this.armadura = armadura;
        this.arma = arma;
    }
    //Getters y setters
    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public int calcularDanioAtaque() {
        if (arma.equals("Espada")) {
            return fuerza*2+20;
        }else if (arma.equals("Hacha")) {
            return fuerza*2+35;
        }else if (arma.equals("Martillo")) {
            return fuerza*2+50;
        }else{
            return fuerza*2+10;
        }
    }

    @Override
    public boolean puedeAtacar() {
        return true;
    }

    //No se utiliza
    @Override
    public void ejecutarAtaque(ModeloPersonaje objetivo) {

    }
    //No se usa la de arriba?
    @Override
    public String obtenerTipoAtaque() {
        return "FISICO";
    }

    @Override
    public int calcularExperienciaDrop() {
        return nivel*fuerza*10;
    }
}
