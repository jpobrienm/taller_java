package Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        double x=Math.random();
        double y=Math.random();
        if (x < y) {
            System.out.println(x + " < " + y);
        }
        else if(x > y){
            System.out.println(x + " > " + y);
        }
        else {
            System.out.println(x + " = " + y);
        }
    }
}
