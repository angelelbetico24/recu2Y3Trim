package ejer2;

import java.util.*;

/**
 * @author angelelbetico24
 */
public class Profesor extends Persona {
    protected String materia;
    protected List<Clase> clasesImpartidas = new ArrayList<>();
    //El que construye
    public Profesor(String id, String nombre, String apellido, String materia) {
        super(id, nombre, apellido);
        this.materia = materia;
    }
    //Getters y setters
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public List<Clase> getClasesImpartidas() {
        return clasesImpartidas;
    }

    public void setClasesImpartidas(List<Clase> clasesImpartidas) {
        this.clasesImpartidas = clasesImpartidas;
    }

    //Metodo sobreescrito
    @Override
    public void registrarAsistencia(String clase, String fecha) {

    }
}
