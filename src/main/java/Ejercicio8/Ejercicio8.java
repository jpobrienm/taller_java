package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un dia de la semana:");
        String dia = scanner.nextLine();
        switch (dia.toLowerCase()){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("No es dia laboral");
                break;
            default:
                System.out.println("No introdujiste un dia valido");
        }
    }
}
