package CHOICE;

import DELTA.Delta;
import POTEGI.Potegi;

public class MainPanel {


    public static void main(String[] args) {

        var choice = new Choice();



        switch(choice.choice){
            case 1:
                new Delta();
                break;
            case 2:
                new Potegi();
                break;

            default:
                System.out.println("1 lub 2 idioto");

        }

    }
}