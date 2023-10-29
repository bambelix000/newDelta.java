package DELTA;


import java.util.Scanner;

public class Delta {
    Scanner scanner;
    double a, b, c;


    Obliczenia obliczenia = new Obliczenia();

    public Delta(){
        scanner = new Scanner(System.in);


        System.out.println("input a");
        a = scanner.nextInt();
        System.out.println("input b");
        b = scanner.nextInt();
        System.out.println("input c");
        c = scanner.nextInt();

        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("identity");
                }else{
                    System.out.println("Contradiction");
                }
            }else{
                System.out.println("We got 1 result x = " + (-c/b));
            }
        }else{
            obliczenia.kwadratowa(a, b, c);
        }








    }

}
