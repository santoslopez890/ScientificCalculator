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
        double result = 0;
        if (rad == true) {
            result = Math.toRadians(userInput);
            return Math.sin(result);
        }
        else{
            result =Math.toDegrees(userInput);
            return Math.sin(result);
        }
    }
    public double cosine(double userInput, boolean rad) {
        double result = 0;
        if (rad == true) {
            result = Math.toRadians(userInput);
            return Math.cos(result);
        }
        else{
            result =Math.toDegrees(userInput);
            return Math.cos(result);
        }

    }

    public double tan(double userInput, boolean rad) {
        double result = 0;
        if (rad == true) {
            result = Math.toRadians(userInput);
            return Math.tan(result);
        }
        else{
            result =Math.toDegrees(userInput);
            return Math.tan(result);
        }

    }
    public double inversesine(double userInput, boolean rad) {
        double result = 0;
        if (rad == true) {
            result = Math.toRadians(userInput);
            return Math.asin(result);
        }
        else{
            result =Math.toDegrees(userInput);
            return Math.asin(result);
        }
    }
    public double inversecosine(double userInput, boolean rad) {
        double result = 0;
        if (rad == true) {
            result = Math.toRadians(userInput);
            return Math.acos(result);
        }
        else{
            result =Math.toDegrees(userInput);
            return Math.acos(result);
        }

    }
    public double inversetan(double userInput, boolean rad) {
        double result = 0;
        if (rad == true) {
            result = Math.toRadians(userInput);
            return Math.tan(result);
        }
        else{
            result =Math.toDegrees(userInput);
            return Math.atan(result);
        }

    }




}
