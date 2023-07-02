package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;
import java.util.Scanner;

public class Scientific {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        //String s = Console.getStringInput("Enter a string");
        //Integer i = Console.getIntegerInput("Enter an integer");
       // Double d = Console.getDoubleInput("Enter a double.");

      //  Console.println("The user input %s as a string", s);
     //   Console.println("The user input %s as a integer", i);
     //   Console.println("The user input %s as a d", d);
        //testing functions
        boolean radTrueOrFalse = getInputRad();
        double answer = inverseTan(50,radTrueOrFalse);
        System.out.println(answer);
    }

    static boolean getInputRad() {

        return true;
    }
    public static double sine(double userInput, boolean rad) {
        //sin function user inputs number and checks if it's on radian mode or not
        double result;
        if (rad) {
            result = Math.toRadians(userInput);

        } else {
            result = Math.toDegrees(userInput);

        }
        return Math.sin(result);
    }

    public static double cosine(double userInput, boolean rad) {
        double result;
        if (rad) {
            result = Math.toRadians(userInput);

        } else {
            result = Math.toDegrees(userInput);

        }
        return Math.cos(result);
    }

    public static double tan(double userInput, boolean rad) {
        double result ;
        if (rad) {
            result = Math.toRadians(userInput);

        } else {
            result = Math.toDegrees(userInput);

        }
        return Math.tan(result);
    }

    public static double inverseSine(double userInput, boolean rad) {
        double result;
        if (rad) {
            result = Math.toRadians(userInput);
        } else {
            result = Math.toDegrees(userInput);
        }
        return Math.asin(result);
    }

    public static double inverseCosine(double userInput, boolean rad) {
        double result ;
        if (rad) {
            result = Math.toRadians(userInput);

        } else {
            result = Math.toDegrees(userInput);

        }
        return Math.acos(result);
    }

    public static double inverseTan(double userInput, boolean rad) {
        double result ;
        if (rad) {
            result = Math.toRadians(userInput);
        } else {
            result = Math.toDegrees(userInput);
        }
        return Math.atan(result);
    }

    public static double log(double userInput) {
        double result;
        result = Math.log10(userInput);
        return result;
    }

    public static double inverseLog(double userInput) {
        double result;
        result = Math.exp(Math.log(userInput));
        return result;
    }

    public static double inverseNaturalLog(double userInput) {
        double result;
        result = Math.log(userInput);
        return Math.exp(result);
    }

    public static double ln(double userInput) {
        double result;
        result = Math.log10(userInput);
        return result;
    }

    public static double factorial(int userInput) {

        int fact = userInput;
        for (int i = 1; i <= fact; i++) {
            fact = fact * i;

        }
        return fact;
    }
}





