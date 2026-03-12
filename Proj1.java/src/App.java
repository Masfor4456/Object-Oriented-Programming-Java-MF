/*
Name: Mason Ford
Date: 2026
Assignment: Calculator Project - Week 1
Description: A console calculator that performs basic math operations.
*/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice = 0;

        System.out.println("---------------------------------");
        System.out.println("Console Calculator - Week 1");
        System.out.println("Created by Mason Ford");
        System.out.println("---------------------------------");

        System.out.println("Welcome to the Console Calculator!");

        while (choice != 5) {

            System.out.println("\nChoose an option:");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println("5 - Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter first number: ");
                double num1 = input.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = input.nextDouble();

                double result = 0;

                switch (choice) {

                    case 1:
                        result = num1 + num2;
                        System.out.println(num1 + " + " + num2 + " = " + result);
                        break;

                    case 2:
                        result = num1 - num2;
                        System.out.println(num1 + " - " + num2 + " = " + result);
                        break;

                    case 3:
                        result = num1 * num2;
                        System.out.println(num1 + " * " + num2 + " = " + result);
                        break;

                    case 4:
                        if (num2 == 0) {
                            System.out.println("Error: Cannot divide by zero.");
                        } else {
                            result = num1 / num2;
                            System.out.println(num1 + " / " + num2 + " = " + result);
                        }
                        break;
                }

            } else if (choice == 5) {

                System.out.println("\nThank you for using the calculator!");

            } else {

                System.out.println("Invalid option. Please choose 1-5.");
            }
        }

        input.close();
    }
}