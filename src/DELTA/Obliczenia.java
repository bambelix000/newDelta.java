package DELTA;

import java.util.Scanner;

public class Obliczenia {
    Scanner scanner;
    private int a;
    private int b;
    private int c;
    static double delta;
    private double deltaPierwiastek;
    static double x1;
    static double x2;
    static double d1;
    static double d2;
    static boolean x1s;
    static boolean x2s;



    Obliczenia(){
        scanner = new Scanner(System.in);

        System.out.println("Podaj wspó³czynnik a");
        a = scanner.nextInt();
        System.out.println("Podaj wspó³czynnik b");
        b = scanner.nextInt();
        System.out.println("Podaj wspó³czynnik c");
        c = scanner.nextInt();

            delta = b*b -(4*a*c);
            deltaPierwiastek = Math.sqrt(delta);

            x1 = (-b+deltaPierwiastek) / (2*a);
            x2 = (-b-deltaPierwiastek) / (2*a);

        System.out.println("Podaj podcz¹tek dziedziny");
        d1 = scanner.nextDouble();
        System.out.println("Podaj koniec dziedziny");
        d2 = scanner.nextDouble();

        if(d1 <= x1 & x1 <= d2){
            x1s = false;
        }else{
            x1s = true;
        }

        if(d1 <= x2 & x2 <= d2){
            x2s = false;
        }else{
            x2s = true;
        }

    }


}
