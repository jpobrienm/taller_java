package Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la frase cuyos espacios desea eliminar");
        String frase = scanner.nextLine();
        frase = frase.replace(" ", "");
        System.out.println("Al retirar los espacios de esta frase obtenemos: " + frase);
    }
}
