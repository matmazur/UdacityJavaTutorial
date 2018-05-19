package com.company;

import java.util.Random;

public class Main2 {
    public static void main(String[] args) {


        System.out.println(monopolyRoll());
    }

    public static int monopolyRoll(){

        int dice1 = new Random().nextInt(6)+1;
        int dice2 = new Random().nextInt(6)+1;
        int result = dice1+dice2;

        System.out.println("dice 1 = " + dice1);
        System.out.println("dice 2 = " + dice2);

        if (dice1==dice2) {
            System.out.println("ROLLED DOUBLE");
            return monopolyRoll()+result;
        }
        else
            return result;


    }
}
