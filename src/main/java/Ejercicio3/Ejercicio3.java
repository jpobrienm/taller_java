package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        double radius = 0;
        double pi = Math.PI;
        boolean isDone = false;
        Scanner scanner = new Scanner(System.in);
        while(!isDone){
            System.out.print("Introduzca el radio de la circunferencia (para introducir decimales utilice punto): ");
            try{
                radius = Double.parseDouble(scanner.nextLine());
                isDone = true;
            }catch (Exception e){
                System.out.println("Recuerda usar punto para separar decimales");
            }
        }
        System.out.println("El area de la circunferencia es: " + pi * Math.pow(radius, 2) + " unidades cuadradas");
    }
}
