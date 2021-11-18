package Ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        int i=1;
        String pares = "";
        String impares = "";
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
        System.out.println("Los numeros impares entre 1 y 100 son: " + impares);
        System.out.println("Los numeros pares entre 1 y 100 son: "+ pares);
    }
}
