package Relacion9;

public class PruebaPuntoyLinea {
    public static void main(String[] args) {
        Punto p1 = new Punto(4.21f, 7.3f);
        Punto p2 = new Punto(-2f, 1.66f);
        Linea l = new Linea(p1, p2);
        System.out.println(l);
    }
}
