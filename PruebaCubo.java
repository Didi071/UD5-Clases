package Relacion9;

public class PruebaCubo {
    public static void main(String[] args) {
        // Crear cubos
        Cubo c1 = new Cubo(70, 100);
        Cubo c2 = new Cubo(20, 75);
        
        // Mostrar capacidades antes de transferir
        System.out.println("Capacidad actual del cubo 1: " + c1.getCapacidadActual());
        System.out.println("Capacidad actual del cubo 2: " + c2.getCapacidadActual());

        // Transferir 30 litros de c1 a c2
        c1.Pasar(20, c2);

        // Mostrar capacidades después de transferir
        System.out.println("Capacidad actual del cubo 1 después de transferir: " + c1.getCapacidadActual());
        System.out.println("Capacidad actual del cubo 2 después de recibir: " + c2.getCapacidadActual());
    }
}
