package Relacion9;

public class Piramide {
    // Atributos
    int altura;
    static int piramidesCreadas;

    // Constructor
    public Piramide(int a) {
        altura = a;
        piramidesCreadas++;
    }

    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }

    @Override
    public String toString() {
        String piramide = "";
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i - 1; j++) {
                piramide += " ";
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                piramide += "*";
            }
            piramide+="\n";
        }
        return piramide;
    }

}

