package DELTA;


public class Obliczenia {
    double x1, x2, delta;
    public void kwadratowa(double a, double b, double c){
        delta = (b*b) - (4*a*c);

        if(delta<0){
            System.out.println("Contradiction");
        }else if(delta > 0){
            x1 = (-b + Math.sqrt(delta))/2*a;
            x2 = (-b - Math.sqrt(delta))/2*a;

            System.out.println("We got 2 results x1 = " + x1 + " and x2 = "+x2);
        }else{
           x2 = x1 = -b / 2*a;
            System.out.println("We got 2 identical results x1 = x2 = " + x1 );
        }
    }





}
