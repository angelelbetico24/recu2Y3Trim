package org.example.Vista;

import org.example.Controlador.ControladorMago;

import java.util.Scanner;

/**
 * @author angelelbetico24
 */
public class VistaMago {
    public void mostrarInicioMago(){
        ControladorMago controlador = new ControladorMago();
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres añadir(1) eliminar(2) actualizar(3) o mostrar (4)");
        int opc = sc.nextInt();
        if (opc == 1) {
            System.out.println("Introduce el id");
            String id = sc.next();
            System.out.println("Introduce el nombre");
            String nombre = sc.next();
            System.out.println("Introduce el nivel");
            int nivel = sc.nextInt();
            System.out.println("Introduce el vida_max");
            int vidaMax = sc.nextInt();
            System.out.println("Introduce el vida_actual");
            int vidaActual = sc.nextInt();
            System.out.println("Introduce la inteligencia");
            int inteligencia = sc.nextInt();
            System.out.println("Introduce el mana_max");
            int manaMax = sc.nextInt();
            System.out.println("Introduce el mana_actual");
            int manaActual = sc.nextInt();

            controlador.agregar(id,nombre,nivel,vidaMax,vidaActual,inteligencia,manaMax,manaActual);
        }else if(opc == 2) {
            System.out.println("Introduce el id");
            String id = sc.next();
            controlador.eliminar(id);
        }else if(opc == 3) {
            System.out.println("Introduce el id");
            String id = sc.next();
            System.out.println("Introduce el nombre");
            String nombre = sc.next();
            System.out.println("Introduce el nivel");
            int nivel = sc.nextInt();
            System.out.println("Introduce el vida_max");
            int vidaMax = sc.nextInt();
            System.out.println("Introduce el vida_actual");
            int vidaActual = sc.nextInt();
            System.out.println("Introduce la inteligencia");
            int inteligencia = sc.nextInt();
            System.out.println("Introduce el mana_max");
            int manaMax = sc.nextInt();
            System.out.println("Introduce el mana_actual");
            int manaActual = sc.nextInt();
            controlador.actualizar(id,nombre,nivel,vidaMax,vidaActual,inteligencia,manaMax,manaActual);
        }else if(opc == 4) {
            controlador.mostrar();
        }
    }
}
