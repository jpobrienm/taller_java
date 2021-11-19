package Ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        int i=1;
        String pares = "Numeros Pares: ";
        String impares = "Numeros Impares: ";
        while(i <= 100){
            if (i %2 == 0){
                if (i + 2 > 100){
                    pares += i + ".";
                }
                else{
                    pares += i + ", ";
                }
            }
            else{
                if (i + 2 > 100){
                    impares += i + ".";
                }
                else{
                    impares += i + ", ";
                }
            }
            i ++;
        }
        System.out.println(impares);
        System.out.println(pares);
    }
}
