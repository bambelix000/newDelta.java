package PITAGORAS;

import java.util.Scanner;

public class Pitagoras {

    Scanner scanner;
    Obliczenia obliczenia = new Obliczenia();

    double a, b;

    public Pitagoras(){
        scanner = new Scanner(System.in);
        System.out.println("Input a");
        a = scanner.nextDouble();
        System.out.println("Input b");
        b = scanner.nextDouble();

        obliczenia.Calculations(a, b);
    }
}
