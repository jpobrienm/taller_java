package Ejercicio6;

public class Ejercicio6 {
    public static void main(String[] args) {
        String impares = "Numeros Impares: ";
        String pares = "Numeros Pares: ";
        for(int i=1;i<=100;i++){
            if(i%2==0){
                if(i+2>100){
                    pares += i + ".";
                }
                else{
                    pares += i + ", ";
                }
            }
            else{
                if(i+2>100){
                    impares += i + ".";
                }
                else{
                    impares += i + ", ";
                }
            }
        }
        System.out.println(impares);
        System.out.println(pares);
    }
}
