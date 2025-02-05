package Relacion9;

import java.util.Scanner;

public class PruebaZona {
static void Menu(){
    do {
    System.out.printf("%25s %n", "----MENÚ----");
    System.out.printf("%-40s %n", "1. Mostrar número de entradas libres");
    System.out.printf("%-40s %n", "2. Vender entradas");
    System.out.printf("%-40s %n", "3. Salir");
    opcion = entrada.nextInt();
    } while (opcion != 1 && opcion != 2 && opcion !=3);
}
    public static void main(String[] args) {
        int opcion;
        Scanner entrada = new Scanner(System.in);
        
        Zona salaPrincipal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);
        
        
        opcion = Menu();
        
        switch (opcion) {
            case 1:
            System.out.println("ENTRADAS RESTANTES");
            System.out.println("Quedan " + salaPrincipal.getEntradasPorVender() + " por vender en la sala principal.");
            System.out.println("Quedan " + compraVenta.getEntradasPorVender() + " por vender en la zona de compra-venta");
            System.out.println("Quedan " + vip.getEntradasPorVender() + " por vender en la zona vip.");
                break;
            case 2:
            System.out.println("Elije una zona: sala principal, zona compra-venta o zona vip");
            int zonaVenta = entrada.nextInt();
            switch (zonaVenta) {
                case 1:
                int entradas;
                    System.out.println("Cuantas entradas desea?");
                    entradas = entrada.nextInt();
                    salaPrincipal.vender(entradas);
                    break;
                case 2:
                System.out.println("Cuantas entradas desea?");
                entradas = entrada.nextInt();
                compraVenta.vender(entradas);                break;
                case 3:
                System.out.println("Cuantas entradas desea?");
                entradas = entrada.nextInt();
                vip.vender(entradas);
                    break;
                default:
                    break;
            }
                break;
            case 3:
                System.out.println("Has salido del programa");
                break;
        
            default:
            System.out.println("Esta opción no está disponible");
                break;
        }
        entrada.close();
    }
}
