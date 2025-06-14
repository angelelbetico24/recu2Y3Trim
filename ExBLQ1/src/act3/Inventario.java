package act3;

import java.util.*;

/**
 * @author angelelbetico24
 */
public class Inventario {
    //Atributos
    HashMap<String,Producto> productos;

    //Constructor
    public Inventario() {
        productos = new HashMap<>();
    }
    //Metodo
    public void agregarProducto(Producto producto) {
        //put = add
        if (productos.containsKey(producto.getCodigo())) {
            ProductoDuplicadoException productoDuplicadoException = new ProductoDuplicadoException();
            throw productoDuplicadoException;
        }else{
            productos.put(producto.getCodigo(),producto);
            System.out.println("Agregado el producto: " + producto.getCodigo());
        }
    }
    public void eliminarProducto(String codigo){
        if(productos.containsKey(codigo)){
            productos.remove(codigo);
        }else{
            ProductoNoEncontradoException se = new ProductoNoEncontradoException();
            throw se;
        }
    }
    public void venderProducto(String codigo, int cantidad) {
        if(productos.containsKey(codigo)) {
            Producto producto = productos.get(codigo);
            int cantAct = producto.getCantidad()-cantidad;
            if (cantAct <0){
                StockInsuficienteException se = new StockInsuficienteException();
                throw se;
            }else{
                producto.setCantidad(cantAct);
            }
        }else{
            ProductoNoEncontradoException se = new ProductoNoEncontradoException();
            throw se;
        }
    }
    public List<Producto> listarProductos() {
        List<Producto> listaProductos = new ArrayList<>();
        for (Producto producto : productos.values()) {
            System.out.println("Producto: " + producto.getCodigo());
        }
        return listaProductos;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "productos=" + productos +
                '}';
    }
}
