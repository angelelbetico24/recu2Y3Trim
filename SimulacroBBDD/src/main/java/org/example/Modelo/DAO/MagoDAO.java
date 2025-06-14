package org.example.Modelo.DAO;

import org.example.Modelo.*;

import java.sql.*;
import java.util.*;

/**
 * @author angelelbetico24
 */
public class MagoDAO {
    public static List<Mago> obtenerTodos() {
        List<Mago> magos = new ArrayList<>();
        String sql = "SELECT p.id, p.nombre, p.nivel, p.vida_max, p.vida_actual, " +
                "m.inteligencia, m.mana_max, m.mana_actual " +
                "FROM personajes p JOIN magos m ON p.id = m.id";
        try(Connection conn = ConexionBD.conectar()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mago mag1 = new Mago(
                        rs.getString("id"),
                        rs.getString("nombre"),
                        rs.getInt("nivel"),
                        rs.getInt("vida_max"),
                        rs.getInt("vida_actual"),
                        rs.getInt("inteligencia"),
                        rs.getInt("mana_max"),
                        rs.getInt("mana_actual")

                );
                magos.add(mag1);
            }
            System.out.println("Lista de magos: ");
            for (Mago mago : magos) {
                System.out.println(mago);
            }
            System.out.println("========");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return magos;
    }
    public static void agregarMago(String id, String nombre, int nivel, int vida_max, int vida_actual, int inteligencia, int mana_max, int mana_actual) {
        //COMANDOS SQL
        String sqlPersonaje = "INSERT INTO personajes (id,nombre,nivel,vida_max,vida_actual) VALUES (?,?,?,?,?)";
        String sqlMago = "INSERT INTO magos(id,inteligencia,mana_max,mana_actual) VALUES (?,?,?,?)";
        //METERLO EN LA BASE DE DATOS
        try (Connection conn = ConexionBD.conectar()){
            //INTRODUCIMOS EN LAS TABLAS DE PERSONAJE
            PreparedStatement psPersonaje = conn.prepareStatement(sqlPersonaje);
            psPersonaje.setString(1, id);
            psPersonaje.setString(2, nombre);
            psPersonaje.setInt(3, nivel);
            psPersonaje.setInt(4, vida_max);
            psPersonaje.setInt(5, vida_actual);

            int filas = psPersonaje.executeUpdate();
            //INTRODUCIMOS EN LAS TABLAS DE MAGOS
            if (filas > 0) {
                System.out.println("Personaje agregado exitosamente. Agregando en magos");
                PreparedStatement psMagos = conn.prepareStatement(sqlMago);
                psMagos.setString(1, id);
                psMagos.setInt(2, inteligencia);
                psMagos.setInt(3, mana_max);
                psMagos.setInt(4, mana_actual);
                psMagos.executeUpdate();
                System.out.println("Magos agregado exitosamente");
            }else{
                conn.rollback();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void eliminarMago(String id) {
        String sqlPersonaje = "DELETE FROM personajes WHERE id = ?";
        String sqlMago = "DELETE FROM magos WHERE id = ?";
        try(Connection conn = ConexionBD.conectar()){
            //COMANDOS SQL
            PreparedStatement psMagos = conn.prepareStatement(sqlMago);
            PreparedStatement psPersonaje = conn.prepareStatement(sqlPersonaje);
            //EJECUCIONES
            psMagos.setString(1, id);
            psMagos.executeUpdate();
            System.out.println("Magos eliminado completamente exitosamente");

            psPersonaje.setString(1, id);
            psPersonaje.executeUpdate();
            System.out.println("Mago eliminado exitosamente de la tabla de personajes");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void actualizarMago(String id, String nombre, int nivel, int vida_max, int vida_actual, int inteligencia, int mana_max, int mana_actual) {
        String sqlPersonaje="UPDATE personajes SET nombre = ?,nivel = ?,vida_max = ?,vida_actual = ? WHERE id = ?";
        String sqlMagos = "UPDATE magos SET inteligencia = ?,mana_max = ?,mana_actual = ? WHERE id = ?";
        try(Connection conn = ConexionBD.conectar()){
            System.out.println("Actualizando en la tabla personaje....");
            PreparedStatement psPersonaje = conn.prepareStatement(sqlPersonaje);
            psPersonaje.setString(1, nombre);
            psPersonaje.setInt(2, nivel);
            psPersonaje.setInt(3, vida_max);
            psPersonaje.setInt(4, vida_actual);
            psPersonaje.setString(5, id);

            System.out.println("Actualizando en la tabla magos....");
            PreparedStatement psMagos = conn.prepareStatement(sqlMagos);
            psMagos.setInt(1, inteligencia);
            psMagos.setInt(2, mana_max);
            psMagos.setInt(3, mana_actual);
            psMagos.setString(4, id);
            psMagos.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
