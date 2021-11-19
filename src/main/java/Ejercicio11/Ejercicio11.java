package Ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        String [] vocales = {"a", "e", "i", "o", "u"};
        String pivot;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba la frase que desea ingresar");
        String frase = scanner.nextLine();
        pivot = frase;
        System.out.println("Esta frase tiene " + frase.replace(" ", "").length() +
                            " caracteres no vacios");
        for(String vocal: vocales){
            pivot = pivot.replace(vocal, "");
        }
        System.out.println("Esta frase tiene " + (frase.length() - pivot.length()) + " vocales");
    }
}
