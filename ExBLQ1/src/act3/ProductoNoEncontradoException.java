package act3;

/**
 * @author angelelbetico24
 */
public class ProductoNoEncontradoException extends RuntimeException {
    public ProductoNoEncontradoException() {
        System.out.println("No se encontro el producto");
    }
}
