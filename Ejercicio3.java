package Relacion9;

public class Ejercicio3 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Lobo Gris", 7, 60, "Asia, Norte América y Europa");
        animal1.pesar();
        animal1.edad();
        animal1.vivir();

        Ave ave1 = new Ave("Pingüino", false, 23, "Antartida");
        ave1.volar();
        ave1.pesar();
        ave1.vivir();

        Gato gato1 = new Gato("Luna", "largo", "blanco", "hembra");
        gato1.tenerPelo();
        gato1.serColor();
        gato1.serSexo();

        Mamifero mamifero1 = new Mamifero("Cachalote", 41000, 15, false);
        mamifero1.gestar();
        mamifero1.pesarMamifero();
        mamifero1.tenerPeloMam();

        Perro perro1 = new Perro(true, "Aslan", "Labrador", 4);
        perro1.entrenar();
        perro1.serRaza();
        perro1.tenerAños();
    }
}
