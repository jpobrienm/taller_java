package Ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        double x=0, y=0;
        boolean isDone = false;
        Scanner scanner = new Scanner(System.in);
        while(!isDone){
            try{
                System.out.print("Ingrese el primer numero (para introducir decimales utilice punto): ");
                x = Double.parseDouble(scanner.nextLine());
                System.out.print("Ingrese el segundo numero (para introducir decimales utilice punto): ");
                y = Double.parseDouble(scanner.nextLine());
                isDone = true;
            } catch (Exception e){
                System.out.println("Recuerda usar punto para separar decimales");
            }
        }
        if (x > y){
            System.out.println(x + " > " + y);
        }
        else if (x < y){
            System.out.println(x + " < " + y);
        }
        else{
            System.out.println(x + " = " + y);
        }
    }
}
