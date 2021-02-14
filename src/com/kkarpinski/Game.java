package com.kkarpinski;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w grze zgadnij liczbę!");
        System.out.println("Podaj jaką liczbę od 0 do 10 wylosował komputer?");

        int rndNumber = random.nextInt(11);
        int i = 0;
        int usrNumber;

        do {
            usrNumber = scanner.nextInt();
            i++;

            if (rndNumber < usrNumber){
                System.out.println("Wylosowana liczba jest mniejsza. Podaj mniejszą liczbę.");
            }
            else if (rndNumber > usrNumber){
                System.out.println("Wylosowana liczba jest większa. Podaj większą liczbę.");
            }
            else if (rndNumber == usrNumber){
                System.out.println("Gratuacje! Liczba została przez Ciebie odgadnięta!");
                System.out.println("Udało Ci się odgadnąć liczbę za " + i + " razem!");
            }

        } while (usrNumber != rndNumber);



    }
}
