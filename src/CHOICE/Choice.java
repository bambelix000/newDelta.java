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
        System.out.println("2 - pot�gi");
        System.out.println("3 - Twierdzenie Pitagorasa");
        System.out.println("4 - Sprawd� czy liczba jest liczb� pierwsz�");
         choice = scanner.nextInt();


        switch (choice) {
            case 1 -> new Delta();
            case 2 -> new Potegi();
            case 3 -> new Pitagoras();
            case 4 -> new PrimeNum();
            default -> {
                System.out.println("Wybierz numer mi�dzy 1 a 4");
                doChoice();
            }
        }
    }


}
