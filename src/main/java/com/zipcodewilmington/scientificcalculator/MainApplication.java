package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        runMain();
        }
        public static void runMain(){
            Console.println("Welcome to our calculator!");
            char operator;

            // create an object of Scanner class to get input from user
            Scanner input = new Scanner(System.in);

            // ask users to enter operator

            System.out.println("Choose an operator: 1 for core features, 2 for scientific, 3 for special,");
            operator = input.next().charAt(0);
            switch (operator) {

                // operator addition for both numbers
                case '1':
                    CoreMethods core=new CoreMethods();
                    core.run();
                    break;
                case '2':
                    Scientific science=new Scientific();
                    science.runScientfic();
                    break;
                case '3':
                    System.out.println("Invalid operator!");
                    SpecialClass dog=new SpecialClass();
                    dog.printDog();
                    break;
                default:

            }

        }
    }


