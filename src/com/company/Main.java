package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

       printTemp(70);



    }
    public static double fahrenheitToCelsius(double temp){

        //main calculation
        //@param is temperature in Fahrenheit
        //@return will give temperature in Celsius
        double celsius = (temp-32)*5/9;
         return celsius;
    }

    public static void printTemp (double temp){

        // Prints both temperatures in F and C taking the
        //@param of Fahrenheit
        System.out.println("F: " + temp);
        System.out.println("C: "+ fahrenheitToCelsius(temp));
    }
}
