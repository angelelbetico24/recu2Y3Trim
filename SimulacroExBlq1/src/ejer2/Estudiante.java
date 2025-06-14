package ejer2;

import java.util.*;

/**
 * @author angelelbetico24
 */
public class Estudiante extends Persona{
    //Atributos de la clase
    protected String curso;
    protected List<Asistencia> asis = new ArrayList<>();

    //Constructor
    public Estudiante(String id, String nombre, String apellido, String curso) {
        super(id, nombre, apellido);
        this.curso = curso;
    }
    //Getters y setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<Asistencia> getAsis() {
        return asis;
    }

    public void setAsis(List<Asistencia> asis) {
        this.asis = asis;
    }

    //Metodos heredados
    @Override
    public void registrarAsistencia(String clase, String fecha) {

    }
}
