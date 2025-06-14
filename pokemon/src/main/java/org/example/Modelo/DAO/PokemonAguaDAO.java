package org.example.Modelo.DAO;

import org.example.Modelo.ConexionBD;
import org.example.Modelo.PokemonAgua;

import java.sql.*;
import java.util.*;

/**
 * @author angelelbetico24
 */
public class PokemonAguaDAO {

    public void agregarPokemonAgua(PokemonAgua pokemonAgua){
        String sql1 = "INSERT INTO Pokemon (id,nombre,nivel,hp,ataque,defensa,velocidad) VALUES (?,?,?,?,?,?)";
        String sql2 = "INSERT INTO PokemonAgua (id,habilidades_nado,tiempo_bajo_agua) VALUES (?,?,?)";
        try (Connection conn = ConexionBD.conectar()){
            try(
                    PreparedStatement psPokemon = conn.prepareStatement(sql1);
                    PreparedStatement psPokemonAgua = conn.prepareStatement(sql2);
            ){
                //Insertamos en la tabla Pokemon
                psPokemon.setInt(1, pokemonAgua.getId());
                psPokemon.setString(2, pokemonAgua.getNombre());
                psPokemon.setInt(3, pokemonAgua.getNivel());
                psPokemon.setInt(4, pokemonAgua.getHp());
                psPokemon.setDouble(5, pokemonAgua.getAtaque());
                psPokemon.setDouble(6, pokemonAgua.getDefensa());
                psPokemon.setDouble(7, pokemonAgua.getVelocidad());
                psPokemon.executeUpdate();

                //Insertamos en la tabla PokemonAgua
                psPokemonAgua.setInt(1, pokemonAgua.getId());
                psPokemonAgua.setString(2, pokemonAgua.getHabilidadesNado());
                psPokemonAgua.setDouble(3,pokemonAgua.getTiempoBajoAgua());
                psPokemonAgua.executeUpdate();
                System.out.println("Pokemon insertado correctamente");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void eliminarPokemonAgua(PokemonAgua pokemonAgua){
        String sql1 = "DELETE FROM Pokemon WHERE id=?";
        String sql2 = "DELETE FROM PokemonAgua WHERE id = ?";
        try (Connection conn = ConexionBD.conectar()){
            try(
                    PreparedStatement psPokemon = conn.prepareStatement(sql1);
                    PreparedStatement psPokemonAgua = conn.prepareStatement(sql2);

                    )
            {
                //Eliminar de la tabla pokemon
                psPokemon.setInt(1, pokemonAgua.getId());
                psPokemon.executeUpdate();
                //Eliminar de la tabla pokemonAgua
                psPokemonAgua.setInt(1, pokemonAgua.getId());
                psPokemonAgua.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void actualizarPokemonAgua(PokemonAgua pokemonAgua){
        String sql = "UPDATE PokemonAgua SET habilidades_nado = ?, tiempo_bajo_agua = ? WHERE id = ?";
        try (Connection conn = ConexionBD.conectar()){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<PokemonAgua> listarPokemonAgua(){
        String sqlPokemonAgua = "SELECT * FROM PokemonAgua";
        List<PokemonAgua> pokemonAguas = new ArrayList<>();
        try (Connection conn = ConexionBD.conectar()){
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sqlPokemonAgua);
            while (rs.next()){
                pokemonAguas.add(new PokemonAgua(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("edad")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return pokemonAguas;
    }

}
