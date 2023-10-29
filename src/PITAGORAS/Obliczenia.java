package PITAGORAS;


public class Obliczenia {
    double c;

    void Calculations(double a, double b){
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hypotenuse is equal to " + c);
    }
}
