package Relacion9;

public class Punto {
    //Atributos
    float x;
    float y;

    //Constructor
    public Punto(float x,float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    @Override
    public String toString(){
        String mensaje = "(" + getX() + ", "+ getY() + ")";
        return mensaje;
    }
}
