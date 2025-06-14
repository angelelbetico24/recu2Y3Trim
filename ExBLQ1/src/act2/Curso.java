package act2;

import java.util.*;

/**
 * @author angelelbetico24
 */
public class Curso {
    //Atributos
    private String codigoCurso;
    private String nombreCurso;
    private List<Estudiante> estudiantes = new ArrayList<>();

    //Constructor
    public Curso(String codigoCurso, String nombreCurso) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
    }

    //Getters y setters
    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    //Metodos
    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
    public void listaEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}
