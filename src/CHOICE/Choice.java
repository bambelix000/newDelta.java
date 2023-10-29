package CHOICE;

import DELTA.Delta;
import PITAGORAS.Pitagoras;
import POTEGI.Potegi;

import java.util.Scanner;

public class Choice {

    Scanner scanner;
    int choice;

    public void doChoice(){
         scanner = new Scanner(System.in);

        System.out.println("1 - delta");
        System.out.println("2 - potêgi");
        System.out.println("3 - Twierdzenie Pitagorasa");
         choice = scanner.nextInt();


        switch (choice) {
            case 1 -> new Delta();
            case 2 -> new Potegi();
            case 3 -> new Pitagoras();
            default -> {
                System.out.println("You were supposed to choose a number from 1 to 3.");
                doChoice();
            }
        }
    }


}
