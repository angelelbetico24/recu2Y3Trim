package ejer2;
import java.util.*;
/**
 * @author angelelbetico24
 */
public class Clase {
    protected String nombreClase;
    protected String codigoClase;
    protected List<Estudiante> listaEstudiante = new ArrayList<>();

    //Constructor
    public Clase(String nombreClase, String codigoClase) {
        this.nombreClase = nombreClase;
        this.codigoClase = codigoClase;
    }

    //Getters y setters
    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public String getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(String codigoClase) {
        this.codigoClase = codigoClase;
    }
}
