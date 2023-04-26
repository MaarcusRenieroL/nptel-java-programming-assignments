package week8;

import java.util.*;
public class programmingAssignment3 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = inr.nextInt();
        // Add the necessary code in the below space
        int sum=0, i, j, k;
        for(i =1 ; i <= n; i++) {
            for(j = 1; j <= n-i; j++)
                System.out.print("  ");
            for(k = 1;k <= (2*i)-1; k++) {
                sum += k;
                System.out.print(k+" ");
            }
            System.out.print("\n");
        }
        System.out.print(sum);
    }
}