package org.example;

import org.example.Vista.VistaPokemonAgua;

import java.util.Scanner;

/**
 * @author angelelbetico24
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //VistaPokemon vistaPok = new VistaPokemon();
        VistaPokemonAgua vistaPokAgu = new VistaPokemonAgua();
        //VistaPokemonFuego vistaPokFuego = new VistaPokemonFuego();
        //VistaPokemonElectrico vistaPokElectrico = new VistaPokemonElectrico();
        boolean continuar = true;
        System.out.println("Bienvenido a la gestion de pokemons");
        while (continuar) {
            System.out.println("¿Quieres ver todos los pokemons?(1)\n" +
                    "¿Quieres gestionar los pokemons tipo agua?(2)\n¿Quieres gestionar los pokemons tipo fuego?(3)\n" +
                    "¿Quieres gestionar los pokemons tipo electrico?(4)");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Entendido");
                    //vistaPok.mostrarPokemon();
                    break;
                case 2:
                    while(true){
                        System.out.println("¿Quieres ver todos los pokemons tipo agua?(1)?\n¿Quieres agregar un pokemon nuevo?(2)\n" +
                                "¿Quieres eliminar un pokemon?(3)\n¿Quieres actualizar un pokemon?(4)?");
                        int opcPokemonAgua = sc.nextInt();
                        if (opcPokemonAgua == 1) {
                            vistaPokAgu.mostrarPokemon();
                            break;
                        }else if (opcPokemonAgua == 2) {
                            vistaPokAgu.mostrarAgregarPokemonAgua();
                            break;
                        }else if (opcPokemonAgua == 3) {
                            //vistaPokAgua.mostrarEliminarPokemonAgua();
                            break;
                        }else if (opcPokemonAgua == 4) {
                            //vistaPokAgua.mostrarActualizarPokemonAgua();
                            break;
                        }else{
                            System.out.println("Opcion no valida");
                        }
                    }
                    break;
                case 3:
                    while(true){
                        System.out.println("¿Quieres ver todos los pokemons tipo fuego?(1)?\n¿Quieres agregar un pokemon nuevo?(2)\n" +
                                "¿Quieres eliminar un pokemon?(3)\n¿Quieres actualizar un pokemon?(4)?");
                        int opcPokemonFuego = sc.nextInt();
                        if (opcPokemonFuego == 1) {
                            //vistaPokFuego.mostrarPokemon();
                            break;
                        }else if (opcPokemonFuego == 2) {
                            //vistaPokFuego.mostrarAgregarPokemonAgua();
                            break;
                        }else if (opcPokemonFuego == 3) {
                            //vistaPokFuego.mostrarEliminarPokemonAgua();
                            break;
                        }else if (opcPokemonFuego == 4) {
                            //vistaPokFuego.mostrarActualizarPokemonAgua();
                            break;
                        }else{
                            System.out.println("Opcion no valida");
                        }
                    }
                    break;
                case 4:
                    while(true){
                        System.out.println("¿Quieres ver todos los pokemons tipo electrico?(1)?\n¿Quieres agregar un pokemon nuevo?(2)\n" +
                                "¿Quieres eliminar un pokemon?(3)\n¿Quieres actualizar un pokemon?(4)?");
                        int opcPokemonElectrico = sc.nextInt();
                        if (opcPokemonElectrico == 1) {
                            //vistaPokElectrico.mostrarPokemon();
                            break;
                        }else if (opcPokemonElectrico == 2) {
                            //vistaPokElectrico.mostrarAgregarPokemonAgua();
                            break;
                        }else if (opcPokemonElectrico == 3) {
                            //vistaPokElectrico.mostrarEliminarPokemonAgua();
                            break;
                        }else if (opcPokemonElectrico == 4) {
                            //vistaPokElectrico.mostrarActualizarPokemonAgua();
                            break;
                        }else{
                            System.out.println("Opcion no valida");
                        }
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println("¿Quieres continuar? (S/N)");
            String res = sc.next();
            if (res.equals("N") || res.equals("n")) {
                continuar = false;
            }
        }
    }
}