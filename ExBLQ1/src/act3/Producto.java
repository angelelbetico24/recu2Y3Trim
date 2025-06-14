package act3;

/**
 * @author angelelbetico24
 */
public class Producto {
    //Atributos
    String codigo;
    String nombre;
    double precio;
    int cantidad;
    //Contructor
    public Producto(String codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    //Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    //Metodos
    public void actualizarCantidad(int cantidadNueva) {
        this.cantidad = cantidadNueva;
    }
    public double obtenerPrecioTotal() {
        return precio * cantidad;
    }
}
