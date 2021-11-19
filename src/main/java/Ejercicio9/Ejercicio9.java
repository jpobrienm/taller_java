package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = "La sonrisa sera la mejor arma contra la tristeza ";
        texto = texto.replace("a", "e");
        System.out.println("La frase despues del reemplazo es: " + texto);
        System.out.println("Introduzca el texto que desea añadir: ");
        String textoAnadido = scanner.nextLine();
        texto = texto.concat(textoAnadido);
        System.out.println("La frase despues del reemplazo y añadir el texto del usuario es: "+ texto);
    }
}
