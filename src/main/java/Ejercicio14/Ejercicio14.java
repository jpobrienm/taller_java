package Ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        int number;
        int lineCount = 0;
        String answer = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero desde el cual desea iniciar: ");
        while (true){
            String str_number = scanner.nextLine();
            try {
                number = Integer.parseInt(str_number);
                if(number <= 1000){
                    for(int i=number; i<=1000; i=i+2){
                        if(i + 2 <= 1000){
                            answer = answer.concat(Integer.toString(i) + ", ");
                        }
                        else{
                            answer = answer.concat(Integer.toString(i) + ".");
                        }
                        lineCount++;
                        if(lineCount % 10 == 0){
                            answer = answer.concat("\n");
                            lineCount = 0;
                        }
                    }
                }
                else{
                    for(int i=number; i>=1000; i=i-2) {
                        if(i - 2 >= 1000){
                            answer = answer.concat(Integer.toString(i) + ", ");
                        }
                        else{
                            answer = answer.concat(Integer.toString(i) + ".");
                        }
                        lineCount++;
                        if (lineCount % 10 == 0) {
                            answer = answer.concat("\n");
                            lineCount = 0;
                        }
                    }
                }
                System.out.println("Los numeros entre " + number + " y 1000, en saltos de dos en dos son:");
                System.out.println(answer);
                break;
            }catch (Exception e){
                System.out.println("Error: Debes ingresar un numero entero");
            }
        }
    }
}
