package week8;

import java.util.*;
public class programmingAssignment1 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = inr.nextInt();
        // Add the necessary code in the below space
        int sum=0;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++)
                System.out.print("  ");
            for(int k=1;k<=(2*i)-1;k++) {
                System.out.print("* ");
                sum = sum + 1;
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}