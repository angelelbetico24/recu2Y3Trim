package org.example.Controlador;

import org.example.Modelo.Pokemon;
import org.example.Modelo.PokemonAgua;
import org.example.Modelo.DAO.*;

import java.util.*;

/**
 * @author angelelbetico24
 */
public class ControladorPokemonAgua {
    //Instancia de la clase DAO
    private PokemonAguaDAO dao;

    //Constructor
    public ControladorPokemonAgua() {
        dao = new PokemonAguaDAO();
    }

    //Metodos CRUD
    public void anadir(int id, String nombre, int nivel, int hp, double ataque, double defensa, double velocidad, String habilidadesNado, double tiempoBajoAgua) {
        PokemonAgua p = new PokemonAgua(id,nombre,nivel,hp,ataque,defensa,velocidad,habilidadesNado,tiempoBajoAgua);
        dao.agregarPokemonAgua(p);
    }

    public void eliminar(int id, String nombre, int nivel, int hp, double ataque, double defensa, double velocidad, String habilidadesNado, double tiempoBajoAgua) {
        PokemonAgua p = new PokemonAgua(id,nombre,nivel,hp,ataque,defensa,velocidad,habilidadesNado,tiempoBajoAgua);
        dao.eliminarPokemonAgua(p);
    }

    public void actualizar(int id, String nombre, int nivel, int hp, double ataque, double defensa, double velocidad, String habilidadesNado, double tiempoBajoAgua) {
        PokemonAgua p = new PokemonAgua(id,nombre,nivel,hp,ataque,defensa,velocidad,habilidadesNado,tiempoBajoAgua);
        dao.actualizarPokemonAgua(p);
    }

    public List<PokemonAgua> mostrarTodos() {
        return dao.listarPokemonAgua();
    }
}
