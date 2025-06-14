package org.example.Modelo;

/**
 * @author angelelbetico24
 */
public class Mago extends ModeloPersonaje implements Atacante,Magico{
    //Atributos
    private int inteligencia;
    private int manaMax;
    private int manaActual;

    /**
     *
     * Constructor
     */
    public Mago(String id, String nombre, int nivel, int vidaMax, int vidaActual, int inteligencia, int manaMax, int manaActual) {
        super(id, nombre, nivel, vidaMax, vidaActual);
        this.inteligencia = inteligencia;
        this.manaMax = manaMax;
        this.manaActual = manaMax;
    }

    /**
     * Getters y setters
     */
    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getManaActual() {
        return manaActual;
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

    /**
     *
     * Metodos sobreescritos beibe
     */
    @Override
    public int calcularDanioAtaque() {
        return inteligencia*2;
    }

    @Override
    public boolean puedeAtacar() {
        if (manaActual >= 30){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void ejecutarAtaque(ModeloPersonaje objetivo) {

    }

    @Override
    public String obtenerTipoAtaque() {
        return "MAGICO";
    }

    @Override
    public boolean lanzarHechizo(String hechizo, ModeloPersonaje objetivo) {
        if (hechizo.equals("Fireball")){
            manaActual -= 40;
            recibirDanio(inteligencia * 3);
        }else if (hechizo.equals("Lightning")){
            manaActual -= 60;
            recibirDanio(inteligencia * 5);
        }else if (hechizo.equals("Heal")){
            manaActual -= 25;
            vidaActual += 50 + inteligencia;
        }
        return true;
    }

    @Override
    public void regenerarMana(int cantidad) {

    }

    @Override
    public int calcularExperienciaDrop() {
        return nivel*inteligencia*15;
    }

    @Override
    public String toString() {
        return "Mago{\n" +
                "id='" + id +
                ",\ninteligencia=" + inteligencia +
                ",\nnombre='" + nombre +
                ",\nnivel=" + nivel +
                ",\nvidaMax=" + vidaMax +
                ",\nvidaActual=" + vidaActual +
                ",\nmanaMax=" + manaMax +
                ",\nmanaActual=" + manaActual +
                '}';
    }
}
