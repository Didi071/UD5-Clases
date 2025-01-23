package Relacion9;

public class PedidosPizza {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("margarita", "mediana");
        Pizza p2 = new Pizza("funghi", "familiar");
        p2.servir();
        Pizza p3 = new Pizza("cuatro quesos", "mediana");
        p2.servir();

        System.out.println(p1);

        System.out.printf( "%-10s %-2d", "Pedidas: ", Pizza.getPizzaPedida());
        System.out.println();
        System.out.printf( "%-10s %-2d", "Servidas: ", Pizza.getPizzaServida());    }
}
