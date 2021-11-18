package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double price = 0;
        boolean isDone = false;
        Scanner scanner = new Scanner(System.in);
        while(!isDone){
            try{
                System.out.print("Introduzca el precio (para introducir decimales use punto): ");
                price = Double.parseDouble(scanner.nextLine());
                isDone = true;
            }catch (Exception e){
                System.out.println("Recuerda usar punto para separar decimales");
            }
        }
        System.out.println("El valor del precio una vez añadido el iva es de: " + 1.21 * price);
    }
}

