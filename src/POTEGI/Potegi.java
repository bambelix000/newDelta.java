package POTEGI;

import java.util.Scanner;


public class Potegi {

    Obliczenia obliczenia;
    Scanner scanner;

    double a, b;

    public Potegi(){
        obliczenia = new Obliczenia();

        scanner = new Scanner(System.in);
        System.out.println("Podaj postaw� pot�gi");
        a = scanner.nextDouble();
        System.out.println("Podaj wyk�adnik pot�gi");
        b = scanner.nextDouble();

        obliczenia.Calculations(a, b);


    }
}


