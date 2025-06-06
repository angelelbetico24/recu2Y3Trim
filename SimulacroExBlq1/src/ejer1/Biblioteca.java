package ejer1;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

/**
 * @author angelelbetico24
 */
public class Biblioteca implements Gestionable{
    private List<Producto> productos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();
        boolean seguir = true;
        while(seguir){
            System.out.println("================================================");
            System.out.println("¿Quieres agregar un producto al inventario?(1) ¿Quieres agregar a un socio?(2), ¿Quieres que liste todos los libros disponibles?(3)" +
                    "¿Quieres coger prestado un libro?(4) ¿Quieres devolver un libro?(5)");
            System.out.println("================================================");
            int opc = sc.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Introduzca el id del producto");
                    String id = sc.next();
                    System.out.println("Introduzca el nombre del producto");
                    String nombre = sc.next();
                    System.out.println("Introduzca el isbn del producto");
                    String isbn = sc.next();
                    System.out.println("Introduzca el titulo del producto");
                    String titulo = sc.next();
                    System.out.println("Introduzca el autor del producto");
                    String autor = sc.next();
                    System.out.println("Introduzca el año de publicacion del producto");
                    int anio = sc.nextInt();
                    System.out.println("Esta disponible (S/N)");
                    boolean dispo;
                    if (sc.next().equalsIgnoreCase("S")){
                        dispo = true;
                    }else{
                        dispo = false;
                    }
                    b.agregarLibro(new Libro(id,nombre,isbn,titulo,autor,anio,dispo));
                    break;
                case 2:
                    System.out.println("Introduzca el id del socio");
                    String idSocio = sc.next();
                    System.out.println("Introduzca el nombre del socio");
                    String nombreSocio = sc.next();
                    System.out.println("Introduzca la direccion del socio");
                    String direccionSocio = sc.next();
                    System.out.println("Introduzca el telefono del socio");
                    String telefonoSocio = sc.next();
                    b.agregarSocio(new Socio(idSocio,nombreSocio,direccionSocio,telefonoSocio));
                    break;
                case 3:
                    b.listarLibrosDisponibles();
                    break;
                case 4:
                    System.out.println("Introduce el id del socio");
                    String idSocio2 = sc.next();
                    System.out.println("Introduzca el isbn del libro");
                    String isbn2 = sc.next();
                    b.prestarLibro(idSocio2, isbn2);
                    break;
                case 5:
                    System.out.println("Introduce el id del socio");
                    String idSocio3 = sc.next();
                    System.out.println("Introduzca el isbn del libro");
                    String isbn3 = sc.next();
                    b.devolverLibro(idSocio3, isbn3);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println("¿Quieres hacer alguna gestion mas? (S/N)");
            if (sc.next().equalsIgnoreCase("N")){
                seguir = false;
                System.out.println("¡Tenga un buen dia!");
            }
        }
    }

    //Metodos sobreescritos
    @Override
    public void agregarLibro(Producto producto){
        productos.add(producto);
        System.out.println("Producto agregado");
    }

    @Override
    public void agregarSocio(Socio socio) {

    }

    public void listarLibrosDisponibles(){
        for (Producto producto: productos){
            System.out.println(producto);
        }
    }
    public void prestarLibro(String idSocio, String isbnLibro){

    }
    public void devolverLibro(String idSocio, String isbnLibro){

    }
}
