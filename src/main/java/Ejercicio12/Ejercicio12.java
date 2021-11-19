package Ejercicio12;

import java.awt.print.Printable;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        String first;
        String diff_first = "";
        String second;
        String diff_second = "";
        int first_length;
        int second_lenght;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la primera palabra");
        first = scanner.nextLine();
        System.out.println("Ingrese la segunda palabra");
        second = scanner.nextLine();
        first = first.replace("_", "").toLowerCase(Locale.ROOT);
        second = second.replace("_", "").toLowerCase(Locale.ROOT);
        first_length = first.length();
        second_lenght = second.length();
        int difference = Math.abs(first.length() - second.length());
        if(first_length >= second_lenght){
            for(int i=0; i<difference; i++){
                second = second.concat("_");
            }
        }
        else{
            for(int i=0; i< difference; i++){
                first = first.concat("_");
            }
        }
        System.out.println(first.length() + "  " + second.length());
        for(int i=0; i<first.length(); i++){
            if(first.charAt(i) != second.charAt(i)){
                diff_first = diff_first.concat(Character.toString(first.charAt(i)).toUpperCase(Locale.ROOT));
                diff_second = diff_second.concat(Character.toString(second.charAt(i)).toUpperCase(Locale.ROOT));
            }
            else{
                diff_first = diff_first.concat(Character.toString(first.charAt(i)));
                diff_second = diff_second.concat(Character.toString(second.charAt(i)));
            }
        }
        System.out.println("Anotacion: las cadenas se escriben en minusculas, el caracter _ se elimina de la entrada \n"
                            + "para señalar en la salida que una cadena es mas larga que la otra, las mayusculas \n"
                            + "se usan para señalar las diferencias entre las entradas");
        System.out.println("Respuesta:" + diff_first + " ------- " + diff_second);
    }
}
