package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        int number;
        do{
            System.out.print("Introduzca un numero mayor que cero: ");
            answer = scanner.nextLine();
            try{
                number = Integer.parseInt(answer);
            }catch (Exception e){
                number = -1;
            }
        }
        while (number < 0);
        System.out.println("El numero mayor que cero que introdujo es: " + number);
    }
}
