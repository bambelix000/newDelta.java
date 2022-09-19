package CHOICE;

import java.util.Scanner;

public class Choice {
    Scanner scanner;
     public static int choice;


    Choice(){
        scanner = new Scanner(System.in);
        System.out.println("1 - delta");
        System.out.println("2 - potêgi");
        System.out.println("3 - Twierdzenie Pitagorasa");
        choice = scanner.nextInt();


    }

}
