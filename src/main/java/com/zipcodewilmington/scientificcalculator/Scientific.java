package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;
import java.util.Scanner;

public class Scientific {

    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");




    }
public static void runScientfic () {
    Console.println("Welcome to our calculator!");
    /*sine(50, radTrueOrFalse);
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
    */

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

                "2: is forswitchDisplayMode() should rotate through the options\n" +
                "3: is forswitchDisplayMode(String mode) should set the display to the mode given\n" +
                "4: is for(M+ key) Add the currently displayed value to the value in memory (store in memory and update display) *\n" +
                "5: is for(MC key) Reset memory *\n" +
                "6: is for(MRC key) Recall the current value from memory to the display *\n" +
                "7: is forSine - Calculate the sine of the displayed value and display it\n" +
                "8: is forCosine - Calculate the cosine of the displayed value and display it\n" +
                "9: is forTangent - Calculate the tangent of the displayed value and display it\n" +
                "10: is forInverse Sine\n" +
                "11: is forInverse Cosine\n" +
                "12: is forInverse Tangent\n" +
                "13: is forswitchUnitsMode() should rotate through the options\n" +
                "14: is forswitchUnitsMode(String mode) should set the trig units to the type given\n" +
                "15: is forLog\n" +
                "16: is for10x (inverse logarithm)\n" +
                "17: is forLn (natural logarithm)\n" +
                "18: is forex (inverse natural logarithm)\n" +
                "19: is forFactorial function\n"+
                "20 is for main menu");
                operator = input.nextInt();
        switch (operator) {


            // operator addition for both numbers
            case 1:
                MainApplication main = new MainApplication();
                MainApplication.runMain();
                break;
            case 2:


                break;
            case 3:

                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                System.out.println("Choose first number");
                number1 = input2.nextDouble();
                sine(number1,radTrueOrFalse);
                break;
            case 8:
                System.out.println("Choose first number");
                number1 = input2.nextDouble();
                cosine(number1,radTrueOrFalse);
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
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





