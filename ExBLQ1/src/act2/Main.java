package act2;

/**
 * @author angelelbetico24
 */
public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Pepe",19,5.9);
        Estudiante e2 = new Estudiante("Alfonsete",17,6.9);
        Curso c1 = new Curso("sdfv","Mate");
        //Inscribir estudiante
        c1.inscribirEstudiante(e1);
        c1.inscribirEstudiante(e2);
        //Listar estudiantes
        c1.listaEstudiantes();
        //Mostrar calificacion
        e1.obtenerCalificacion();
        e2.obtenerCalificacion();
    }
}
