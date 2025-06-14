package ejer2;

/**
 * @author angelelbetico24
 */
public class Asistencia {
    //Atributos
    protected String fecha;
    protected String estado;
    protected String idClase;

    //Constructor
    public Asistencia(String fecha, String estado, String idClase) {
        this.fecha = fecha;
        this.estado = estado;
        this.idClase = idClase;
    }

    //Getters y setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdClase() {
        return idClase;
    }

    public void setIdClase(String idClase) {
        this.idClase = idClase;
    }
}
