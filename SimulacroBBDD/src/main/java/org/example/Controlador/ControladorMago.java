package org.example.Controlador;

import org.example.Modelo.DAO.*;

/**
 * @author angelelbetico24
 */
public class ControladorMago {
    public void agregar(String id, String nombre, int nivel, int vida_max, int vida_actual, int inteligencia, int mana_max, int mana_actual) {
        MagoDAO.agregarMago(id,nombre,nivel,vida_max,vida_actual,inteligencia,mana_max, mana_actual);
    }
    public void eliminar(String id) {
        MagoDAO.eliminarMago(id);
    }
    public void actualizar(String id, String nombre, int nivel, int vidaMax, int vidaActual, int inteligencia, int manaMax, int manaActual) {
        MagoDAO.actualizarMago(id,nombre,nivel,vidaMax,vidaActual,inteligencia, manaMax,manaActual);
    }
    public void mostrar() {
        MagoDAO.obtenerTodos();
    }
}
