package Ejercicio16;

import javax.xml.transform.Source;
import java.io.ObjectStreamException;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pivot_input;

        System.out.println("Bienvenido a la aduana de la republica de Sofka, a continuacion le haremos \n" +
                            "una serie de preguntas para finalizar su registro en nuestra base de datos");

        System.out.print("Introduzca su nombre: ");
        String nombre = scanner.nextLine();
        if (nombre.isEmpty()){nombre = nombre.concat("N.N.");}

        System.out.print("Introduzca su edad: ");
        pivot_input = scanner.nextLine();
        pivot_input = pivot_input.replaceAll("[^0-9]", "");
        if (pivot_input.isEmpty()){pivot_input = pivot_input.concat("0");}
        int edad = Integer.parseInt(pivot_input);

        System.out.print("Introduzca su sexo (H para hombre, M para mujer): ");
        pivot_input = scanner.nextLine();
        pivot_input = pivot_input.replace(" ", "");
        pivot_input = pivot_input.concat("H");
        char sexo = pivot_input.charAt(0);

        System.out.print("Introduzca su peso en kilogramos: ");
        pivot_input = scanner.nextLine();
        pivot_input = pivot_input.replaceAll("[^0-9,.]", "");
        pivot_input = pivot_input.replace(",", ".");
        if (pivot_input.isEmpty()){pivot_input = pivot_input.concat("0");}
        double peso = Double.parseDouble(pivot_input);

        System.out.print("Introduzca su altura en metros: ");
        pivot_input = scanner.nextLine();
        pivot_input = pivot_input.replaceAll("[^0-9,.]", "");
        pivot_input = pivot_input.replace(",", ".");
        if (pivot_input.isEmpty()){pivot_input = pivot_input.concat("0");}
        double altura = Double.parseDouble(pivot_input);

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);

        Persona persona3 = new Persona();
        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setSexo(sexo);
        persona3.setPeso(peso);
        persona3.setAltura(altura);

        int imc1 = persona1.calcularIMC();
        int imc2 = persona2.calcularIMC();
        int imc3 = persona3.calcularIMC();
        System.out.println("\n---------------------------------\n");
        int [] imc_array = new int[]{imc1, imc2, imc3};
        for(int imc: imc_array){
            switch (imc){
                case -2:
                    System.out.println("No hay informacion para calcular el IMC");
                    break;
                case -1:
                    System.out.println("La persona se encuentra baja de peso");
                    break;
                case 0:
                    System.out.println("La persona se encuentra bien de peso");
                    break;
                case 1:
                    System.out.println("IMC: " + imc + "," + "La persona se encuentra con sobrepeso");
                    break;
            }
        }

        System.out.println("\n---------------------------------\n");

        boolean esMayor1 = persona1.esMayorDeEdad();
        boolean esMayor2 = persona2.esMayorDeEdad();
        boolean esMayor3 = persona3.esMayorDeEdad();
        boolean [] esMayor_array = new boolean[]{esMayor1, esMayor2, esMayor3};

        for(boolean esMayor: esMayor_array){
            if(esMayor) System.out.println("Es mayor de edad");
            else System.out.println("No es mayor de edad");
        }

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
    }
}
