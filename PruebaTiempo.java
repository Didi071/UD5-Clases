package Relacion9;

public class PruebaTiempo {
    public static void main(String[] args) {
        Tiempo tiempo1 = new Tiempo(10, 50, 30);
        Tiempo tiempo2 = new Tiempo(5, 22, 32);

        System.out.println(tiempo1);
        System.out.println(Tiempo.sumar(tiempo1, tiempo2));
        System.out.println(Tiempo.restar(tiempo1, tiempo2));
    }
}
