package Ejercicio15;

import java.util.*;

public class Ejercicio15 {

    static void displayMenu(String menu){
        String input;
        String[] recursive_options = {"1", "2", "3", "4", "5", "6", "7"};
        System.out.println(menu);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Respuesta: ");
        input = scanner.nextLine();
        switch (input){
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
                displayMenu(menu);
                break;
            case "8":
                System.out.println("\n \n SALIENDO DEL MENU.. \n \n");
                break;
            default:
                System.out.println("\n \n OPCION INCORRECTA \n \n");
                displayMenu(menu);
        }
    }

    public static void main(String[] args) {
        String menu = "****** GESTION CINEMATOGRAFICA ******** \n1-NUEVO ACTOR\n" +
                        "2-BUSCAR ACTOR\n" +
                        "3-ELIMINAR ACTOR\n" +
                        "4-MODIFICAR ACTOR\n" +
                        "5-VER TODOS LOS ACTORES\n" +
                        "6- VER PELICULAS DE LOS ACTORES\n" +
                        "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                        "8-SALIR";
        displayMenu(menu);
    }
}
