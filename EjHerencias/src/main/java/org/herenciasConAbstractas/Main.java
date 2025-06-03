package herenciasConAbstractas;

/**
 * @author angelelbetico24
 */
public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Ford", "Focus", 2018, 4);
        coche.mostrarInfo();
        coche.arrancar();
        coche.abrirMaletero();
        System.out.println("---------------------------");
        Motocicleta motocicleta = new Motocicleta("Honda", "Civic", 2018, true);
        motocicleta.mostrarInfo();
        motocicleta.arrancar();
        motocicleta.hacerCaballito();
        System.out.println("---------------------------");
        VehiculoElectrico v1 = new VehiculoElectrico(0, "Tesla", "Teslita", 0);
        v1.mostrarGarantia();
        v1.mostrarInfo();
    }
}