package ejer1;

/**
 * @author angelelbetico24
 */
public abstract class Producto {
    private String idProducto;
    private String nombreProducto;

    public Producto(String idProducto, String nombreProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
    }
    //Getters y setters

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public abstract boolean disponibilidad();
}
