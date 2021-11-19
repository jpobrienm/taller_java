package Ejercicio13;

import java.sql.Date;
import java.sql.SQLOutput;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio13 {
    public static void main(String[] args) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("(yyyy/MM/dd)");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("(HH:mm:ss)");
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("El tiempo actual es " + dateFormatter.format(date) + timeFormatter.format(time));
    }
}
