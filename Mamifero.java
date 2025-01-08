package Relacion9;

public class Mamifero {
    String nombre;
    String nombreCientifico;
    double peso;
    String habitat;
    boolean tienePelo;
    int tiempoGestacion;
    boolean esDomestico;
    
    public Mamifero(String nombre, int peso, int tiempoGestacion, boolean tienePelo){
        this.nombre = nombre;
        this.peso = peso;
        this.tiempoGestacion = tiempoGestacion;
        this.tienePelo = tienePelo;
    }

    public void pesarMamifero() {
        System.out.println("El " + nombre + " pesa " + peso + " kg");
    }

    public void gestar(){
        System.out.println("El " + nombre + " tiene un tiempo de gestación de " + tiempoGestacion + " meses");
    }

    public void tenerPeloMam(){
        if (tienePelo == true) {
            System.out.println("El " + nombre + "tiene pelo");
        } else{
            System.out.println("El " + nombre + " no tiene pelo");

        }
    }
}
