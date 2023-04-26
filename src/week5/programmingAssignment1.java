package week5;

import java.util.Scanner;

public class programmingAssignment1 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        //Read any two values for a and b.

        System.out.print("Enter a : ");
        a = input.nextInt();

        System.out.print("Enter b : ");
        b = input.nextInt();

        //Get the result of a/b;

        try {
            int c = a/b;
            System.out.println("a / b = " + c);
        } catch(ArithmeticException c) {
            System.out.println("Exception caught: Division by zero.");
        }
    }
}