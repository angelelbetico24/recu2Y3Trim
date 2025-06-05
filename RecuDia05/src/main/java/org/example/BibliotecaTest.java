package org.example;

import java.util.*;
import java.time.LocalDate;
/**
 * @author angelelbetico24
 */
public class BibliotecaTest {
    public static void main(String[] args) {
        // Crear biblioteca de prueba
        List<MaterialBiblioteca> biblioteca = new ArrayList<>();

        // Añadir diferentes tipos de material
        biblioteca.add(new LibroFisico("El Quijote", "Cervantes", "978-84-376-0494-7",LocalDate.of(1605, 1, 16), 863, "Clásico", "A-15-3", "bueno"));

        biblioteca.add(new LibroDigital("Clean Code", "Robert Martin", "978-0132350884",LocalDate.of(2008, 8, 1), 464, "Técnico", "PDF", 5.2, "http://biblioteca.com/cleancode"));

        // TODO: Añadir más materiales de prueba
        biblioteca.add(new RevistaAcademica("Capitan","Borderline que te cagas","156-84-376-7894-7",LocalDate.of(2015, 1, 16), 1, "Aventura", "Salami", 1.5) );
        // Pruebas de funcionalidad
        testPrestamos(biblioteca);
        testBusquedas(biblioteca);
        testReportes(biblioteca);
    }

    public static void testPrestamos(List<MaterialBiblioteca> biblioteca) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== PRUEBAS DE PRÉSTAMOS ===");
        System.out.println("¿Quieres ver los materiales que pueden ser prestados? (1) ¿Quieres coger prestado algun material? (2) ¿Quieres salir (3)?");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                //For-each que si no lo pongo me suspende
                for (MaterialBiblioteca material : biblioteca) {
                    if (material.puedeSerPrestado()) {
                        System.out.println("El material " + material.getTitulo() + " puede ser prestado");
                    }else{
                        System.out.println("El material " + material.getTitulo() + " no puede ser prestado");
                    }
                }

                break;
            case 2:
                System.out.println("Introduce el titulo del material que quieres coger prestado:");
                String titulo = sc.next();
                for (MaterialBiblioteca material : biblioteca) {
                    //funciona ¿
                    if (titulo.equals(material.getTitulo()) && material.puedeSerPrestado()) {
                        System.out.println("El material " + material.getTitulo() + " puede ser prestado");
                        material.prestar();
                    }
                }
                break;
            case 3:
                System.out.println("¡Hasta luego!");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

        // TODO: Probar préstamos y devoluciones
        // TODO: Intentar prestar material ya prestado
        // TODO: Verificar días máximos de préstamo
    }
    public static void testBusquedas(List<MaterialBiblioteca> biblioteca){
        System.out.println("=== PRUEBAS DE BUSQUEDA ===");
        System.out.println("Introduce el titulo del material que quieres buscar:");
        String titulo = new Scanner(System.in).next();
        boolean si = false;
        for (MaterialBiblioteca material : biblioteca) {
            if (titulo.equals(material.getTitulo())) {
                si = true;
            }
        }
        if (si) {
            System.out.println("El material " + titulo + " se encuentra en la biblioteca");
        } else {
            System.out.println("El material " + titulo + " no se encuentra en la biblioteca");
        }
    }
    public static void testReportes(List<MaterialBiblioteca> biblioteca){
        System.out.println("=== PRUEBAS DE REPORTE ===");
        
    }
}
