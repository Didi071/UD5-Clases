package Relacion9;

public class Animal {
    //atributos
    String nombre;
    String nombreCientifico;
    String familia;
    String estado;
    int edad; 
    double peso;
    String habitat; 

    public Animal(String nombre, int edad, int peso, String habitat) {
        this.peso = peso;
        this.edad = edad;
        this.nombre = nombre;
        this.habitat = habitat;
    }

    public void pesar() {
        System.out.println(nombre + " pesa " + peso);
    }

    public void edad() {
        System.out.println(nombre + " tiene " + edad + " años");
    }

    public void vivir() {
        System.out.println(nombre + " vive en " + habitat);
    }
}

