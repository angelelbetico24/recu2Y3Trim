package act3;

/**
 * @author angelelbetico24
 */
public class StockInsuficienteException extends RuntimeException {
    public StockInsuficienteException() {
      System.out.println("No hay stock disponible");
    }
}
