package Relacion9;

public class Incidencia {
    //Atributos
    int numPuesto;
    int codigo = 0;
    String estado;
    String problema;

    //Atributos de clase
    static int totalPendientes = 0;

    //Constructor 
    public Incidencia (int numPuesto, String problema){
        this.numPuesto = numPuesto;
        this.problema = problema;
        estado = "pendiente";
        totalPendientes ++;
        codigo ++;
    }

    //Método resolver
    void resuelve (String solucion){
        estado = "resuelta";
        totalPendientes --;
    }

    //Método getPendientes
    public static int getPendientes() {
        return totalPendientes;
    }

    //Método to String()
    public String toString() {
        String mensaje;
        mensaje = "Puesto: " + numPuesto + " - " +problema +  " - " + estado;
        return mensaje;
    }



}
