package act3;

import java.util.*;

/**
 * @author angelelbetico24
 */
public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Agregar un producto(1)\nVender un producto(2)\n" +
                    "Eliminar un producto del inventario(3)\nListar productos(4)\n" +
                    "Salir del programa(5)");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el codigo");
                    String codigo = sc.next();
                    System.out.println("Ingrese el nombre");
                    String nombre = sc.next();
                    System.out.println("Ingrese el precio");
                    double precio = sc.nextDouble();
                    System.out.println("Ingrese la cantidad");
                    int cantidad = sc.nextInt();
                    Producto p1 = new Producto(codigo,nombre,precio,cantidad);
                    inventario.agregarProducto(p1);
                    break;
                case 2:
                    System.out.println("Ingrese el codigo");
                    String codigo2 = sc.next();
                    System.out.println("Ingrese la cantidad");
                    int cantidad2 = sc.nextInt();
                    inventario.venderProducto(codigo2,cantidad2);
                    break;
                case 3:
                    System.out.println("Ingrese el codigo");
                    String codigo3 = sc.next();
                    inventario.eliminarProducto(codigo3);
                    break;
                case 4:
                    inventario.listarProductos();
                    break;
                case 5:
                    System.out.println("Adios");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
}
