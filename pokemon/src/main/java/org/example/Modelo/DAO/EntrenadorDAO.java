package org.example.Modelo.DAO;
import org.example.Modelo.*;
import java.sql.*;
import java.util.*;

/**
 * @author angelelbetico24
 */
public class EntrenadorDAO {

    public void agregarEntrenador(Entrenador entrenador) {
        String sql = "INSERT INTO entrenador (id,nombre,nivel) VALUES (?,?,?)";
        try (Connection conn = ConexionBD.conectar()){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void actualizarEntrenador(Entrenador entrenador) {
        String sql = "UPDATE entrenador SET nombre=?,nivel=? WHERE id=?";
        try(Connection conn = ConexionBD.conectar()){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void eliminarEntrenador(int id) {
        String sql = "DELETE FROM entrenador WHERE id=?";
        try (Connection conn = ConexionBD.conectar()){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void mostrarEntrenador(int id) {
        String sql = "SELECT * FROM entrenador WHERE id=?";
        try (Connection conn = ConexionBD.conectar()){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Entrenador> listarTodos(){
        String sql = "SELECT * FROM entrenador";
        List<Entrenador> listaEntrenador = new ArrayList<>();

        try (Connection conn = ConexionBD.conectar()){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaEntrenador;
    }
}
