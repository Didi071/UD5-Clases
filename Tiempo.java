package Relacion9;

public class Tiempo {
    //Atributos
    int horas, minutos, segundos;

    //Constructor
    public Tiempo (int h, int m, int s) {
        horas = h;
        minutos = m;
        segundos = s;
    }

    //Métodos

    //to String
    public String toString(){
        String mensaje = horas + "h " + minutos + "m " + segundos + "s";
        return mensaje;
    }

    //get hora minuto y segundo
    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    //Suma
    public static Tiempo sumar(Tiempo hora1, Tiempo hora2){
        int totalSegundos = (hora1.horas * 3600 + hora1.minutos * 60 + hora1.segundos) + 
                            (hora2.horas * 3600 + hora2.minutos * 60 + hora2.segundos);
        
        // Desglosar el total de segundos a horas, minutos y segundos
        int horasResultado = totalSegundos / 3600;
        totalSegundos %= 3600;
        
        int minutosResultado = totalSegundos / 60;
        int segundosResultado = totalSegundos % 60;
        
        return new Tiempo(horasResultado, minutosResultado, segundosResultado);
    }
    

    //Restar

    public static Tiempo restar(Tiempo hora1, Tiempo hora2){
        int totalSegundos1 = (hora1.horas * 3600 + hora1.minutos * 60 + hora1.segundos);
        int totalSegundos2 = (hora2.horas * 3600 + hora2.minutos * 60 + hora2.segundos);
        
        // Asegurarse de que no haya resultados negativos
        int totalSegundosResultado = Math.max(totalSegundos1 - totalSegundos2, 0);
        
        // Desglosar el total de segundos a horas, minutos y segundos
        int horasResultado = totalSegundosResultado / 3600;
        totalSegundosResultado %= 3600;
        
        int minutosResultado = totalSegundosResultado / 60;
        int segundosResultado = totalSegundosResultado % 60;
        
        return new Tiempo(horasResultado, minutosResultado, segundosResultado);
    }
    
}
