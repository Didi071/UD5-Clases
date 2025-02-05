package Relacion9;

public class PruebaPirRect {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(5, 3);
        Rectangulo r2 = new Rectangulo(6, 2);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("Réctangulos creados: " + Rectangulo.getRectangulosCreados());
        Piramide p = new Piramide(5);
        System.out.println(p);
        System.out.println("Piramides creadas: " + Piramide.getPiramidesCreadas());
    }
}
