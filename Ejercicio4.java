package Relacion9;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Crear un objeto de la clase Autobus
        Autobus autobus = new Autobus();

        // Probar los métodos de la clase Autobus
        System.out.println("Matrícula: " + autobus.getMatricula());
        System.out.println("Modelo: " + autobus.getModelo());
        System.out.println("Potencia: " + autobus.getPotenciaCV() + " CV");
        System.out.println("Número de plazas: " + autobus.getNumeroPlazas());

        // Modificar el número de plazas
        autobus.setNumeroPlazas("60");
        System.out.println("Nuevo número de plazas: " + autobus.getNumeroPlazas());
    }
}
