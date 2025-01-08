package Relacion9;

public class Ave {
    double envergaduraAlas;
    boolean puedeVolar;
    String tipoPico; 
    String nombre;
    int edad;
    double peso;
    String habitat; 

    public Ave(String nombre, boolean puedeVolar, int peso, String habitat) {
        this.peso = peso;
        this.puedeVolar = puedeVolar;
        this.nombre = nombre;
        this.habitat = habitat;
    }

    public void volar() {
        if (puedeVolar==true) {
            System.out.println(nombre + " puede volar");
        } else{
            System.out.println(nombre + "  no puede volar");
        }
        
    }

    public void pesar() {
        System.out.println(nombre + " pesa " + peso);
    }

    public void vivir() {
        System.out.println(nombre + " vive en " + habitat);
    }
}
