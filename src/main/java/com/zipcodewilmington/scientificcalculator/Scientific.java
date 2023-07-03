package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;
import java.util.Scanner;

public class Scientific {

    public static void main(String[] args) {

    }
public static void runScientfic () {
    Console.println("Welcome to our calculator!");


    int operator;
    Double number1, number2, result;
    boolean loop=true;

    // create an object of Scanner class to get input from user


    // ask users to enter operator

    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    //operator = input.nextInt();
    while (loop == true) {
        System.out.println("Choose an operator: \n1: is for main menu\n" +
                "2: is for(M+ key) Add the currently displayed value to the value in memory (store in memory and update display) *\n" +
                "3: is for(MC key) Reset memory *\n" +
                "4: is for(MRC key) Recall the current value from memory to the display *\n" +
                "5: is forSine - Calculate the sine of the displayed value and display it\n" +
                "6: is forCosine - Calculate the cosine of the displayed value and display it\n" +
                "7: is forTangent - Calculate the tangent of the displayed value and display it\n" +
                "8: is forInverse Sine\n" +
                "9: is forInverse Cosine\n" +
                "10: is forInverse Tangent\n" +
                "11: is for rotates between radians and degrees \n" +
                "12: is forLog\n" +
                "13: is for10x (inverse logarithm)\n" +
                "14: is forLn (natural logarithm)\n" +
                "15: is forex (inverse natural logarithm)\n" +
                "16: is forFactorial function\n"+
                "Display Value is "+ displayvalue);
                operator = input.nextInt();
        switch (operator) {


            // operator addition for both numbers
            case 1:
                MainApplication main = new MainApplication();
                main.runMain();
                break;
            case 2:
                memPlus();
                break;
            case 3:
                memClear();
                break;
            case 4:
                memRecall();
                break;
            case 5:
                System.out.println("Choose first number");
                number1 = input2.nextDouble();
                sine(number1,radTrueOrFalse);
                break;
            case 6:
                System.out.println("Choose first number");
                number1 = input2.nextDouble();
                cosine(number1,radTrueOrFalse);
                break;
            case 7:
                System.out.println("Choose first number");
                number1 = input2.nextDouble();
                tan(number1,radTrueOrFalse);
                break;
            case 8:
                System.out.println("Choose first number");
                number1 = input2.nextDouble();
                inverseSine(number1,radTrueOrFalse);
                break;
            case 9:
                System.out.println("Choose first number");
                number1 = input2.nextDouble();
                inverseCosine(number1,radTrueOrFalse);
                break;
            case 10:
                System.out.println("Choose first number");
                number1 = input2.nextDouble();
                inverseTan(number1,radTrueOrFalse);
                break;
            case 11:
                changeRad();
                break;
            case 12:
                System.out.println("Choose first number");
                number1 = input2.nextDouble();
                log(number1);
                break;
            case 13:
                System.out.println("Choose first number");
                number1 = input2.nextDouble();
                inverseLog(number1);
                break;
            case 14:
                System.out.println("Choose first number");
                number1 = input2.nextDouble();
                ln(number1);
                break;
            case 15:
                System.out.println("Choose first number");
                number1 = input2.nextDouble();
                inverseNaturalLog(number1);
                break;
            case 16:
                System.out.println("Choose first number");
                number1 = input2.nextDouble();
                factorial(number1);
                break;

            default:
                System.out.println("Invalid operator!");
                break;

        }


    }

}

public static boolean radTrueOrFalse = true;
    public static int i = 0;
    public static double displayvalue = 0.0;

    public static double mem = 0.0;

    public static boolean changeRad() {

        if (i == 0) {
            i += 1 ;
            radTrueOrFalse = false;
            System.out.println("set to radians");
        }
        else if (i == 1) {
            i-=1;
            radTrueOrFalse = true;
            System.out.println("set to degrees");
        }
        return radTrueOrFalse;
    }
    public static double memPlus() {
        mem=displayvalue;

        return mem;
    }
    public static double memClear() {
        mem=0.0;

        return mem;
    }
    public static double memRecall() {
        System.out.println("number on display "+mem+"\n");
        return mem;

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

    public static double factorial(double userInput) {

        double fact = userInput;
        for (int i = 1; i <= fact; i++) {
            fact = fact * i;

        }
        displayvalue = fact;
        return fact;
    }


}





