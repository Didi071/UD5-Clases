package Relacion9;

public class Animal {
    //atributos
    String nombre;
    String nombreCientifico;
    String familia;
    String estado;
    int espVida; 
    double peso;
    String habitat; 

    public Animal(String nombre, int edad, int peso, String habitat) {
        this.peso = peso;
        this.espVida = espVida;
        this.nombre = nombre;
        this.habitat = habitat;
    }

    public void pesar() {
        System.out.println(nombre + " pesa " + peso);
    }

    public void edad() {
        System.out.println(nombre + " tiene una esperanza de vida de " + espVida + " años");
    }

    public void vivir() {
        System.out.println(nombre + " vive en " + habitat);
    }
}

