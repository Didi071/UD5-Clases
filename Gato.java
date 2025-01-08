package Relacion9;

public class Gato {
    String nombre;
    String pelo; 
    String raza;
    String color;
    int edad;
    String sexo;

    public Gato(String nombre, String pelo, String color, String sexo) {
        this.pelo = pelo;
        this.color = color;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public void serSexo() {
        System.out.println(nombre + " es " + sexo);
    }

    public void tenerPelo() {
        System.out.println(nombre + " tiene el pelo " + pelo);
    }

    public void serColor() {
        System.out.println(nombre + " tiene el pelaje " + color);
    }
    
}
