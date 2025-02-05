package Relacion9;

public class Linea {
    //Atributos
    Punto p1;
    Punto p2;

    //Constructor
    public Linea (Punto p1, Punto p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    //Get p1 y get p2
    public Punto getP1() {
        return p1;
    }

    public Punto getP2() {
        return p2;
    }
    @Override
    public String toString() {
        String mensaje = "Línea formada por los puntos " + getP1()+ " y " + getP2();
        return mensaje;
    }
}
