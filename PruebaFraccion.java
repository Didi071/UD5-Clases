package Relacion9;

import java.util.Scanner;

public class PruebaFraccion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Pedir datos por teclado
        System.out.println("Introduce el numerador de la primera función: ");
        int numeradorf1 = entrada.nextInt();
        System.out.println("Introduce el numerador de la segunda función: ");
        int numeradorf2 = entrada.nextInt();
        System.out.println("Introduce el denominador de la primera función: ");
        int denominadorf1 = entrada.nextInt();
        System.out.println("Introduce el denominador de la segunda función: ");
        int denominadorf2 = entrada.nextInt();

        //Crear fracciones
        Fraccion f1=new Fraccion(numeradorf1,denominadorf1);
        Fraccion f2=new Fraccion(numeradorf2,denominadorf2);
        //Invertir
        f1.invertir();
        //Maximo Divisor
        f1.simplificar();


        //Multiplicar
        System.out.printf("El resultado de la multiplicación es: %d/%d ", Fraccion.multiplicar(f1,f2).getNumerador(), Fraccion.multiplicar(f1,f2).getDenominador());
        System.out.println();

        //Dividir

        System.out.printf("El resultado de la division es: %d/%d", Fraccion.dividir(f1,f2).getNumerador(),Fraccion.dividir(f1,f2).getDenominador());
        System.out.println();

        entrada.close();
    }
}

