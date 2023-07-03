package com.zipcodewilmington.scientificcalculator;

import java.lang.Math;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class CoreMethods {
        public static void main(String[] args) {
        }
public static void run() {
    char operator;
    double number1, number2, result;
    boolean loop = true;
    // create an object of Scanner class to get input from user
    Scanner input = new Scanner(System.in);

    // ask users to enter operator
    while (loop) {
        System.out.println("Choose an operator: +, -, *, /\n"
                + "or choose 1:for Main Menu:\n"
                +"2:for x^2\n"
                +"3:for square root\n"
                +"4:for x^y\n"
                +"5:for (1/x)\n");

        operator = input.next().charAt(0);


        switch (operator) {

            // operator addition for both numbers
            case '+':
                System.out.println("Choose first number");
                number1 = input.nextDouble();

                System.out.println("Choose second number");
                number2 = input.nextDouble();

                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // operator subtraction for both numbers
            case '-':
                System.out.println("Choose first number");
                number1 = input.nextDouble();

                System.out.println("Choose second number");
                number2 = input.nextDouble();
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // operator multiplication for both numbers
            case '*':
                System.out.println("Choose first number");
                number1 = input.nextDouble();

                System.out.println("Choose second number");
                number2 = input.nextDouble();
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // operator division for both numbers
            case '/':
                System.out.println("Choose first number");
                number1 = input.nextDouble();

                System.out.println("Choose second number");
                number2 = input.nextDouble();
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            case '1':
                System.out.println("Main Menu");
                MainApplication main = new MainApplication();
                main.runMain();
                break;
            case '2':
                System.out.println("Choose first number");
                number1 = input.nextDouble();
                result = number1 * number1;
                System.out.println(number1 + "^2 " + " = " + result);
                break;
            case '3':
                System.out.println("Choose first number");
                number1 = input.nextDouble();
                result = sqrt(number1);
                System.out.println("sqrt of "+number1 + " = " + result);
                break;
            case '4':
                System.out.println("Choose first number");
                number1 = input.nextDouble();

                System.out.println("Choose second number");
                number2 = input.nextDouble();
                result = Math.pow(number1, number2);
                System.out.println(number1 + " ^ " + number2 + " = " + result);
                break;
            case '5':
                System.out.println("Choose first number");
                number1 = input.nextDouble();
                result = 1/number1;
                System.out.println(number1 + "1/" + number1 + " = " + result);
                break;


            // if incorrect value is chosen instead of provided operator
            default:
                System.out.println("Invalid operator!");
                break;
        }


    }
}
    }
