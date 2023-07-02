package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        // create an object of Scanner class to get input from user
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        // ask users to enter numbers to combine with operator that they chose
        System.out.println("Choose first number");
        number1 = input.nextDouble();

        System.out.println("Choose second number");
        number2 = input.nextDouble();

        switch (operator) {

            // operator addition for both numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // operator subtraction for both numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // operator multiplication for both numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // operator division for both numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            // if incorrect value is chosen instead of provided operator
            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}




