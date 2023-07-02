package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;

public class Scientific {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
    }


    public double sine(double userInput, boolean rad) {
        //sin function user inputs number and checks if it's on radian mode or not
        double result;
        if (rad) {
            result = Math.toRadians(userInput);
            return Math.sin(result);
        } else {
            result = Math.toDegrees(userInput);
            return Math.sin(result);
        }
    }

    public double cosine(double userInput, boolean rad) {
        double result;
        if (rad) {
            result = Math.toRadians(userInput);
            return Math.cos(result);
        } else {
            result = Math.toDegrees(userInput);
            return Math.cos(result);
        }

    }

    public double tan(double userInput, boolean rad) {
        double result ;
        if (rad) {
            result = Math.toRadians(userInput);
            return Math.tan(result);
        } else {
            result = Math.toDegrees(userInput);
            return Math.tan(result);
        }

    }

    public double inverseSine(double userInput, boolean rad) {
        double result;
        if (rad) {
            result = Math.toRadians(userInput);
            return Math.asin(result);
        } else {
            result = Math.toDegrees(userInput);
            return Math.asin(result);
        }
    }

    public double inverseCosine(double userInput, boolean rad) {
        double result ;
        if (rad) {
            result = Math.toRadians(userInput);
            return Math.acos(result);
        } else {
            result = Math.toDegrees(userInput);
            return Math.acos(result);
        }

    }

    public double inverseTan(double userInput, boolean rad) {
        double result ;
        if (rad) {
            result = Math.toRadians(userInput);
            return Math.atan(result);
        } else {
            result = Math.toDegrees(userInput);
            return Math.atan(result);
        }

    }

    public double log(double userInput) {
        double result;
        result = Math.log10(userInput);
        return result;
    }

    public double inverseLog(double userInput) {
        double result;
        result = Math.exp(Math.log(userInput));
        return result;
    }

    public double inverseNaturalLog(double userInput) {
        double result;
        result = Math.log(userInput);
        return Math.exp(result);
    }

    public double ln(double userInput) {
        double result;
        result = Math.log10(userInput);
        return result;
    }

    public double factorial(int userInput) {

        int fact = userInput;
        for (int i = 1; i <= fact; i++) {
            fact = fact * i;

        }
        return fact;
    }
}





