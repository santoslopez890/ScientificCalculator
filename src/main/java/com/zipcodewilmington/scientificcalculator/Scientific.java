package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;

public class Scientific {

    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");

        sine(50, radTrueOrFalse);
        System.out.println(displayvalue);
        sine(50, changeRad());
        System.out.println(displayvalue);
        sine(50, changeRad());

        System.out.println(displayvalue);
        cosine(50, changeRad());
        System.out.println(displayvalue);
        cosine(50, changeRad());
        System.out.println(displayvalue);
        System.out.println(displayvalue);


    }

    public static boolean radTrueOrFalse = true;
    public static int i = 0;
    public static double displayvalue = 0.0;

    public static boolean changeRad() {

        if (i == 0) {
            i += 1 ;
            radTrueOrFalse = false;
        }
        else if (i == 1) {
            i-=1;
            radTrueOrFalse = true;
        }
        return radTrueOrFalse;
    }




    public static double sine(double userInput,boolean rad) {
        //sin function user inputs number and checks if it's on radian mode or not
        double result;
        if (rad) {
            result = Math.toRadians(userInput);

        } else {
            result = Math.toDegrees(userInput);

        }
        displayvalue = Math.sin(result);
        return Math.sin(result);
    }

    public static double cosine(double userInput, boolean rad) {
        double result;
        if (rad) {
            result = Math.toRadians(userInput);

        } else {
            result = Math.toDegrees(userInput);

        }
        displayvalue = Math.cos(result);
        return Math.cos(result);
    }

    public static double tan(double userInput, boolean rad) {
        double result ;
        if (rad) {
            result = Math.toRadians(userInput);

        } else {
            result = Math.toDegrees(userInput);

        }
        displayvalue = Math.tan(result);
        return Math.tan(result);
    }

    public static double inverseSine(double userInput, boolean rad) {
        double result;
        if (rad) {
            result = Math.toRadians(userInput);
        } else {
            result = Math.toDegrees(userInput);
        }
        displayvalue = Math.asin(result);
        return Math.asin(result);
    }

    public static double inverseCosine(double userInput, boolean rad) {
        double result ;
        if (rad) {
            result = Math.toRadians(userInput);

        } else {
            result = Math.toDegrees(userInput);

        }
        displayvalue = Math.acos(result);
        return Math.acos(result);
    }

    public static double inverseTan(double userInput, boolean rad) {
        double result ;
        if (rad) {
            result = Math.toRadians(userInput);
        } else {
            result = Math.toDegrees(userInput);
        }
        displayvalue = Math.atan(result);
        return Math.atan(result);
    }

    public static double log(double userInput) {
        double result;
        result = Math.log10(userInput);
        displayvalue = result;
        return result;
    }

    public static double inverseLog(double userInput) {
        double result;
        result = Math.exp(Math.log(userInput));
        displayvalue = result;
        return result;
    }

    public static double inverseNaturalLog(double userInput) {
        double result;
        result = Math.log(userInput);
        displayvalue = Math.exp(result);
        return Math.exp(result);
    }

    public static double ln(double userInput) {
        double result;
        result = Math.log10(userInput);
        displayvalue = Math.log10(result);
        return result;
    }

    public static double factorial(int userInput) {

        int fact = userInput;
        for (int i = 1; i <= fact; i++) {
            fact = fact * i;

        }
        displayvalue = fact;
        return fact;
    }


}





