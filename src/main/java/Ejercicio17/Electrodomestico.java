package Ejercicio17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Electrodomestico {
    private double precio_base = 100;
    private String color = "blanco";
    private char consumo_energetico = 'F';
    private double peso = 5;
    private final List<String> colores_disponibles = Arrays.asList("blanco", "negro", "rojo", "azul", "gris");
    private final List<Character> consumos_validos = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F');
    private final double[] precio_consumos= new double[]{100, 80, 60, 50, 30, 10};
    private final double[] pesos_base = new double[]{20, 50, 80};
    private final double[] precio_peso = new double[]{10, 50, 80, 100};

    public Electrodomestico(){
    }

    public Electrodomestico(double precio_base, double peso){
        this.precio_base = precio_base;
        this.peso = peso;
    }

    public Electrodomestico(double precio_base, String color, char consumo_energetico, double peso) {
        this.precio_base = precio_base;
        this.peso = peso;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumo_energetico);
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    public double getPeso() {
        return peso;
    }

    private void comprobarConsumoEnergetico(char letra){
        if(!consumos_validos.contains(letra)){
            return;
        }
        this.consumo_energetico = letra;
    }

    private void comprobarColor(String color){
        if(!colores_disponibles.contains(color)){
            return;
        }
        this.color = color;
    }

    public double precioFinal(){
        int tipo_consumo = consumos_validos.indexOf(consumo_energetico);
        double precio_consumo = precio_consumos[tipo_consumo];
        for(int i=0; i<pesos_base.length; i++){
            if(peso < pesos_base[i]){
                return precio_base + precio_consumo + precio_peso[i];
            }
        }
        return precio_base + precio_consumo + precio_peso[precio_peso.length - 1];
    }
}
