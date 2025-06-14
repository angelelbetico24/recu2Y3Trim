package org.example.Modelo;

/**
 * @author angelelbetico24
 */
import java.sql.*;


public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/simulacro";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "";


    public static Connection conectar() {
        try {
            Connection conn = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            return conn;
        } catch (SQLException e) {
            System.err.println("todavia no " + e.getMessage());
            return null;
        }
    }
}

