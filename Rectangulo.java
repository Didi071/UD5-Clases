package Relacion9;

public class Rectangulo {
    // Atributos
    int base;
    int altura;
    static int rectangulosCreados;

    // Constructor
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        rectangulosCreados++;
    }

    @Override
    public String toString() {
        String rectangulo ="";
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) { 
                rectangulo += "*";
            }
            rectangulo += "\n"; 
        }

        return rectangulo;
    }
    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }

}

