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








}
