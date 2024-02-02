package CHOICE;

import DELTA.Delta;
import PITAGORAS.Pitagoras;
import POTEGI.Potegi;
import PRIME.PrimeNum;

import java.util.Scanner;

public class Choice {

    Scanner scanner;
    int choice;

    public void doChoice(){
         scanner = new Scanner(System.in);

        System.out.println("1 - delta");
        System.out.println("2 - potêgi");
        System.out.println("3 - Twierdzenie Pitagorasa");
        System.out.println("4 - SprawdŸ czy liczba jest liczb¹ pierwsz¹");
         choice = scanner.nextInt();


        switch (choice) {
            case 1 -> new Delta();
            case 2 -> new Potegi();
            case 3 -> new Pitagoras();
            case 4 -> new PrimeNum();
            default -> {
                System.out.println("Wybierz numer miêdzy 1 a 4");
                doChoice();
            }
        }
    }


}
