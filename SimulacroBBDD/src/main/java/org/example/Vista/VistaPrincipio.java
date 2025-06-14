package org.example.Vista;

import java.util.Scanner;

/**
 * @author angelelbetico24
 */
public class VistaPrincipio {
    public void mostrarVistaInicio() {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        int opc;
        while (continuar) {
            System.out.println("Bienvenido al sistema de combate.\n¿Quieres modificar datos de paladin?(1)\n" +
                    "¿Quieres modificar datos de guerrero?(2)\n¿Quieres modificar datos de mago?(3)\n¿Quieres salir?(4)");
            opc = sc.nextInt();
            switch (opc) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    VistaMago vp = new VistaMago();
                    vp.mostrarInicioMago();
                    break;
                case 4:
                    System.out.println("Adios");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
