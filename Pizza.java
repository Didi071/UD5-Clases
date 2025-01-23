package Relacion9;

public class Pizza {
    //Atributos
    String tamaño;
    String estado;
    String tipo;
    //Atributo de clase SIEMPRE VA EN STATIC
    static int pizzaPedida = 0;
    static int pizzaServida = 0;

    //Método constructor
    public Pizza(String tipo, String tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        estado = "pedida";
        pizzaPedida ++;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public void servir(){            
        if (estado.equals("pedida")) {
            estado = "servida";
            pizzaServida ++;
        }else{
            System.out.println("Esta pizza ya está servida");
        }
    }
    public String getTamaño() {
        return tamaño;
    }
    public String getTipo() {
        return tipo;
    }

    static int getPizzaPedida() {
        return pizzaPedida;
    }
    static int getPizzaServida(){
        return pizzaServida;
    }
//Esto sirve para mostrar por pantalla un objerto con print objeto
    @Override
    public String toString(){
        //String mensaje="El empleado se llama "+nombre+" "+apellido+" con "+edad+" años " +
        //"y un salario de "+salario;
        //return mensaje;
        return "Pizza {"
                + "Tamaño: " + getTamaño()
                + " Tipo: " + getTipo() 
                + '}';
    }
}
