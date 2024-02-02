package PRIME;

public class Algo {

    public static boolean x;
    public static void isPrimeNumber(int number) {

        x = false;
        if(number != 3 && number !=2) {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    x = false;
                    break;
                } else {
                    x = true;
                }
            }
        }else{
            x = true;
        }

        if(x){
            System.out.println(number + " jest liczbą pierwszą");
        }else{
            System.out.println(number + " nie jest liczbą pierwszą");
        }
    }
}
