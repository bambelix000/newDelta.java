package DELTA;

import static DELTA.Obliczenia.delta;
import static DELTA.Obliczenia.d1;
import static DELTA.Obliczenia.d2;
import static DELTA.Obliczenia.x1;
import static DELTA.Obliczenia.x2;
import static DELTA.Obliczenia.x1s;
import static DELTA.Obliczenia.x2s;


public class Delta {
    Obliczenia obliczenia;

    public Delta(){
        obliczenia = new Obliczenia();
        System.out.println("Delta = b*b - 4ac = " + delta);

        System.out.println("D: {" + d1 + " ; " + d2 + "}");

        if (!x1s) {
            System.out.println("x1 = -b + pierwiastek delty / 2a " + x1);
        } else {
            System.out.println("x1 = -b + pierwiastek delty / 2a " + x1 + "(sprzecznoœæ)");
        }

        if (!x2s) {
            System.out.println("x2 = -b + pierwiastek delty / 2a " + x2);
        } else {
            System.out.println("x2 = -b + pierwiastek delty / 2a " + x2 + "(sprzecznoœæ)");
        }

        if (!x1s & !x2s) {
            System.out.println("xe {" + x1 + " ; " + x2 + "}");
        } else if (!x1s & x2s) {
            System.out.println("xe {" + x1 + "}");
        } else if (x1s & !x2s) {
            System.out.println("xe {" + x2 + "}");
        } else {
            System.out.println("x jest puste");
        }





    }

}
