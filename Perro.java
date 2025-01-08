package Relacion9;

public class Perro {
    String nombre;
    String raza; 
    int edad;
    String sexo;
    String pelo;
    String color; 
    boolean entrenado; 

    public Perro (boolean entrenado, String nombre, String raza, int edad){
        this.entrenado = entrenado;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public void entrenar(){
        if (entrenado==true) {
            System.out.println( nombre +" es un perro entrenado");
        } else {
            System.out.println(nombre + " no es un perro entrenado");
        }
    }
    public void serRaza (){
        System.out.println(nombre + " es un " + raza);
    }
    public void tenerAños(){
        System.out.println(nombre + " tiene " +  edad + " años");
    }
}


