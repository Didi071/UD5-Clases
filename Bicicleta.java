package Relacion9;

public class Bicicleta {
    //Atributos
    String color;
    int velocidad;
    int marcha;
    //Métodos
    public void setColor(String color) {
        this.color = color;
    }
    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void Avanzar(){
        velocidad++;
    }
    public void CambiarDeMarcha(){
        marcha++;
    }
    public void Frenar(){
        velocidad --;
    }
}
