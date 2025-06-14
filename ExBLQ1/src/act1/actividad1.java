package act1;

import java.io.*;
import java.util.Scanner;

/**
 * @author angelelbetico24
 */
public class actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Quieres leer un archivo (1), " +
                "sobreescribir en un archivo (2), escribir en un archivo (3)?");
        int opc = sc.nextInt();
        String ruta ="archivo.txt";

        if (opc == 1) {
            try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
                String contenido;
                while ((contenido = br.readLine()) != null) {
                    System.out.println(contenido);
                }
            } catch (IOException e) {
                System.err.println("Mensaje de error " + e.getMessage());
            }
        }else if (opc == 2) {
            try (FileWriter fw = new FileWriter(ruta)) {
                System.out.println("Dime lo que quieres escribir en un archivo");
                String contenido = sc.next();
                fw.write(contenido);
            } catch (IOException e) {
                System.out.println("Mensaje de error" + e.getMessage());
            }
        }else{
            try (FileWriter fw = new FileWriter(ruta,true)) {
                System.out.println("Introduce lo que quieres escribir");
                String contenido = sc.next();
                fw.write(contenido);
            }catch (IOException e) {
                System.out.println("Mensaje de error" + e.getMessage());
            }
        }

    }
}
