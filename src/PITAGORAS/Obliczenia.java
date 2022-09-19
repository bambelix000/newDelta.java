package PITAGORAS;

import java.util.Scanner;

public class Obliczenia {
    Scanner scanner;

    double a;
    double b;
    double c;

    Obliczenia(){
        scanner = new Scanner(System.in);
        System.out.println("Podaj a");
        a = scanner.nextDouble();
        System.out.println("Podaj b");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
