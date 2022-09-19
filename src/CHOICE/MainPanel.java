package CHOICE;

import DELTA.Delta;
import POTEGI.Potegi;
import PITAGORAS.Pitagoras;

public class MainPanel {


    public static void main(String[] args) {

        switch (Choice.choice) {
            case 1 -> new Delta();
            case 2 -> new Potegi();
            case 3 -> new Pitagoras();
            default -> System.out.println("1 lub 2 idioto");
        }

    }
}