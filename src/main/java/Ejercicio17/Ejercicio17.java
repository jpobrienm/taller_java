package Ejercicio17;

public class Ejercicio17 {
    public static void main(String[] args) {
        Electrodomestico electrodomestico = new Electrodomestico(200, "blanco", 'C', 55);
        double precio = electrodomestico.precioFinal();
        System.out.println(precio);
    }
}
