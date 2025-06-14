package ejer2;

/**
 * @author angelelbetico24
 */
public abstract class Persona {
    protected String id;
    protected String nombre;
    protected String apellido;

    //Bob el constructor
    public Persona(String id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //Los que cogen y ponen
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    //Metodo abstracto
    public abstract void registrarAsistencia(String clase, String fecha);
}
