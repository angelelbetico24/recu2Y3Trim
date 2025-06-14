package org.example.Vista;

import org.example.Controlador.ControladorPokemonAgua;

import java.util.List;
import java.util.Scanner;

import org.example.Modelo.Pokemon;
import org.example.Modelo.PokemonAgua;

/**
 * @author angelelbetico24
 */
public class VistaPokemonAgua {
    //Instancia y scanner
    private ControladorPokemonAgua controladorPokemonAgua;
    Scanner sc = new Scanner(System.in);
    //Constructor
    public VistaPokemonAgua() {
        controladorPokemonAgua = new ControladorPokemonAgua();
    }
    //Metodo
    public void mostrarPokemon(){
        List<PokemonAgua> lista = controladorPokemonAgua.mostrarTodos();
        if (lista.isEmpty()) {
            System.out.println("No hay Pokemons tipo agua en la base de datos");
        }else{
            System.out.println("-------------Lista de Pokemons -------------");
            for (PokemonAgua p : lista){
                System.out.println("---Datos del Pokemon tipo Agua:---");
                System.out.println("ID: "+p.getId());
                System.out.println("Nombre: "+p.getNombre());
                System.out.println("Nivel: "+p.getNivel());
                System.out.println("HP: "+p.getHp());
                System.out.println("Ataque: "+p.getAtaque());
                System.out.println("Defensa: "+p.getDefensa());
                System.out.println("Velocidad: "+p.getVelocidad());
                System.out.println("Habilidades de nado: "+p.getHabilidadesNado());
                System.out.println("Tiempo bajo agua: "+p.getTiempoBajoAgua());
                System.out.println("----------------------------------------");
            }
        }
    }
    public void mostrarAgregarPokemonAgua(){
        System.out.println("Introduzca el id del Pokemon");
        int id = sc.nextInt();
        System.out.println("Introduzca el nombre del Pokemon");
        String nombre = sc.next();
        System.out.println("Introduzca el nivel del Pokemon");
        int nivel = sc.nextInt();
        System.out.println("Introduzca el hp del Pokemon");
        int hp = sc.nextInt();
        System.out.println("Introduzca el ataque del Pokemon");
        double ataque = sc.nextDouble();
        System.out.println("Introduzca el defensa del Pokemon");
        int defensa = sc.nextInt();
        System.out.println("Introduzca el velocidad del Pokemon");
        int velocidad = sc.nextInt();
        System.out.println("Introduzca habilidades de nado del Pokemon");
        String habilidadesNado = sc.next();
        System.out.println("Introduzca el tiempo bajo agua");
        double tiempoBajoAgua = sc.nextDouble();
        // PokemonAgua p = controladorPokemonAgua.anadir(id,nombre,nivel,hp,ataque,defensa,velocidad,habilidadesNado,tiempoBajoAgua);

    }
}
