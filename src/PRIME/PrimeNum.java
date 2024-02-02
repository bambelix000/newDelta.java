package PRIME;


import java.util.Scanner;

public class PrimeNum {
    Scanner scan;
    int num;
    public PrimeNum(){

        scan = new Scanner(System.in);

        System.out.println("Podaj liczbę do sprawdzenia");
        num = scan.nextInt();

        Algo.isPrimeNumber(num);


    }

}