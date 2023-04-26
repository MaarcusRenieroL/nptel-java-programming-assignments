package week8;

import java.util.*;
public class programmingAssignment2 {
    public static void main(String[] args) {

        Scanner inr = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int l = inr.nextInt();
        // Add the necessary code in the below space
        for(int i = 1; i <= l; i++) {
            for(int j = 1;j <= l-i; j++)
                System.out.print(" ");
            for(int j = 1; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}