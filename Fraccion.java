package Relacion9;

public class Fraccion {
    //Atributos
    int maxDivisor;
    int numerador;
    int denominador;
    //Métodods
    //crear una fracciñon
    public Fraccion (int numerador, int denominador){
        this.numerador=numerador;
        this.denominador = denominador;
    }
    //invierte
    public void invertir (){
        int temp;
        temp = numerador;
        numerador = denominador;
        denominador= temp;
        System.out.println("La fraccion invertida es " + numerador + "/"+ denominador);
    }

    //encontrar el maximo como un divisor
    public void mcm(){
        //encontrar mayor y menor (divisor y dividendo)
        int dividendo;
        int divisor;
        int resto;
        if (numerador>denominador) {
            dividendo = numerador;
            divisor = denominador;
        } else {
            dividendo = denominador;
            divisor = numerador;
        }
        if (dividendo%divisor ==0) {
            maxDivisor = divisor;
        } else {
            while (divisor != 0) {
                resto = dividendo % divisor;
                dividendo = divisor;
                divisor = resto;
            }
            maxDivisor = dividendo;
        }
        System.out.println("El máximo divisor común es: " + maxDivisor);
    }

    //simplifica
    public void simplificar (){
        numerador = numerador / maxDivisor;
        denominador = denominador / maxDivisor;
        System.out.printf("La fracción simplificada es %d/%d", numerador, denominador );
        System.out.println();
    }
    //get denominador y numerador
    int getNumerador(){
        return numerador;
    }
    int getDenominador(){
        return denominador;
    }
    //multiplica
    public static Fraccion multiplicar(Fraccion f1, Fraccion f2){
        Fraccion f3 = new Fraccion(f1.numerador*f2.numerador, f1.denominador * f2.denominador);
        return f3;
    }
    //divide
    public static Fraccion dividir(Fraccion f1, Fraccion f2) {
        Fraccion f3 = new Fraccion(f1.numerador*f2.denominador, f1.denominador*f2.numerador);
        return f3;
    }
    //Static se usa para llamar Fraccion.multiplicar(f1 * f2)
    //Public se usa para llamar f1.simplificar()

}