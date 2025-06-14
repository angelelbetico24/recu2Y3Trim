package act3;

/**
 * @author angelelbetico24
 */
public class ProductoDuplicadoException extends RuntimeException {
    public ProductoDuplicadoException() {
        System.out.println("El producto ya existe");
    }
}
