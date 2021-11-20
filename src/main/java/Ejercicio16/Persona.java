package Ejercicio16;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private String dni;
    private char sexo = 'H';
    private final List<Character> feasible_sex = Arrays.asList('H', 'M');
    private double peso = 0;
    private double altura = 0;
    private double imc;
    private boolean esMayor;
    private final String alphabet = "TRWAGMYFPDXBNJZSQVHLCKE";

    public Persona(){
        generaDNI();
    }

    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        comprobarSexo(sexo);
        generaDNI();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = Character.toUpperCase(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC(){
        if(peso == 0 || altura == 0){
            imc = 0;
            return -2;
        }
        else{
            imc = peso / (altura * altura);
            if(imc < 20){
                return -1;
            }
            else if(20 <= imc && imc <= 25){
                return 0;
            }
            else{
                return 1;
            }
        }
    }

    public boolean esMayorDeEdad(){
        esMayor = edad >17;
        return (edad >17);
    }

    // como sexo es una variable que siempre está definida, considero mejor definir el metodo sin variable de
    // entrada
    public void comprobarSexo(char sexo){
        if(!feasible_sex.contains(sexo)){
            return;
        }
        this.sexo = sexo;
    }

    // realicé pequeños cambios al metodo toString para hacerlo mas estetico dada la situacion especifica de
    // este ejercicio
    @Override
    public String toString() {
        return "\n-------------------------------\n" +
                "Clase Persona \n" +
                "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "DNI: " + dni + "\n" +
                "Sexo: " + sexo + "\n" +
                "Peso: " + peso + "\n" +
                "Altura: " + altura + "\n" +
                "IMC: " + imc + "\n" +
                "Mayor de edad: " + esMayor + "\n" +
                "-------------------------------";
    }

    private void generaDNI(){
        Random random = new Random();
        int number_dni = random.nextInt(100000000);
        int residue = number_dni % 23;
        String char_dni = String.valueOf(alphabet.charAt(residue));
        dni = number_dni + char_dni;
    }
}
