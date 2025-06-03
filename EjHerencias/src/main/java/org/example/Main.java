package org.example;

/**
 * @author angelelbetico24
 */
public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Ford", "Focus", 2018, 4);
        coche.mostrarInfo();
        coche.arrancar();
        coche.abrirMaletero();
        System.out.println("---------------------------");
        Motocicleta motocicleta = new Motocicleta("Honda", "Civic", 2018, true);
        motocicleta.mostrarInfo();
        motocicleta.arrancar();
        motocicleta.hacerCaballito();
        System.out.println("---------------------------");
        Vehiculo vehiculo = new Vehiculo("Ford", "Focos", 2018);
        vehiculo.mostrarInfo();
        vehiculo.arrancar();
    }
}