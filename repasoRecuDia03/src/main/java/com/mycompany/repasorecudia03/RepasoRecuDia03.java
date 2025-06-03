package com.mycompany.repasorecudia03;

import java.util.ArrayList;

/**
 *
 * @author angelelbetico24
 */
public class RepasoRecuDia03 {

    public static void main(String[] args) {
        EmpleadoFijo e1 = new EmpleadoFijo("Peponcio","789456123G",1500,10.3);
        EmpleadoPorHoras e2 = new EmpleadoPorHoras("Mari Tere","123456789E",1700,80,54.6); //Esta aprobo programacion
        Comercial e3 = new Comercial("Calvete","512364789P",1200,2.1, 50.7, 5.1); //Suspendio programacion
        e1.obtenerDetalles();
        ArrayList<Empleado> arrayEmpleado = new ArrayList<>();
        arrayEmpleado.add(e1);
        arrayEmpleado.add(e2);
        arrayEmpleado.add(e3);
        for (Empleado empleado : arrayEmpleado){
            System.out.println(empleado.obtenerDetalles());
        }
        
    }
}
