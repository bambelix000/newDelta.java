package POTEGI;

import java.util.Scanner;

public class Obliczenia {
    Scanner scanner;

    static double a;
    static double b;
    static double c;

    Obliczenia(){
        scanner = new Scanner(System.in);
        System.out.println("Podaj postawê potêgi");
        a = scanner.nextDouble();
        System.out.println("Podaj wyk³adnik potêgi");
        b = scanner.nextDouble();

        c = Math.pow(a, b);
    }

}
